package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Center {
    public static int RandomHit(){
            int RandomHitChance = ThreadLocalRandom.current().nextInt(1, 10);
            return RandomHitChance;
    }
    public void Init(){
        new StatUpdate().WeaponUpdate(); //Updates the current weapon stats
        if(Sets.setting == 1){
            new MobRandomizer().MobChooserGeneral();}
        else if (Sets.setting == 3){new MobRandomizer().MobChooserForest();}
        else if (Sets.setting == 4){new MobRandomizer().MobChooserTower();}
        System.out.println("Enemy Chosen is "+MobRandomizer.MobName);
    }
    public static void Battle(int RandomHitChance, boolean RandomCrit, boolean RandomEnemyCrit) {
            if (BuildChamp.TotalHitChance + RandomHitChance > MobRandomizer.EnemyTotalDefence) {
                //this is where crit will be
                if (RandomCrit == true){MobRandomizer.EnemyCurrentHealth = MobRandomizer.EnemyCurrentHealth - BuildChamp.TotalDamage*2;
                    System.out.println(BuildChamp.ChampName+" hit the "+Main.ANSI_BLUE + MobRandomizer.MobName +Main.ANSI_RESET+" for the CRITICAL " + BuildChamp.TotalDamage*2);
                    try{Thread.sleep(500);}catch(java.lang.InterruptedException ex){Thread.currentThread().interrupt();}
                }
                    else {
                MobRandomizer.EnemyCurrentHealth = MobRandomizer.EnemyCurrentHealth - BuildChamp.TotalDamage;
                System.out.println(BuildChamp.ChampName+" hit the "+Main.ANSI_BLUE + MobRandomizer.MobName +Main.ANSI_RESET+" for " + BuildChamp.TotalDamage);}
            } else {
                System.out.println("You missed");
            }
            if (MobRandomizer.EnemyTotalHitChance + RandomHitChance > BuildChamp.TotalDefence) {
                if (RandomEnemyCrit == true){ BuildChamp.CurrentHealth = BuildChamp.CurrentHealth - MobRandomizer.EnemyTotalDamage*2;
                    System.out.println("The "+Main.ANSI_BLUE + MobRandomizer.MobName +Main.ANSI_RESET+" hits "+BuildChamp.ChampName +" for the CRITICAL " + MobRandomizer.EnemyTotalDamage*2);
                    try{Thread.sleep(500);}catch(java.lang.InterruptedException ex){Thread.currentThread().interrupt();}
                }
                else{
                BuildChamp.CurrentHealth = BuildChamp.CurrentHealth - MobRandomizer.EnemyTotalDamage;
                System.out.println("The "+Main.ANSI_BLUE + MobRandomizer.MobName +Main.ANSI_RESET+" hits "+BuildChamp.ChampName +" for " + MobRandomizer.EnemyTotalDamage);}
                if (BuildChamp.CurrentHealth < 0) {
                    return;
                }
            } else {
                System.out.println("The enemy misses you.");
            }
    }
    public static void Battle(int RandomHitChance, boolean RandomCrit, boolean RandomEnemyCrit, int petHitChance, int petCritChance, int petDamage) {
        if (BuildChamp.TotalHitChance + RandomHitChance > MobRandomizer.EnemyTotalDefence) {
            //this is where crit will be
            if (RandomCrit == true){MobRandomizer.EnemyCurrentHealth = MobRandomizer.EnemyCurrentHealth - BuildChamp.TotalDamage*2;
                System.out.println(BuildChamp.ChampName+" hit the "+Main.ANSI_BLUE + MobRandomizer.MobName +Main.ANSI_RESET+" for the CRITICAL " + BuildChamp.TotalDamage*2);
                try{Thread.sleep(500);}catch(java.lang.InterruptedException ex){Thread.currentThread().interrupt();}
            }//this is a normal attack by the hero
            else {
                MobRandomizer.EnemyCurrentHealth = MobRandomizer.EnemyCurrentHealth - BuildChamp.TotalDamage;
                System.out.println(BuildChamp.ChampName+" hit the "+Main.ANSI_BLUE + MobRandomizer.MobName +Main.ANSI_RESET+" for " + BuildChamp.TotalDamage);}
        } else {//hero missed
            System.out.println("You missed");}

        if (Pet.petBaseHitChance + RandomHitChance > MobRandomizer.EnemyTotalDefence){
        if (RandomCrit == true){MobRandomizer.EnemyCurrentHealth = MobRandomizer.EnemyCurrentHealth - petDamage*2;
            System.out.println(Pet.petName+" hit the "+Main.ANSI_BLUE + MobRandomizer.MobName +Main.ANSI_RESET+" for the CRITICAL " + petDamage*2);
            try{Thread.sleep(500);}catch(java.lang.InterruptedException ex){Thread.currentThread().interrupt();}
        }
        else {
            MobRandomizer.EnemyCurrentHealth = MobRandomizer.EnemyCurrentHealth - petDamage;
            System.out.println(Pet.petName+" hit the "+Main.ANSI_BLUE + MobRandomizer.MobName +Main.ANSI_RESET+" for " + petDamage);}
        }else{System.out.println("The pet missed");}


        if (MobRandomizer.EnemyTotalHitChance + RandomHitChance > BuildChamp.TotalDefence) {
            if (RandomEnemyCrit == true){ BuildChamp.CurrentHealth = BuildChamp.CurrentHealth - MobRandomizer.EnemyTotalDamage*2;
                System.out.println("The "+Main.ANSI_BLUE + MobRandomizer.MobName +Main.ANSI_RESET+" hits "+BuildChamp.ChampName +" for the CRITICAL " + MobRandomizer.EnemyTotalDamage*2);
                try{Thread.sleep(500);}catch(java.lang.InterruptedException ex){Thread.currentThread().interrupt();}
            }
            else{
                BuildChamp.CurrentHealth = BuildChamp.CurrentHealth - MobRandomizer.EnemyTotalDamage;
                System.out.println("The "+Main.ANSI_BLUE + MobRandomizer.MobName +Main.ANSI_RESET+" hits "+BuildChamp.ChampName +" for " + MobRandomizer.EnemyTotalDamage);}
            if (BuildChamp.CurrentHealth < 0) {
                return;
            }
        } else {
            System.out.println("The enemy misses you.");
        }
        petExpiration();
    }
    boolean RandomCrit(){
        int RandomHitChance = ThreadLocalRandom.current().nextInt(1, 100);
        if (RandomHitChance + BuildChamp.TotalCritChance > 80 ){ return true;}
        else {return false;}
    }
    boolean RandomEnemyCrit(){
        int RandomHitChance = ThreadLocalRandom.current().nextInt(1, 100);
        if (RandomHitChance + MobRandomizer.EnemyTotalCritChance > 80 ){ return true;}
        else {return false;}
    }
    static void petExpiration(){
        Spells.petExistence--;
        if (Spells.petExistence <= 0){
            Pet.petExsists = false;
        }
    }

}
