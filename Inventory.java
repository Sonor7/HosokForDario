package com.company;

import com.company.WeaponList.BronzeSword;

public class Inventory implements Weapons {
    public static boolean WeaponEquipped = false;
    public static int ClubAmount;
    public static int BronzeSwordAmount;
    public static int SteelSwordAmount;
    public static int DaggerAmount;
    public static int WoodBowAmount;
    public static int EbonyBowAmount;
    public static int GlassBowAmount;
    public static int WoodStaffAmount;
    public static int EbonyStaffAmount;
    //Equipped weapons
    public static boolean ClubEquipped = false;
    public static boolean BronzeSwordEquipped = false;
    public static boolean SteelSwordEquipped = false;
    public static boolean DaggerEquipped = false;
    public static boolean WoodBowEquipped = false;
    public static boolean EbonyBowEquipped = false;
    public static boolean GlassBowEquipped = false;
    public static boolean WoodStaffEquipped = false;
    public static boolean EbonyStaffEquipped = false;

    @Override
    public int getDamage() { return Champion.getInstance().getEquippedWeapon().getDamage();
    }

    @Override
    public int getCrit() { return Champion.getInstance().getEquippedWeapon().getCrit();
    }

    @Override
    public int getCritDmgModifier() {
        return Champion.getInstance().getEquippedWeapon().getCritDmgModifier();
    }

    @Override
    public int getWeaponLevel() {
        return Champion.getInstance().getEquippedWeapon().getWeaponLevel();
    }

    @Override
    public String getWeaponName() { return Champion.getInstance().getEquippedWeapon().getWeaponName();
    }

    //Add Items to use
    void AddClub(){
            if (ClubAmount > 0) {
                addWeapon();
                ClubAmount--;
                ClubEquipped = true;
            }

    }
    void AddBronzeSword(){
        if (BronzeSwordAmount > 0) {
            addWeapon();
            BronzeSwordAmount--;
            BronzeSwordEquipped = true;
        }

    }
    void AddSteelSword(){
        if (SteelSwordAmount > 0) {
            addWeapon();
            SteelSwordAmount--;
            SteelSwordEquipped = true;
        }
    }
    void AddDagger(){
        if (DaggerAmount > 0) {
            addWeapon();
            DaggerAmount--;
            DaggerEquipped = true;
        }

    }
    void AddWoodStaff(){
        if (WoodStaffAmount > 0) {
            addWeapon();
            WoodStaffAmount--;
            WoodStaffEquipped = true;
        }

    }
    void AddEbonyStaff(){
        if (EbonyStaffAmount > 0) {
            addWeapon();
            EbonyStaffAmount--;
            EbonyStaffEquipped = true;
        }

    }
    void AddWoodBow(){
        if (WoodBowAmount > 0) {
            addWeapon();
            WoodBowAmount--;
            WoodBowEquipped = true;
        }

    }
    void AddEbonyBow(){
        if (EbonyBowAmount > 0) {
            addWeapon();
            EbonyBowAmount--;
            EbonyBowEquipped = true;
        }

    }
    void AddGlassBow(){
        if (GlassBowAmount > 0) {
            addWeapon();
            GlassBowAmount--;
            GlassBowEquipped = true;
        }

    }
    //Remove Items
    void RemoveClub(){if (ClubEquipped == true){
        removeWeapon();
        ClubEquipped = false;
    }}
    void RemoveBronzeSword(){ if (BronzeSwordEquipped == true) {
        removeWeapon();
        BronzeSwordEquipped = false;
    }}
    void RemoveSteelSword(){if (SteelSwordEquipped == true) {
        removeWeapon();
        SteelSwordEquipped = false;
    }}
    void RemoveDagger(){if (DaggerEquipped == true) {
        removeWeapon();
        DaggerEquipped = false;
    }}
    void RemoveWoodStaff(){if (WoodStaffEquipped == true) {
        removeWeapon();
        WoodStaffEquipped = false;
    }}
    void RemoveEbonyStaff(){if (EbonyStaffEquipped == true) {
        removeWeapon();
        EbonyStaffEquipped = false;
    }}
    void RemoveWoodBow(){if (WoodBowEquipped == true) {
        removeWeapon();
        WoodBowEquipped = false;
    }}
    void RemoveEbonyBow(){if (EbonyBowEquipped == true) {
        removeWeapon();
        EbonyBowEquipped = false;
    }}
    void RemoveGlassBow(){if (GlassBowEquipped == true) {
        removeWeapon();
        GlassBowEquipped = false;
    }}
//Két osztály kell, ami eldönti h az új fegyver jobb-e, és a másik ami felteszi
    void AutoEquip() {
        if (WeaponEquipped == true && Fight.nextWeaponLevel > Fight.weaponLevel) {//itt dől el h jobb-e a fegyver
        String equippedWeapon = getWeaponName() ;
        switch (equippedWeapon){ //Removes the currently equipped weapon
            case "Club": RemoveClub();break;
            case "BronzeSword": RemoveBronzeSword();break;
            case "SteelSword": RemoveSteelSword();break;
            case "Dagger": RemoveDagger();break;
            case "WoodenBow":RemoveWoodBow();break;
            case "EbonyBow":RemoveEbonyBow();break;
            case "GlassBow":RemoveGlassBow();break;
            case "WoodStaff":RemoveWoodStaff();break;
            case "EbonyStaff":RemoveEbonyStaff();break;
        }
        }
        if (WeaponEquipped == false) { //starts the equip process
            BarbEquipper();
            NecromancerEquipper();
            RangerEquipper();
        } //equips weapons that are found
    }
    String WhatIsEquipped(){
        String WhatIsEquipped = "empty";
        if (WeaponEquipped == true){
            if (ClubEquipped == true){WhatIsEquipped = "Club";}
            else if (BronzeSwordEquipped == true){WhatIsEquipped = "BronzeSword";}
            else if (SteelSwordEquipped == true){WhatIsEquipped = "SteelSword"; }
            else if (DaggerEquipped == true){WhatIsEquipped = "Dagger"; }
            else if (WoodBowEquipped == true){WhatIsEquipped = "WoodenBow"; }
            else if (EbonyBowEquipped == true){WhatIsEquipped = "EbonyBow"; }
            else if (GlassBowEquipped == true){WhatIsEquipped = "GlassBow"; }
            else if (WoodStaffEquipped == true){WhatIsEquipped = "WoodStaff"; }
            else if (EbonyStaffEquipped == true){WhatIsEquipped = "EbonyStaff"; }
        }
        return WhatIsEquipped;
    }//decides on what the champ is wearing
    void BarbEquipper(){           if (Main.ChampChoice == 1) {
        if (SteelSwordAmount > 0 && SteelSwordEquipped == false) {
            AddSteelSword();
            WeaponEquipped = true;
        }
    }
        if (Main.ChampChoice == 1) {
            if (BronzeSwordAmount > 0 && BronzeSwordEquipped == false) {
                AddBronzeSword();
                WeaponEquipped = true;
            }
        }
        if (Main.ChampChoice == 1) {
            if (ClubAmount > 0 && ClubEquipped == false) {
                AddClub();
                WeaponEquipped = true;
            }
        }}
        void NecromancerEquipper(){   if (Main.ChampChoice == 2) {
            if (DaggerAmount > 0 && DaggerEquipped == false) {
                AddDagger();
                WeaponEquipped = true;
            }
            if (WoodStaffAmount > 0 && WoodStaffEquipped == false) {
                AddWoodStaff();
                WeaponEquipped = true;
            }
            if (EbonyStaffAmount > 0 && EbonyStaffEquipped == false) {
                AddEbonyStaff();
                WeaponEquipped = true;
            }
        }}
        void RangerEquipper(){
            if (Main.ChampChoice == 3) {
            if (WoodBowAmount > 0 && WoodBowEquipped == false) {
                AddWoodBow();
                WeaponEquipped = true;
            }
        }
            if (Main.ChampChoice == 3) {
                if (EbonyBowAmount > 0 && EbonyBowEquipped == false) {
                    AddEbonyBow();
                    WeaponEquipped = true;
                }
            }
            if (Main.ChampChoice == 3) {
                if (GlassBowAmount > 0 && GlassBowEquipped == false) {
                    AddGlassBow();
                    WeaponEquipped = true;
                }
            }
        }

        void removeWeapon(){
            Champion.setWeaponDamageModifier(0);
            Champion.setWeaponCritChanceModifier(0);
            Champion.setWeaponCritDamageModifier(0);
            WeaponEquipped = false;
        }

        void addWeapon(){
            Champion.getInstance().equipWeapon();

            int dmgToAdd = getDamage();
            int critToAdd = getCrit();
            int critModToADD = getCritDmgModifier();

            Champion.setWeaponDamageModifier(dmgToAdd);
            Champion.setWeaponCritChanceModifier(critToAdd);
            Champion.setWeaponDamageModifier(critModToADD);
        }

}

