package com.company;

class StatUpdate {
    void WeaponUpdate(){
        //PC
        Champion.setTotalDamage(Champion.getBaseDamage() + Champion.getWeaponDamageModifier());//BaseDamage + WeaponDamageModifier;
        Champion.setTotalDefence(Champion.getBaseDefence());// BaseDefence + ArmorModifier;
        Champion.setTotalHitChance(Champion.getBaseHitChance() + Champion.getWeaponHitChanceModifier()) ;// BaseHitChance + WeaponHitChanceModifier;
        Champion.setTotalCritChance(Champion.getBaseCritChance() + Champion.getWeaponCritChanceModifier());// BaseCritChance + WeaponCritChanceModifier;

        //Mob
        MobRandomizer.EnemyTotalDamage = MobRandomizer.EnemyBaseDamage;//BaseDamage + WeaponDamageModifier;
        MobRandomizer.EnemyTotalDefence = MobRandomizer.EnemyBaseDefence;// BaseDefence + ArmorModifier;
        MobRandomizer.EnemyTotalHealth = MobRandomizer.EnemyCurrentHealth;// BaseHealth + HealthModifiers;
        MobRandomizer.EnemyTotalHitChance = MobRandomizer.EnemyBaseHitChance;// BaseHitChance + WeaponHitChanceModifier;
        MobRandomizer.EnemyTotalCritChance = MobRandomizer.EnemyBaseCritChance;// BaseCritChance + WeaponCritChanceModifier;
    }
    static void HealUp(){
        Champion.setCurrentHealth(Champion.getMaxHealth());// BaseHealth + HealthModifiers;
    }
    static void emergencyHealUp(int currentHealth){
        Double emergencyBar = 0.3;
        Double emergency = Champion.getMaxHealth() * emergencyBar;
        int emergencyLevel = emergency.intValue();

        if (currentHealth < emergencyLevel){
            System.out.println("You need a drink. To the pub!");
            new Sets().Randomizer(2);
        }
    }
}
