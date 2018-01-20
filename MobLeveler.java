package com.company;

public class MobLeveler {
    //scale the power of the mob up with the character
    void TowerLeveler(){
        Sets.TowerLevel = Sets.TowerLevel + Champion.getChampionLevel();
    }
    void MobLevelUp(){
        int FightStatMod = Champion.getChampionLevel() + 3;
        int NonFightStatMod = Champion.getChampionLevel() + 10;
        MobRandomizer.FightingStatModifiers = FightStatMod;
        MobRandomizer.NonFightingStatModifiers = NonFightStatMod;
        System.out.println("The mobs seem to be tougher than they used to be. Weird.");
    }
}
