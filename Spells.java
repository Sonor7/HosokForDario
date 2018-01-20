package com.company;

public class Spells {

    static int petExistence;

    public static void Cast(String spellName){
        spellPrinter();
        String siphonLife = "SiphonLife";
        String summonSkeleton ="SummonSkeleton";
        spellName = spellName.replace(" ", "");
        if (spellName.equals("Curse") || spellName.equals("1")){curse(); }//deal dmg
        else if (spellName.equalsIgnoreCase(siphonLife) || spellName.equals("2")){siphonLife();}//deal less dmg, heal self
        else if (spellName.equals(summonSkeleton)|| spellName.equals("3")){ summonSkeleton();}
        else if (spellName.equals("Blind")){}//lower attack
        else if (spellName == "Resurrect Self"){}//if dies in this battle, resurrect
        else if (spellName == "Kill"){}//kill dude outright, for testing
        /*else if (spellName == ""){}
        else if (spellName == ""){}
        else if (spellName == ""){}
   */    else {System.out.println("Wrong spell name");}
    }
    static void curse(){
        int damage = Champion.getChampionLevel() + Champion.getTotalDamage()*2;
        MobRandomizer.EnemyCurrentHealth = MobRandomizer.EnemyCurrentHealth - damage;
        System.out.println("You extend your left hand and curse the "+MobRandomizer.MobName +" for "+damage+" damage");

    }
    static void siphonLife(){
        int siphoned = Champion.getChampionLevel() + Champion.getTotalDamage();
        MobRandomizer.EnemyCurrentHealth = MobRandomizer.EnemyCurrentHealth - siphoned;
        Champion.setCurrentHealth(Champion.getCurrentHealth() + Champion.getChampionLevel() + siphoned);
        System.out.println("You extend your left hand and sphifon the life out of the "+MobRandomizer.MobName+" for "+siphoned+" and heal yourself with it");

    }
    static void summonSkeleton(){
        System.out.println("You summon your trusty skeleton");
        Spells.petExistence = 3 + Champion.getChampionLevel();
        //create skeleton object (use regular skelly)
        new Pet("Skeleton",10,10,10);
        //for x next turn
        /*for (int i = 0; i < petExistence; petExistence--){
        }*/

        //when necro attacks, the skeleton deals dmg too
    }
    static void spellPrinter(){
        System.out.println("Curse(1)");
        System.out.println("Siphon Life(2)");
        System.out.println("Summon Skeleton(3)");
    }
}
