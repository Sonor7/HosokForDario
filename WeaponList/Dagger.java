package com.company.WeaponList;

import com.company.Weapons;

public class Dagger implements Weapons {
    int weaponDamageModifier = 2;
    int weaponCritChanceModifier = 2;
    int weaponCritDamageModifier = 2;
    int weaponLevel = 1;
    String weaponName = "Dagger";
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