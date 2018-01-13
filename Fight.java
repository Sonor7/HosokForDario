package com.company;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Fight{
    public static int DeadEnemyCounter;
    public static int LootDifficulty;

    public void FightInit(){
        //Randomize a monster
    }
    //Fight
    Fight(){//az értékek maniplulációja a Centerben van
        boolean spellCastHappened = false;
        new Center().Init();
        while (MobRandomizer.EnemyCurrentHealth > 0 && BuildChamp.CurrentHealth > 0 && Main.CharacterIsALive == true) {
            if (BuildChamp.ChampClass == "Necromancer" && spellCastHappened == false){
            String spellToCast = InputScanner.inputScanner("Do you want to cast a spell?");
            Spells.Cast(spellToCast);
            spellCastHappened = true;
            }
            if (BuildChamp.ChampClass == "Necromancer" && Pet.petExsists == true){
                Center.Battle(Center.RandomHit(), new Center().RandomCrit(), new Center().RandomEnemyCrit(), Pet.petBaseHitChance, Pet.petBaseCritChance, Pet.petBaseDamage);
            }else {
            Center.Battle(Center.RandomHit(), new Center().RandomCrit(), new Center().RandomEnemyCrit());}
            if (BuildChamp.CurrentHealth <= 0) {//Itt hal meg ha itt az ideje
                Die();
                return;
            }
        }
        if (MobRandomizer.EnemyCurrentHealth <= 0) {
            System.out.println(Main.ANSI_GREEN+"The enemy has been defeated."+Main.ANSI_RESET);
            Ascend.AcquireXP(MobRandomizer.EnemyXP);
            Fight.DeadEnemyCounter++;
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (java.lang.InterruptedException ex){ Thread.currentThread().interrupt(); }
            LootRandomizer();
            new DBUpdaters().champDeadEnemyCounterUpdater(DeadEnemyCounter);
        }
    }
    void Loot(){//Find a weapon or armor
        int WhatToLoot = ThreadLocalRandom.current().nextInt(1,9);
        switch (WhatToLoot) {
            case 1:
                if (Inventory.ClubAmount < 1){
                Inventory.ClubAmount++;}
                System.out.println(Main.ANSI_BLUE+"You have found a Club"+Main.ANSI_RESET);
                Weapons.NextWeaponLevel = 1;
                break;
            case 2:
                if (Inventory.BronzeSwordAmount < 1){
                    Inventory.BronzeSwordAmount++;}
                System.out.println(Main.ANSI_BLUE+"You have found a Bronze Sword"+Main.ANSI_RESET);
                Weapons.NextWeaponLevel = 2;
                break;
            case 3:
                if (Inventory.SteelSwordAmount < 1){
                    Inventory.SteelSwordAmount++;}
                System.out.println(Main.ANSI_BLUE+"You have found a Steel Sword"+Main.ANSI_RESET);
                Weapons.NextWeaponLevel = 3;
                break;
            case 4:
                if (Inventory.DaggerAmount < 1){
                    Inventory.DaggerAmount++;}
                System.out.println(Main.ANSI_BLUE+"You have found a Dagger"+Main.ANSI_RESET);
                Weapons.NextWeaponLevel = 1;
                break;
            case 5:
                if (Inventory.WoodBowAmount < 1){
                    Inventory.WoodBowAmount++;}
                    System.out.println(Main.ANSI_BLUE+"You have found a Wood Bow"+Main.ANSI_RESET);
                Weapons.NextWeaponLevel = 1;
                break;
            case 6:
                if (Inventory.EbonyBowAmount < 1){
                    Inventory.EbonyBowAmount++;}
                    System.out.println(Main.ANSI_BLUE+"You have found a Ebony Bow"+Main.ANSI_RESET);
                Weapons.NextWeaponLevel = 2;
                break;
            case 7:
                if (Inventory.GlassBowAmount < 1){
                    Inventory.GlassBowAmount++;}
                System.out.println(Main.ANSI_BLUE+"You have found a Glass Bow"+Main.ANSI_RESET);
                Weapons.NextWeaponLevel = 3;
                break;
            case 8:
                if (Inventory.WoodStaffAmount < 1){
                    Inventory.WoodStaffAmount++;}
                System.out.println(Main.ANSI_BLUE+"You have found a Wood Staff"+Main.ANSI_RESET);
                Weapons.NextWeaponLevel = 2;
                break;
            case 9:
                if (Inventory.EbonyStaffAmount < 1){
                    Inventory.EbonyStaffAmount++;}
                System.out.println(Main.ANSI_BLUE+"You have found an Ebony Staff"+Main.ANSI_RESET);
                Weapons.NextWeaponLevel = 3;
                break;

        }
    }
    void LootRandomizer(){
        int LootChance = ThreadLocalRandom.current().nextInt(0,100);
        if (LootChance > LootDifficulty){Loot();}
    }//random chance to find something
    public void FightMain(){
    }
    static void Die(){
        System.out.println(Main.ANSI_RED + "You have died" + Main.ANSI_RESET);
        System.out.println("You have killed "+DeadEnemyCounter +" enemies");
        Main.CharacterIsALive = false;
    }
}
class FightMain{
    FightMain() {
        new Fight();
    }
}
