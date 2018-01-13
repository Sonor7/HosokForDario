package com.company;
import java.util.concurrent.ThreadLocalRandom;

public class Sets {
    public static int setting;
    public static int TowerLevel = 3;
    public void Randomizer(){
        setting = ThreadLocalRandom.current().nextInt(1,5);//nem megy a shopba, mert a bound helyesen bound + 1 kéne legyen.
        //System.out.println(setting);
        if (setting == 1){
            System.out.println(Main.ANSI_RED+"You enter a dark Cave"+Main.ANSI_RESET);
            /*new FightMain();*/
            new Fight().FightMain();
        }
        else if (setting == 2){
            System.out.println(Main.ANSI_GREEN+"You take a long rest in a Pub, where you forget about your wounds"+Main.ANSI_RESET);
            StatUpdate.HealUp();
        }
        else if (setting == 3){
            System.out.println(Main.ANSI_RED+"You enter a deep, dark Forest"+Main.ANSI_RESET);
            /*new FightMain();*/
            new Fight().FightMain();
        }
        else if (setting == 4){
            Fight.LootDifficulty = 40;
            new MobLeveler().TowerLeveler();
            System.out.println(Main.ANSI_RED+"You have found a Tower. It has " + TowerLevel + " levels. Prepare for a long battle"+Main.ANSI_RESET);
            boolean towerIsDone = false;
            while (Main.CharacterIsALive == true && towerIsDone == false) {
                Fight.LootDifficulty = 60;
                for (int i = 1; i <= TowerLevel; i++) {
                        System.out.println("This is the " + i + "th level of this tower.");
                        new Fight().FightMain();
                        if (Main.CharacterIsALive == false){return;}
                }
                towerIsDone = true;
            }
            if(Main.CharacterIsALive==true) {
                Randomizer(1);//So the hero rests after a tower
            }
        }
        else if (setting == 5){
            System.out.println("Shop");
        }
    }
    public void Randomizer(int set){
            if (set == 1){
            System.out.println(Main.ANSI_GREEN+"You take a long rest in a Pub after the tower, where you forget about your wounds"+Main.ANSI_RESET);
            StatUpdate.HealUp();
            }
            if (set == 2){
                StatUpdate.HealUp();
            }
}
}
