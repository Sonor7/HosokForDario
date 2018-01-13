package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUpdaters {
    void champClassUpdater(String champClass){
        Connection connection = new SimpleSqlConnector().ConnectionPlus();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO hos(class) VALUES ('"+BuildChamp.ChampClass+"')");
            connection.close();
        }catch (java.sql.SQLException e){System.out.println(e);}
    }
    void champDeadEnemyCounterUpdater(int DeadEnemyCounter){
        Connection connection = new SimpleSqlConnector().ConnectionPlus();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("update hos set DeadEnemyCounter = '"+DeadEnemyCounter+"' where ChampName = '"+BuildChamp.ChampName+"'");
            connection.close();
        }catch (java.sql.SQLException e){System.out.println(e);}
    }
    String checkForExistingChamp(String lookedForChampName){
        Connection connection = new SimpleSqlConnector().ConnectionPlus();
        try{
            Statement statement = connection.createStatement();
            statement.executeQuery ("SELECT ChampName FROM hos");//WHERE ChampName='"+champName+"'
            ResultSet rs = statement.getResultSet ();
            System.out.println("We will look for "+lookedForChampName);
            while (rs.next()){
                String currentChampName = rs.getString("ChampName");
                System.out.println(currentChampName);
                if (currentChampName.equals(lookedForChampName)){
                    System.out.println(lookedForChampName+" Exists");
                    return lookedForChampName;
                }
            }
            //String existingChampName = rs.getString("ChampName");
            connection.close();
            return null;
        }
        catch(java.sql.SQLException e){System.out.println(e);}

        return null;
    }
    void loadExistingChamp(String existingChampName){
        System.out.println("Now we load "+existingChampName);
        Connection connection = new SimpleSqlConnector().ConnectionPlus();
        try{
            Statement statement = connection.createStatement();
            statement.executeQuery("Select ChampName, XP, BaseDefence, BaseDamage, BaseArmor, BaseHitChance, BaseHealth, MaxHealth, ChampionLevel, CurrentHealth, WeaponDamageModifier, " +
                    "ArmorModifier, HealthModifiers, WeaponHitChanceModifier, WeaponCritChanceModifier, WeaponCritDamageModifier, TotalDamage, TotalDefence, TotalHealth, " +
                    "TotalHitChance, TotalCritChance, class, DeadEnemyCounter FROM hos WHERE ChampName = '"+existingChampName+"'");
            ResultSet rs = statement.getResultSet();
            while (rs.next()){
                String ChampNameVar = rs.getString("ChampName");
                int xPVar = rs.getInt("XP");
                int baseDefenceVar = rs.getInt("BaseDefence");
                int baseDamageVar = rs.getInt("BaseDamage");
                int baseArmorVar = rs.getInt("BaseArmor");
                int baseHitChanceVar = rs.getInt("BaseHitChance");
                int baseHealthVar = rs.getInt("BaseHealth");
                int maxHealthVar = rs.getInt("MaxHealth");
                int championLevelVar = rs.getInt("ChampionLevel");
                int currentHealthVar = rs.getInt("CurrentHealth");
                int weaponDamageModifierVar = rs.getInt("WeaponDamageModifier");
                int armorModifierVar = rs.getInt("ArmorModifier");
                int healthModifiersVar = rs.getInt("HealthModifiers");
                int weaponHitChanceModifierVar = rs.getInt("WeaponHitChanceModifier");
                int weaponCritChanceModifierVar = rs.getInt("WeaponCritChanceModifier");
                int weaponCritDamageModifierVar = rs.getInt("WeaponCritDamageModifier");
                int totalDamageVar = rs.getInt("TotalDamage");
                int totalDefenceVar = rs.getInt("TotalDefence");
                int totalHealthVar = rs.getInt("TotalHealth");
                int totalHitChanceVar = rs.getInt("TotalHitChance");
                int totalCritChanceVar = rs.getInt("TotalCritChance");
                String champClassVar = rs.getString("class");
                int deadEnemyCounterVar = rs.getInt("DeadEnemyCounter");
                System.out.println("ChampName= "+ChampNameVar+"\nXP= "+xPVar+"\nBaseDefence= "+baseDefenceVar+"\nBaseDamage= "+baseDamageVar+"\nBaseArmor= "+baseArmorVar+"\nBaseHitChance= "+baseHitChanceVar+"\nBaseHealth= "+baseHealthVar
                +"\nMaxHealth= "+maxHealthVar+"\nChampionLevel= "+championLevelVar+"\nCurrentHealth= "+currentHealthVar+"\nWeaponDmgModifier= "+weaponCritChanceModifierVar+"\nWeaponDamageModifier= "+weaponDamageModifierVar+"\nArmorModifier= "+armorModifierVar+
                "\nHealthModifier= "+healthModifiersVar+"\nWeaponHitChanceModifier= "+weaponHitChanceModifierVar+"\nWeaponCritChanceModifier= "+weaponCritChanceModifierVar+"\nWeaponCritDamageModifier= "+weaponCritDamageModifierVar+"\nTotalDamage= "+totalDamageVar+
                        "\nTotalDefence= "+totalDefenceVar+"\nTotalHealth= "+totalHealthVar+"\nTotalHitChanceVar= "+totalHitChanceVar+"\nTotalCritChanceVar= "+totalCritChanceVar+"\nChampClass = "+champClassVar+"\nDeadEnemyCounter= "+deadEnemyCounterVar);

                BuildChamp.XP = xPVar;
                BuildChamp.BaseDefence = baseDefenceVar;
                BuildChamp.BaseDamage = baseDamageVar;
                BuildChamp.BaseArmor = baseArmorVar;
                BuildChamp.BaseHitChance = baseHitChanceVar;
                BuildChamp.BaseHealth = baseHealthVar;
                BuildChamp.MaxHealth = maxHealthVar;
                BuildChamp.ChampionLevel = championLevelVar;
                BuildChamp.CurrentHealth = currentHealthVar;
                BuildChamp.WeaponDamageModifier = weaponDamageModifierVar;
                BuildChamp.ArmorModifier = armorModifierVar;
                BuildChamp.HealthModifiers = healthModifiersVar;
                BuildChamp.WeaponHitChanceModifier = weaponHitChanceModifierVar;
                BuildChamp.WeaponCritChanceModifier = weaponCritChanceModifierVar;
                BuildChamp.WeaponDamageModifier = weaponCritDamageModifierVar;
                BuildChamp.TotalDamage = totalDamageVar;
                BuildChamp.TotalDefence = totalDefenceVar;
                BuildChamp.TotalCritChance = totalCritChanceVar;
                BuildChamp.TotalHitChance = totalHitChanceVar;
                BuildChamp.ChampClass = champClassVar;
                Fight.DeadEnemyCounter = deadEnemyCounterVar;
                BuildChamp.ChampName = ChampNameVar;
            }
        }
        catch (java.sql.SQLException e){System.out.println(e);}
    }
    void afterChampDeath(String existingChampName){
        Connection connection = new SimpleSqlConnector().ConnectionPlus();
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate("update hos set CurrentHealth = '"+BuildChamp.MaxHealth+"' WHERE ChampName = '"+existingChampName+"'");
            //This is where the death counter will be
            //statement.executeUpdate("update hos set CurrentHealth = '"+BuildChamp.MaxHealth+"' WHERE ChampName = '"+existingChampName+"'");
            connection.close();
        }
        catch(java.sql.SQLException e){System.out.println(e);}
    }
}
