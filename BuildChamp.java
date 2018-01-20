package com.company;

import java.util.Scanner;

public class BuildChamp {

    BuildChamp(){
        }
    public BuildChamp(int ChampChoice){
        if (ChampChoice == 1) {
            ChampionNamer();
            new BuildChamp.Barbarian().BarbarianBuilder();
            new GameInitialization().InitializationComplete();
        } else if (ChampChoice == 2) {
            ChampionNamer();
            new BuildChamp.Necromancer().NecromancerBuilder();
            new GameInitialization().InitializationComplete();
        } else if (ChampChoice == 3) {
            ChampionNamer();
            new BuildChamp.Ranger().RangerBuilder();
            new GameInitialization().InitializationComplete();
        }
    }
    class Barbarian{
       void BarbarianBuilder() {
           Champion.setBaseDefence(15);
           Champion.setBaseDamage(10);
           Champion.setBaseHitChance(10);
           Champion.setBaseArmor(10);
           Champion.setBaseCritChance(1);
           Champion.setBaseHealth(500);
           Champion.setMaxHealth(500);
       }
    }
    class Necromancer{
        void NecromancerBuilder(){
            Champion.setBaseDefence(15);
            Champion.setBaseDamage(10);
            Champion.setBaseHitChance(10);
            Champion.setBaseArmor(10);
            Champion.setBaseCritChance(1);
            Champion.setBaseHealth(300);
            Champion.setMaxHealth(300);

        }

    }
    class Ranger{
        void RangerBuilder(){
            Champion.setBaseDefence(15);
            Champion.setBaseDamage(12);
            Champion.setBaseHitChance(12);
            Champion.setBaseArmor(10);
            Champion.setBaseCritChance(3);
            Champion.setBaseHealth(400);
            Champion.setMaxHealth(400);

        }

    }

    static void ChampionNamer(){
        System.out.println("Please enter the name of your Character");
        Scanner NameReader = new Scanner(System.in);
        Champion.setChampName(NameReader.next());
        System.out.println("Your name shall be " + Champion.getChampName());
    }
}
