package com.company;

public class Ascend {
    static int Level1 = 100;
    static int Level2 = 200;
    static int Level3 = 400;
    static int Level4 = 600;
    static int Level5 = 1000;
    static int Level6 = 1200;
    static int Level7 = 1400;
    static int Level8 = 1800;
    static int Level9 = 2600;
    static int Level10 = 5000;
    static int Level11 = 7500;
    static int Level12 = 10000;
    static int Level13 = 12500;//this should be the end of game


    void LevelUp(){

    }
    static void AcquireXP(int XP){
        Champion.setXP(Champion.getXP() + XP);
    }
    static void ReadyToLevel(){
        if(Main.CharacterIsALive == true){
             if(Champion.getChampionLevel() == 0 && Champion.getXP() > Level1  ){
                new Ascend().levelUpStatMod(1,50);
                Champion.setChampionLevel(1);
                new Ascend().LevelUpAutomation();
            }
           if(Champion.getChampionLevel() == 1 && Champion.getXP() > Level2  ){
               new Ascend().levelUpStatMod(1,50);
                Champion.setChampionLevel(2);
                new Ascend().LevelUpAutomation();
            }
        if(Champion.getChampionLevel() == 2 && Champion.getXP() > Level3  ){
            new Ascend().levelUpStatMod(1,50);
                Champion.setChampionLevel(3);
                new Ascend().LevelUpAutomation();

            }
            if(Champion.getChampionLevel() == 3 && Champion.getXP() > Level4 ){
                new Ascend().levelUpStatMod(1,30);
                Champion.setChampionLevel(4);
                new Ascend().LevelUpAutomation();

            }
           if(Champion.getChampionLevel() == 4 && Champion.getXP() > Level5  ){
               new Ascend().levelUpStatMod(1,30);
                Champion.setChampionLevel(5);
                new Ascend().LevelUpAutomation();

            }
           if(Champion.getChampionLevel() == 5 && Champion.getXP() > Level6  ){
               new Ascend().levelUpStatMod(1,10);
                Champion.setChampionLevel(6);
                new Ascend().LevelUpAutomation();

            }
          if(Champion.getChampionLevel() == 6 && Champion.getXP() > Level7  ){
              new Ascend().levelUpStatMod(1,10);
                Champion.setChampionLevel(7);
                new Ascend().LevelUpAutomation();

            }
            if(Champion.getChampionLevel() == 7 && Champion.getXP() > Level8  ){
                new Ascend().levelUpStatMod(1,10);
                Champion.setChampionLevel(8);
                new Ascend().LevelUpAutomation();

            }
            if(Champion.getChampionLevel() == 8 && Champion.getXP() > Level9  ){
                new Ascend().levelUpStatMod(1,10);
                Champion.setChampionLevel(9);
                new Ascend().LevelUpAutomation();
            }
             if(Champion.getChampionLevel() == 9 && Champion.getXP() > Level10  ){
                 new Ascend().levelUpStatMod(1,10);
                Champion.setChampionLevel(10);
                new Ascend().LevelUpAutomation();

            }
            if(Champion.getChampionLevel() == 10 && Champion.getXP() > Level11  ){
                new Ascend().levelUpStatMod(1,10);
                Champion.setChampionLevel(11);
                new Ascend().LevelUpAutomation();

            }
            if(Champion.getChampionLevel() == 11 && Champion.getXP() > Level12  ){
                new Ascend().levelUpStatMod(1,10);
                Champion.setChampionLevel(12);
                new Ascend().LevelUpAutomation();

                if(Champion.getChampionLevel() == 12 && Champion.getXP() > Level3){
                    Main.characterIsAscended = true;
                    System.out.println("Congratulations, you are THE HERO");
                }

            }
        }
    }
        void LevelUpAutomation() {
            new MobLeveler().MobLevelUp();
            System.out.println("You are level "+Champion.getChampionLevel()+" now. Will you make it?");}

        void levelUpStatMod(int statUp, int healthUp){
            Champion.setBaseDefence(Champion.getBaseDefence() + statUp);
            Champion.setBaseDamage(Champion.getBaseDamage() + statUp);
            Champion.setBaseHitChance(Champion.getBaseHitChance() + statUp);
            Champion.setBaseArmor(Champion.getBaseArmor() + statUp);
            Champion.setBaseCritChance(Champion.getBaseCritChance() +statUp);
            Champion.setBaseHealth(Champion.getBaseHealth() + healthUp);
            Champion.setMaxHealth(Champion.getMaxHealth() +healthUp);
        }

    }