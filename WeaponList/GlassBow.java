package com.company.WeaponList;

import com.company.Weapons;

public class GlassBow implements Weapons {
    int weaponDamageModifier = 10;
    int weaponCritChanceModifier = 3;
    int weaponCritDamageModifier = 4;
    int weaponLevel = 3;
    String weaponName = "GlassBow";
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
