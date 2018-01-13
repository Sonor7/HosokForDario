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
        BuildChamp.XP = BuildChamp.XP + XP;
    }
    static void ReadyToLevel(){
        if(Main.CharacterIsALive == true){
             if(BuildChamp.ChampionLevel == 0 && BuildChamp.XP > Level1  ){
                new Ascend().levelUpStatMod(1,50);
                BuildChamp.ChampionLevel = 1;
                new Ascend().LevelUpAutomation();
            }
           if(BuildChamp.ChampionLevel == 1 && BuildChamp.XP > Level2  ){
               new Ascend().levelUpStatMod(1,50);
                BuildChamp.ChampionLevel = 2;
                new Ascend().LevelUpAutomation();
            }
        if(BuildChamp.ChampionLevel == 2 && BuildChamp.XP > Level3  ){
            new Ascend().levelUpStatMod(1,50);
                BuildChamp.ChampionLevel = 3;
                new Ascend().LevelUpAutomation();

            }
            if(BuildChamp.ChampionLevel == 3 && BuildChamp.XP > Level4 ){
                new Ascend().levelUpStatMod(1,30);
                BuildChamp.ChampionLevel = 4;
                new Ascend().LevelUpAutomation();

            }
           if(BuildChamp.ChampionLevel == 4 && BuildChamp.XP > Level5  ){
               new Ascend().levelUpStatMod(1,30);
                BuildChamp.ChampionLevel = 5;
                new Ascend().LevelUpAutomation();

            }
           if(BuildChamp.ChampionLevel == 5 && BuildChamp.XP > Level6  ){
               new Ascend().levelUpStatMod(1,10);
                BuildChamp.ChampionLevel = 6;
                new Ascend().LevelUpAutomation();

            }
          if(BuildChamp.ChampionLevel == 6 && BuildChamp.XP > Level7  ){
              new Ascend().levelUpStatMod(1,10);
                BuildChamp.ChampionLevel = 7;
                new Ascend().LevelUpAutomation();

            }
            if(BuildChamp.ChampionLevel == 7 && BuildChamp.XP > Level8  ){
                new Ascend().levelUpStatMod(1,10);
                BuildChamp.ChampionLevel = 8;
                new Ascend().LevelUpAutomation();

            }
            if(BuildChamp.ChampionLevel == 8 && BuildChamp.XP > Level9  ){
                new Ascend().levelUpStatMod(1,10);
                BuildChamp.ChampionLevel = 9;
                new Ascend().LevelUpAutomation();
            }
             if(BuildChamp.ChampionLevel == 9 && BuildChamp.XP > Level10  ){
                 new Ascend().levelUpStatMod(1,10);
                BuildChamp.ChampionLevel = 10;
                new Ascend().LevelUpAutomation();

            }
            if(BuildChamp.ChampionLevel == 10 && BuildChamp.XP > Level11  ){
                new Ascend().levelUpStatMod(1,10);
                BuildChamp.ChampionLevel = 11;
                new Ascend().LevelUpAutomation();

            }
            if(BuildChamp.ChampionLevel == 11 && BuildChamp.XP > Level12  ){
                new Ascend().levelUpStatMod(1,10);
                BuildChamp.ChampionLevel = 12;
                new Ascend().LevelUpAutomation();

                if(BuildChamp.ChampionLevel == 12 && BuildChamp.XP > Level3){
                    Main.characterIsAscended = true;
                    System.out.println("Congratulations, you are THE HERO");
                }

            }
        }
    }
        void LevelUpAutomation() {
            new MobLeveler().MobLevelUp();
            System.out.println("You are level "+BuildChamp.ChampionLevel+" now. Will you make it?");}

        void levelUpStatMod(int statUp, int healthUp){
            BuildChamp.BaseDefence = BuildChamp.BaseDefence + statUp;
            BuildChamp.BaseDamage = BuildChamp.BaseDamage + statUp;
            BuildChamp.BaseHitChance = BuildChamp.BaseHitChance * + statUp;
            BuildChamp.BaseArmor = BuildChamp.BaseArmor + statUp;
            BuildChamp.BaseCritChance = BuildChamp.BaseCritChance +statUp;
            BuildChamp.BaseHealth = BuildChamp.BaseHealth + healthUp;
            BuildChamp.MaxHealth = BuildChamp.MaxHealth +healthUp;
        }

    }