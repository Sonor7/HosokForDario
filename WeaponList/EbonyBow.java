package com.company.WeaponList;

import com.company.Weapons;

public class EbonyBow implements Weapons {
    int weaponDamageModifier = 8;
    int weaponCritChanceModifier = 2;
    int weaponCritDamageModifier = 3;
    int weaponLevel = 2;
    String weaponName = "EbonyBow";
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
