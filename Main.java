package com.company;

import com.company.Misc.SimpleSqlConnector;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/* DARIOPATCH
Átgondolni, hogy mi legyen az autoequippel. Az interface miatt már könnyen lehet, hogy teljesen máshogy kell megoldani. Weapontól független a lekérés
ezért könnyen lehet h nem kell se az addWeapon se sok más.

fix class equipper and the new weapon based class.

 */


/*More interesting mobs
*THERE CAN BE ONLY ONE SKELETON
* balance and health
* Sets could have level numbers which would increase difficulty
* After reaching level 12, you could Ascend(win)
* BUGS
* You lose your weapons when you die | this could be solved with updating the weapons in the DB
* */
public class Main {//ANSI CODES
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    static boolean CharacterIsALive = true;
    static boolean previousCharLoaded = false;
    static boolean characterIsAscended = false;
    public static int ChampChoice;

    public static void main(String[] args) {


        new GameInitialization().Intro(); //Text and flavour
        new LoadPreviousState(); //load a champ if exists
        if (previousCharLoaded == false) {
            new Main().Builder(); //Reading in text //Building champ values and loading them in
            new StatUpdate().HealUp();
        }
        while (Champion.getCurrentHealth() > 0 && CharacterIsALive == true) {//Itt folyik a játék tulajdonképp
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (java.lang.InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            new Sets().Randomizer(); //Randomize the setting you appear in
            //Randomize an enemy and Fight
            new Main().afterFight();

        }
        new DBUpdaters().afterChampDeath(Champion.getChampName());
    }

    public void Builder() {
        System.out.println("Please choose your class");
        System.out.println("1) Barbarian, 2) Necromancer, 3) Ranger");
        Scanner ChampReader = new Scanner(System.in);
        ChampChoice = ChampReader.nextInt();
        if (ChampChoice == 1) {
            System.out.println("You have chosen the Barbarian");
            Champion.setChampClass("Barbarian");
            new BuildChamp(ChampChoice);
            new DBUpdaters().champClassUpdater(Champion.getChampClass());
        } else if (ChampChoice == 2) {
            System.out.println("You have chosen the Necromancer");
            Champion.setChampClass("Necromancer");
            new BuildChamp(ChampChoice);
            new DBUpdaters().champClassUpdater(Champion.getChampClass());
        } else if (ChampChoice == 3) {
            System.out.println("You have chosen the Ranger");
            Champion.setChampClass("Ranger");
            new BuildChamp(ChampChoice);
            new DBUpdaters().champClassUpdater(Champion.getChampClass());
        } else {
            System.out.println("Please choose a number between 1 and 3");
        }
    }//reads the class

    public void afterFight() {
        if (CharacterIsALive == false || characterIsAscended == true) {//when he or she dies
            if (previousCharLoaded == false) { //if we didn't load the champ in the first place
                new SimpleSqlConnector().Connect(); //we create it
            } else {//OR
                new SimpleSqlConnector().Connect(Champion.getChampName());//we update it based on the name
            }
            return;
        }//If he dies he dies, if he wins he wins
        new Inventory().AutoEquip();//ez miért is nem fut le ha halott?
        StatUpdate.emergencyHealUp(Champion.getCurrentHealth());
        Ascend.ReadyToLevel();
    }
}