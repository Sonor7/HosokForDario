package com.company.WeaponList;

import com.company.Weapons;

public class WoodenBow implements Weapons {
    int weaponDamageModifier = 5;
    int weaponCritChanceModifier = 1;
    int weaponCritDamageModifier = 2;
    int weaponLevel = 1;
    String weaponName = "WoodenBow";
    // System.out.println("You equip a club");

    @Override
    public int getDamage() {
        return weaponDamageModifier;
    }

    @Override
    public int getCrit() {
        return weaponCritChanceModifier;
    }

    @Override
    public int getCritDmgModifier() {
        return weaponCritDamageModifier;
    }

    @Override
    public int getWeaponLevel() {
        return weaponLevel;
    }

    @Override
    public String getWeaponName() {
        return weaponName;
    }
}
