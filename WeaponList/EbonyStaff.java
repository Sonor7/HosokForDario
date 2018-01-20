package com.company.WeaponList;

import com.company.Weapons;

public class EbonyStaff implements Weapons {
    int weaponDamageModifier = 10;
    int weaponCritChanceModifier = 1;
    int weaponCritDamageModifier = 1;
    int weaponLevel = 3;
    String weaponName = "EbonyStaff";
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
        return getWeaponLevel();
    }

    @Override
    public String getWeaponName() {
        return weaponName;
    }

}