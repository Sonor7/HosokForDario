package com.company;

import java.util.Scanner;

public class BuildChamp {
    public static int BaseDefence;
    public static int BaseDamage;
    public static int BaseHitChance;
    public static int BaseArmor;
    public static int BaseCritChance;
    public static int BaseHealth;
    public static int MaxHealth;
    public static int XP;
    public static int ChampionLevel = 0;
    public static int CurrentHealth;
    //ValueModifiers
    public static int WeaponDamageModifier;
    public static int ArmorModifier;
    public static int HealthModifiers;
    public static int WeaponHitChanceModifier;
    public static int WeaponCritChanceModifier;
    public static int WeaponCritDamageModifier;//amivel megszorzom a dmg-t h megkapjam a crit dmg-t
    //String Values
    public static String ChampName;
    public static String ChampClass;
    //TotalValues
    public static int TotalDamage = BaseDamage + WeaponDamageModifier;//BaseDamage + WeaponDamageModifier;
    public static int TotalDefence = BaseDefence;// BaseDefence + ArmorModifier;
    public static int TotalHealth = CurrentHealth;// BaseHealth + HealthModifiers;
    public static int TotalHitChance = BaseHitChance + WeaponHitChanceModifier;// BaseHitChance + WeaponHitChanceModifier;
    public static int TotalCritChance = BaseCritChance + WeaponCritChanceModifier;// BaseCritChance + WeaponCritChanceModifier;
    //Misc
    public int GoldAmount;


    BuildChamp(){
        }
    public BuildChamp(int ChampChoice){
        if (ChampChoice == 1) {
            ChampionNamer();
            new BuildChamp.Barbarian().BarbarianBuilder();
            new GameInitialization().InitializationComplete();
        } else if (ChampChoice == 2) {
            ChampionNamer();
            new BuildChamp.Necromancer().NecromancerBuilder();
            new GameInitialization().InitializationComplete();
        } else if (ChampChoice == 3) {
            ChampionNamer();
            new BuildChamp.Ranger().RangerBuilder();
            new GameInitialization().InitializationComplete();
        }
    }
    class Barbarian{
       void BarbarianBuilder() {
           BuildChamp.BaseDefence = 15;
           BuildChamp.BaseDamage = 10;
           BuildChamp.BaseHitChance = 10;
           BuildChamp.BaseArmor = 10;
           BuildChamp.BaseCritChance = 1;
           BuildChamp.BaseHealth = 500;
           BuildChamp.MaxHealth = 500;
       }
    }
    class Necromancer{
        void NecromancerBuilder(){
            BuildChamp.BaseDefence = 15;
            BuildChamp.BaseDamage  = 10;
            BuildChamp.BaseHitChance = 10;
            BuildChamp.BaseArmor = 10;
            BuildChamp.BaseCritChance = 1;
            BuildChamp.BaseHealth = 300;
            BuildChamp.MaxHealth = 300;

        }

    }
    class Ranger{
        void RangerBuilder(){
            BuildChamp.BaseDefence = 15;
            BuildChamp.BaseDamage  = 12;
            BuildChamp.BaseHitChance = 12;
            BuildChamp.BaseArmor = 10;
            BuildChamp.BaseCritChance = 3;
            BuildChamp.BaseHealth = 400;
            BuildChamp.MaxHealth = 400;

        }

    }

    static void ChampionNamer(){
        System.out.println("Please enter the name of your Character");
        Scanner NameReader = new Scanner(System.in);
        ChampName = NameReader.next();
        System.out.println("Your name shall be " + ChampName);
    }
}
