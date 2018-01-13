package com.company;

public class Inventory {
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
    //Add Items to use
    void AddClub(){
            if (ClubAmount > 0) {
                new Weapons().Club();
                ClubAmount--;
                ClubEquipped = true;
            }

    }
    void AddBronzeSword(){
        if (BronzeSwordAmount > 0) {
            new Weapons().BronzeSword();
            BronzeSwordAmount--;
            BronzeSwordEquipped = true;
        }

    }
    void AddSteelSword(){
        if (SteelSwordAmount > 0) {
            new Weapons().SteelSword();
            SteelSwordAmount--;
            SteelSwordEquipped = true;
        }
    }
    void AddDagger(){
        if (DaggerAmount > 0) {
            new Weapons().Dagger();
            DaggerAmount--;
            DaggerEquipped = true;
        }

    }
    void AddWoodStaff(){
        if (WoodStaffAmount > 0) {
            new Weapons().Dagger();
            WoodStaffAmount--;
            WoodStaffEquipped = true;
        }

    }
    void AddEbonyStaff(){
        if (EbonyStaffAmount > 0) {
            new Weapons().Dagger();
            EbonyStaffAmount--;
            EbonyStaffEquipped = true;
        }

    }
    void AddWoodBow(){
        if (WoodBowAmount > 0) {
            new Weapons().WoodenBow();
            WoodBowAmount--;
            WoodBowEquipped = true;
        }

    }
    void AddEbonyBow(){
        if (EbonyBowAmount > 0) {
            new Weapons().EbonyBow();
            EbonyBowAmount--;
            EbonyBowEquipped = true;
        }

    }
    void AddGlassBow(){
        if (GlassBowAmount > 0) {
            new Weapons().GlassBow();
            GlassBowAmount--;
            GlassBowEquipped = true;
        }

    }
    //Remove Items
    void RemoveClub(){if (ClubEquipped == true){
        BuildChamp.WeaponDamageModifier = 0;
        BuildChamp.WeaponCritChanceModifier = 0;
        BuildChamp.WeaponCritDamageModifier = 0;
        ClubEquipped = false;
        WeaponEquipped = false;
    }}
    void RemoveBronzeSword(){ if (BronzeSwordEquipped == true) {
        BuildChamp.WeaponDamageModifier = 0;
        BuildChamp.WeaponCritChanceModifier = 0;
        BuildChamp.WeaponCritDamageModifier = 0;
        BronzeSwordEquipped = false;
        WeaponEquipped = false;
    }}
    void RemoveSteelSword(){if (SteelSwordEquipped == true) {
        BuildChamp.WeaponDamageModifier = 0;
        BuildChamp.WeaponCritChanceModifier = 0;
        BuildChamp.WeaponCritDamageModifier = 0;
        SteelSwordEquipped = false;
        WeaponEquipped = false;
    }}
    void RemoveDagger(){if (DaggerEquipped == true) {
        BuildChamp.WeaponDamageModifier = 0;
        BuildChamp.WeaponCritChanceModifier = 0;
        BuildChamp.WeaponCritDamageModifier = 0;
        DaggerEquipped = false;
        WeaponEquipped = false;
    }}
    void RemoveWoodStaff(){if (WoodStaffEquipped == true) {
        BuildChamp.WeaponDamageModifier = 0;
        BuildChamp.WeaponCritChanceModifier = 0;
        BuildChamp.WeaponCritDamageModifier = 0;
        WoodStaffEquipped = false;
        WeaponEquipped = false;
    }}
    void RemoveEbonyStaff(){if (EbonyStaffEquipped == true) {
        BuildChamp.WeaponDamageModifier = 0;
        BuildChamp.WeaponCritChanceModifier = 0;
        BuildChamp.WeaponCritDamageModifier = 0;
        EbonyStaffEquipped = false;
        WeaponEquipped = false;
    }}
    void RemoveWoodBow(){if (WoodBowEquipped == true) {
        BuildChamp.WeaponDamageModifier = 0;
        BuildChamp.WeaponCritChanceModifier = 0;
        BuildChamp.WeaponCritDamageModifier = 0;
        WoodBowEquipped = false;
        WeaponEquipped = false;
    }}
    void RemoveEbonyBow(){if (EbonyBowEquipped == true) {
        BuildChamp.WeaponDamageModifier = 0;
        BuildChamp.WeaponCritChanceModifier = 0;
        BuildChamp.WeaponCritDamageModifier = 0;
        EbonyBowEquipped = false;
        WeaponEquipped = false;
    }}
    void RemoveGlassBow(){if (GlassBowEquipped == true) {
        BuildChamp.WeaponDamageModifier = 0;
        BuildChamp.WeaponCritChanceModifier = 0;
        BuildChamp.WeaponCritDamageModifier = 0;
        GlassBowEquipped = false;
        WeaponEquipped = false;
    }}
//Két osztály kell, ami eldönti h az új fegyver jobb-e, és a másik ami felteszi
    void AutoEquip() {
        if (WeaponEquipped == true && Weapons.NextWeaponLevel > Weapons.WeaponLevel) {//itt dől el h jobb-e a fegyver
        String EquippedWeapon = WhatIsEquipped();
        switch (EquippedWeapon){
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
        if (WeaponEquipped == false) {
            BarbEquipper();
            NecromancerEquipper();
            RangerEquipper();
        }
    } //equips weapons that are found
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
        void RangerEquipper(){            if (Main.ChampChoice == 3) {
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
}

