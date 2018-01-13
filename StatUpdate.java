package com.company;

class StatUpdate {
    void WeaponUpdate(){
        //PC
        BuildChamp.TotalDamage = BuildChamp.BaseDamage + BuildChamp.WeaponDamageModifier;//BaseDamage + WeaponDamageModifier;
        BuildChamp.TotalDefence = BuildChamp.BaseDefence;// BaseDefence + ArmorModifier;
        BuildChamp.TotalHitChance = BuildChamp.BaseHitChance + BuildChamp.WeaponHitChanceModifier;// BaseHitChance + WeaponHitChanceModifier;
        BuildChamp.TotalCritChance = BuildChamp.BaseCritChance + BuildChamp.WeaponCritChanceModifier;// BaseCritChance + WeaponCritChanceModifier;

        //Mob
        MobRandomizer.EnemyTotalDamage = MobRandomizer.EnemyBaseDamage;//BaseDamage + WeaponDamageModifier;
        MobRandomizer.EnemyTotalDefence = MobRandomizer.EnemyBaseDefence;// BaseDefence + ArmorModifier;
        MobRandomizer.EnemyTotalHealth = MobRandomizer.EnemyCurrentHealth;// BaseHealth + HealthModifiers;
        MobRandomizer.EnemyTotalHitChance = MobRandomizer.EnemyBaseHitChance;// BaseHitChance + WeaponHitChanceModifier;
        MobRandomizer.EnemyTotalCritChance = MobRandomizer.EnemyBaseCritChance;// BaseCritChance + WeaponCritChanceModifier;
    }
    static void HealUp(){
        BuildChamp.CurrentHealth = BuildChamp.MaxHealth;// BaseHealth + HealthModifiers;
    }
    static void emergencyHealUp(int currentHealth){
        Double emergencyBar = 0.3;
        Double emergency = BuildChamp.MaxHealth * emergencyBar;
        int emergencyLevel = emergency.intValue();

        if (currentHealth < emergencyLevel){
            System.out.println("You need a drink. To the pub!");
            new Sets().Randomizer(2);
        }
    }
}
