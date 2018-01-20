package com.company.WeaponList;

import com.company.Weapons;

public class WoodStaff implements Weapons {
    int weaponDamageModifier = 5;
    int weaponCritChanceModifier = 1;
    int weaponCritDamageModifier = 1;
    int weaponLevel = 2;
    String weaponName = "WoodStaff";
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