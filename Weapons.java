package com.company;

public class Weapons {
    public static int WeaponLevel;
    public static int NextWeaponLevel;
    void Club(){
        BuildChamp.WeaponDamageModifier = 5;
        BuildChamp.WeaponCritChanceModifier = 1;
        BuildChamp.WeaponCritDamageModifier = 1;
        Weapons.WeaponLevel = 1;
        System.out.println("You equip a club");
    }
    void BronzeSword(){
        BuildChamp.WeaponDamageModifier = 8;
        BuildChamp.WeaponCritChanceModifier = 2;
        BuildChamp.WeaponCritDamageModifier = 2;
        WeaponLevel = 2;
        System.out.println("You equip a Bronze Sword");
    }
    void SteelSword(){
        BuildChamp.WeaponDamageModifier = 10;
        BuildChamp.WeaponCritChanceModifier = 2;
        BuildChamp.WeaponCritDamageModifier = 3;
        WeaponLevel = 3;
        System.out.println("You equip a Steel Sword");
    }
    void Dagger(){
        BuildChamp.WeaponDamageModifier = 2;
        BuildChamp.WeaponCritChanceModifier = 2;
        BuildChamp.WeaponCritDamageModifier = 2;
        WeaponLevel = 1;
        System.out.println("You equip a Dagger");
    }
    void WoodStaff(){
        BuildChamp.WeaponDamageModifier = 5;
        BuildChamp.WeaponCritChanceModifier = 1;
        BuildChamp.WeaponCritDamageModifier = 1;
        WeaponLevel = 2;
        System.out.println("You equip a Wood Staff");
    }
    void EbonyStaff(){
        BuildChamp.WeaponDamageModifier = 10;
        BuildChamp.WeaponCritChanceModifier = 1;
        BuildChamp.WeaponCritDamageModifier = 1;
        WeaponLevel = 3;
        System.out.println("You equip an Ebony Staff");
    }
    void WoodenBow(){
        BuildChamp.WeaponDamageModifier = 5;
        BuildChamp.WeaponCritChanceModifier = 1;
        BuildChamp.WeaponCritDamageModifier = 2;
        WeaponLevel = 1;
        System.out.println("You equip a Wooden Bow");
    }
    void EbonyBow(){
        BuildChamp.WeaponDamageModifier = 8;
        BuildChamp.WeaponCritChanceModifier = 2;
        BuildChamp.WeaponCritDamageModifier = 3;
        WeaponLevel = 2;
        System.out.println("You equip a Ebony Bow");
    }
    void GlassBow(){
        BuildChamp.WeaponDamageModifier = 10;
        BuildChamp.WeaponCritChanceModifier = 3;
        BuildChamp.WeaponCritDamageModifier = 4;
        WeaponLevel = 3;
        System.out.println("You equip a Glass Bow");
    }
}
