package com.company;

public class Pet {
    static int petBaseDamage;
    static int petBaseHitChance;
    static int petBaseCritChance;
    static int petBaseHealth;
    static int petCurrentHealth;
    static boolean petExsists = false;
    static String petName;
    Pet(String petNameVal, int petBaseDamageVal, int petBaseHitChanceVal, int petBaseCritChanceVal) {
        petBaseDamage = petBaseDamageVal;
        petBaseHitChance = petBaseHitChanceVal ;
        petBaseCritChance = petBaseCritChanceVal;
        petName = petNameVal;

        petExsists = true;
    }
}

