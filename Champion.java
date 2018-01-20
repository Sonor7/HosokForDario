package com.company;

public class Champion  { // Ide be kell hozni minden champot, és kell egy class ami majd állítja.

    private static int BaseDefence;
    private static int BaseDamage;
    private static int BaseHitChance;
    private static int BaseArmor;
    private static int BaseCritChance;
    private static int BaseHealth;
    private static int MaxHealth;
    private static int XP;
    private static int ChampionLevel = 0;
    private static int CurrentHealth;

    private static int WeaponDamageModifier;
    private static int ArmorModifier;
    private static int HealthModifiers;
    private static int WeaponHitChanceModifier;
    private static int WeaponCritChanceModifier;
    private static int WeaponCritDamageModifier;//amivel megszorzom a dmg-t h megkapjam a crit dmg-t
    private static int weaponLevel;


    private static String weaponName;
    private static String ChampName;
    private static String ChampClass;

    private static int TotalDamage = BaseDamage + WeaponDamageModifier;//BaseDamage + WeaponDamageModifier;
    private static int TotalDefence = BaseDefence;// BaseDefence + ArmorModifier;
    private static int TotalHealth = CurrentHealth;// BaseHealth + HealthModifiers;
    private static int TotalHitChance = BaseHitChance + WeaponHitChanceModifier;// BaseHitChance + WeaponHitChanceModifier;

    public static int getTotalDamage() {
        return TotalDamage;
    }

    private static int TotalCritChance = BaseCritChance + WeaponCritChanceModifier;// BaseCritChance + WeaponCritChanceModifier;

    public int GoldAmount;

    Weapons equippedWeapon;

    private Champion() {
        //ettől lesz singleton
    }
    private static Champion gameInstance = new Champion();

    public static Champion getInstance() {
        return gameInstance;
    }

    public void equipWeapon(Weapons weaponToEquip) {
        equippedWeapon = weaponToEquip;
    }

    public Weapons getEquippedWeapon() {
        return equippedWeapon;
    }

    public static void setBaseDefence(int baseDefence) {
        BaseDefence = baseDefence;
    }

    public static void setBaseDamage(int baseDamage) {
        BaseDamage = baseDamage;
    }

    public static void setBaseHitChance(int baseHitChance) {
        BaseHitChance = baseHitChance;
    }

    public static void setBaseArmor(int baseArmor) {
        BaseArmor = baseArmor;
    }

    public static void setBaseCritChance(int baseCritChance) {
        BaseCritChance = baseCritChance;
    }

    public static void setBaseHealth(int baseHealth) {
        BaseHealth = baseHealth;
    }

    public static void setMaxHealth(int maxHealth) {
        MaxHealth = maxHealth;
    }

    public static void setXP(int XP) {
        Champion.XP = XP;
    }

    public static void setChampionLevel(int championLevel) {
        ChampionLevel = championLevel;
    }

    public static void setCurrentHealth(int currentHealth) {
        CurrentHealth = currentHealth;
    }

    public void setEquippedWeapon(Weapons equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public static int getBaseDefence() {
        return BaseDefence;
    }

    public static int getBaseDamage() {
        return BaseDamage;
    }

    public static int getBaseHitChance() {
        return BaseHitChance;
    }

    public static int getBaseArmor() {
        return BaseArmor;
    }

    public static int getBaseCritChance() {
        return BaseCritChance;
    }

    public static int getBaseHealth() {
        return BaseHealth;
    }

    public static int getMaxHealth() {
        return MaxHealth;
    }

    public static int getXP() {
        return XP;
    }

    public static int getChampionLevel() {
        return ChampionLevel;
    }

    public static int getCurrentHealth() {
        return CurrentHealth;
    }
    public static int getWeaponDamageModifier() {
        return WeaponDamageModifier;
    }

    public static int getArmorModifier() {
        return ArmorModifier;
    }

    public static int getHealthModifiers() {
        return HealthModifiers;
    }

    public static int getWeaponHitChanceModifier() {
        return WeaponHitChanceModifier;
    }

    public static int getWeaponCritChanceModifier() {
        return WeaponCritChanceModifier;
    }

    public static int getWeaponCritDamageModifier() {
        return WeaponCritDamageModifier;
    }

    public static void setWeaponDamageModifier(int weaponDamageModifier) {
        WeaponDamageModifier = weaponDamageModifier;
    }

    public static void setArmorModifier(int armorModifier) {
        ArmorModifier = armorModifier;
    }

    public static void setHealthModifiers(int healthModifiers) {
        HealthModifiers = healthModifiers;
    }

    public static void setWeaponHitChanceModifier(int weaponHitChanceModifier) {
        WeaponHitChanceModifier = weaponHitChanceModifier;
    }

    public static void setWeaponCritChanceModifier(int weaponCritChanceModifier) {
        WeaponCritChanceModifier = weaponCritChanceModifier;
    }

    public static void setWeaponCritDamageModifier(int weaponCritDamageModifier) {
        WeaponCritDamageModifier = weaponCritDamageModifier;
    }
    public static String getChampName() {
        return ChampName;
    }

    public static String getChampClass() {
        return ChampClass;
    }

    public static void setChampName(String champName) {
        ChampName = champName;
    }

    public static void setChampClass(String champClass) {
        ChampClass = champClass;
    }
    public int getGoldAmount() {
        return GoldAmount;
    }

    public void setGoldAmount(int goldAmount) {
        GoldAmount = goldAmount;
    }
    public static void setTotalDamage(int totalDamage) {
        TotalDamage = totalDamage;
    }

    public static int getTotalDefence() {
        return TotalDefence;
    }

    public static void setTotalDefence(int totalDefence) {
        TotalDefence = totalDefence;
    }

    public static int getTotalHealth() {
        return TotalHealth;
    }

    public static void setTotalHealth(int totalHealth) {
        TotalHealth = totalHealth;
    }

    public static int getTotalHitChance() {
        return TotalHitChance;
    }

    public static void setTotalHitChance(int totalHitChance) {
        TotalHitChance = totalHitChance;
    }

    public static int getTotalCritChance() {
        return TotalCritChance;
    }

    public static void setTotalCritChance(int totalCritChance) {
        TotalCritChance = totalCritChance;
    }

    public static int getWeaponLevel () {
        return weaponLevel;}

    public static String getWeaponName () {
        return weaponName;}

}
