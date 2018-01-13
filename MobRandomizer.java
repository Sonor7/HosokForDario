package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class MobRandomizer {
    public static int EnemyBaseDefence;
    public static int EnemyBaseDamage;
    public static int EnemyBaseHitChance;
    public static int EnemyBaseArmor;
    public static int EnemyBaseCritChance;
    public static int EnemyBaseHealth;
    public static int EnemyXP;
    public static int EnemyCurrentHealth;
    public static int MobID;
    //LevelUp Modifiers
    public static int NonFightingStatModifiers = 0;
    public static int FightingStatModifiers = 0;
    //String Values
    public static String MobName;
    //TotalValues
    public static int EnemyTotalDamage = EnemyBaseDamage;//BaseDamage + WeaponDamageModifier;
    public static int EnemyTotalDefence = EnemyBaseDefence;// BaseDefence + ArmorModifier;
    public static int EnemyTotalHealth = EnemyCurrentHealth;// BaseHealth + HealthModifiers;
    public static int EnemyTotalHitChance = EnemyBaseHitChance;// BaseHitChance + WeaponHitChanceModifier;
    public static int EnemyTotalCritChance = EnemyBaseCritChance;// BaseCritChance + WeaponCritChanceModifier;
    //ValueModifiers
    public int EnemyWeaponDamageModifier;
    public int EnemyArmorModifier;
    public int EnemyHealthModifiers;
    public int EnemyWeaponHitChanceModifier;
    public int EnemyCritChanceModifier;
    public int EnemyCritDamageModifier;//amivel megszorzom a dmg-t h megkapjam a crit dmg-t
    //Misc
    public int EnemyGoldAmount;

    public void MobChooserGeneral() {
        //Random MobRandom = new Random();
        MobID = ThreadLocalRandom.current().nextInt(1, 8);
        if (MobID == 1) { new MobRandomizer.Skeleton().Skeleton();
        } else if (MobID == 2) { new MobRandomizer.Imp().Imp();
        } else if (MobID == 3) { new MobRandomizer.Tainted().Tainted();
        } else if (MobID == 4) { new MobRandomizer.Diablo().Diablo();
        } else if (MobID == 5){new MobRandomizer.Bandit().Bandit();}
        else if (MobID == 6){new MobRandomizer.Sorcerer().Sorcerer();}
        else if(MobID == 7){new MobRandomizer.TowerSorcerer();}
    }
    public void MobChooserForest() {
        //Random MobRandom = new Random();
        MobID = ThreadLocalRandom.current().nextInt(1, 4);
        if (MobID == 1) { new MobRandomizer.Skeleton().Skeleton();
        } else if (MobID == 2){new MobRandomizer.Bandit().Bandit();}
        else if (MobID == 3){new MobRandomizer.Sorcerer().Sorcerer();}
    }
    public void MobChooserTower() {
        //Random MobRandom = new Random();
        MobID = ThreadLocalRandom.current().nextInt(1, 8);
        if (MobID == 1) { new MobRandomizer.Skeleton().Skeleton();
        } else if (MobID == 2) { new MobRandomizer.Imp().Imp();
        } else if (MobID == 3) { new MobRandomizer.Tainted().Tainted();
        } else if (MobID == 4) { new MobRandomizer.Diablo().Diablo();
        } else if (MobID == 5){new MobRandomizer.Bandit().Bandit();}
        else if (MobID == 6){new MobRandomizer.Sorcerer().Sorcerer();}
        else if (MobID == 7){new MobRandomizer.Sorcerer().Sorcerer();}
    }

    class Skeleton {
        void Skeleton() {
            MobRandomizer.EnemyBaseDamage = 10 + FightingStatModifiers;
            MobRandomizer.EnemyBaseHitChance = 10 + FightingStatModifiers;
            MobRandomizer.EnemyBaseArmor = 10 + NonFightingStatModifiers;
            EnemyBaseCritChance = 10 + FightingStatModifiers;
            EnemyBaseHealth = 10 + FightingStatModifiers;
            MobRandomizer.EnemyXP = 10 + NonFightingStatModifiers;
            MobRandomizer.EnemyCurrentHealth = 100 + NonFightingStatModifiers;
            MobRandomizer.MobID = 1;
            MobName = "Skeleton";
        }
    }

    class Imp {
        void Imp() {
            MobRandomizer.EnemyBaseDamage = 10 + FightingStatModifiers;
            MobRandomizer.EnemyBaseHitChance = 10 + FightingStatModifiers;
            MobRandomizer.EnemyBaseArmor = 10 + NonFightingStatModifiers;
            EnemyBaseCritChance = 10 + FightingStatModifiers;
            EnemyBaseHealth = 10 + FightingStatModifiers;
            MobRandomizer.EnemyXP = 10 + NonFightingStatModifiers;
            MobRandomizer.EnemyCurrentHealth = 100 + NonFightingStatModifiers;
            MobRandomizer.MobID = 2;
            MobName = "Imp";
        }
    }

    class Tainted {
        void Tainted() {
            MobRandomizer.EnemyBaseDamage = 10 + FightingStatModifiers;
            MobRandomizer.EnemyBaseHitChance = 10 + FightingStatModifiers;
            MobRandomizer.EnemyBaseArmor = 10 + NonFightingStatModifiers;
            EnemyBaseCritChance = 10 + FightingStatModifiers;
            EnemyBaseHealth = 10 + FightingStatModifiers;
            MobRandomizer.EnemyXP = 10 + NonFightingStatModifiers;
            MobRandomizer.EnemyCurrentHealth = 100 + NonFightingStatModifiers;
            MobRandomizer.MobID = 3;
            MobName = "Tainted";
        }
    }

    class Diablo {
        void Diablo()

        {
            EnemyBaseDefence = 12 + FightingStatModifiers;
            EnemyBaseDamage = 12 + FightingStatModifiers;
            EnemyBaseArmor = 15 + NonFightingStatModifiers;
            EnemyBaseCritChance = 15 + FightingStatModifiers;
            EnemyBaseHealth = 10 + FightingStatModifiers;
            EnemyXP = 25 + NonFightingStatModifiers;
            EnemyCurrentHealth = 180 + NonFightingStatModifiers ;
            MobID = 4;
            MobName = "Diablo";
        }
    }

    class Bandit {
        void Bandit()

        {
            MobRandomizer.EnemyBaseDamage = 10 + FightingStatModifiers;
            MobRandomizer.EnemyBaseHitChance = 10 + FightingStatModifiers;
            EnemyBaseArmor = 10 + NonFightingStatModifiers;
            EnemyBaseCritChance = 10 + FightingStatModifiers;
            EnemyBaseHealth = 10 + FightingStatModifiers;
            EnemyXP = 10 + NonFightingStatModifiers;
            EnemyCurrentHealth = 100 + NonFightingStatModifiers;
            MobID = 5;
            MobName = "Bandit";
        }
    }

    class Sorcerer {
        void Sorcerer()

        {

                EnemyBaseDefence = 12 + FightingStatModifiers;
                EnemyBaseDamage = 12 + FightingStatModifiers;
                EnemyBaseHitChance = 12 + FightingStatModifiers;
                EnemyBaseArmor = 12 + NonFightingStatModifiers;
                EnemyBaseCritChance = 10 + FightingStatModifiers;
                EnemyBaseHealth = 10 + FightingStatModifiers;
                EnemyXP = 30 + NonFightingStatModifiers;
                EnemyCurrentHealth = 200 + NonFightingStatModifiers;
                MobID = 6;
                MobName = "Sorcerer";

        }
    }

    class TowerSorcerer {
        void TowerSorcerer() {

                EnemyBaseDefence = 14 + FightingStatModifiers;
                EnemyBaseDamage = 14 + FightingStatModifiers;
                EnemyBaseHitChance = 14 + FightingStatModifiers;
                EnemyBaseArmor = 13 + NonFightingStatModifiers;
                EnemyBaseCritChance = 14 + FightingStatModifiers;
                EnemyBaseHealth = 10 + FightingStatModifiers;
                EnemyXP = 50 + NonFightingStatModifiers;
                EnemyCurrentHealth = 250 + NonFightingStatModifiers;
                MobID = 7;
                MobName = "Sorcerer of the Tower";

        }
    }

}
