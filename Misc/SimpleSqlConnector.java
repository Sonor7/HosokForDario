package com.company.Misc;


import com.company.BuildChamp;
import com.company.Champion;
import com.company.Fight;
//extends Champion ez kell még?
import java.sql.*;
public class SimpleSqlConnector {
    public void Connect() {

        System.out.println("Loading driver...");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }

        String url = "jdbc:mysql://localhost:3306/Hosok?useSSL=false";
        String username = "root";
        String password = "root";

        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
            PreparedStatement statement = connection.prepareStatement("INSERT INTO hos VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"); //Saves everything
            statement.setString(1,Champion.getChampName());
            statement.setInt(2,Champion.getXP());
            statement.setInt(3,Champion.getBaseDefence());
            statement.setInt(4,Champion.getBaseDamage());
            statement.setInt(5,Champion.getBaseArmor());
            statement.setInt(6,Champion.getBaseHitChance());
            statement.setInt(7,Champion.getBaseHealth());
            statement.setInt(8,Champion.getMaxHealth());
            statement.setInt(9,Champion.getChampionLevel());
            statement.setInt(10,Champion.getCurrentHealth());
            statement.setInt(11,Champion.getWeaponDamageModifier());
            statement.setInt(12,Champion.getArmorModifier());
            statement.setInt(13,Champion.getHealthModifiers());
            statement.setInt(14,Champion.getWeaponHitChanceModifier());
            statement.setInt(15,Champion.getWeaponCritChanceModifier());
            statement.setInt(16,Champion.getWeaponCritDamageModifier());
            statement.setInt(17,Champion.getTotalDamage());
            statement.setInt(18,Champion.getTotalDefence());
            statement.setInt(19,Champion.getTotalHealth());
            statement.setInt(20,Champion.getTotalHitChance());
            statement.setInt(21,Champion.getTotalCritChance());
            statement.setString(22,Champion.getChampClass());
            statement.setInt(23, Fight.DeadEnemyCounter);
            statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
    public void Connect(String champName) {

        System.out.println("Loading driver...");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }

        String url = "jdbc:mysql://localhost:3306/Hosok?useSSL=false";
        String username = "root";
        String password = "root";

        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
            PreparedStatement statement = connection.prepareStatement("UPDATE hos SET XP = ?, BaseDefence = ?, BaseDamage = ?, BaseArmor = ?, BaseHitChance = ?, BaseHealth = ?, MaxHealth = ?," +
                    "ChampionLevel = ?, CurrentHealth = ?, WeaponDamageModifier = ?, ArmorModifier = ?, HealthModifiers = ?, WeaponHitChanceModifier = ?, WeaponCritChanceModifier = ?, " +
                    " WeaponCritDamageModifier = ?, TotalDamage = ?, TotalDefence = ?, TotalHealth = ?, TotalHitChance = ?, TotalCritChance = ?, class = ?, DeadEnemyCounter = ?" +
                    " WHERE ChampName = ?"); //Saves everything
            statement.setString(1,Champion.getChampName());
            statement.setInt(2,Champion.getXP());
            statement.setInt(3,Champion.getBaseDefence());
            statement.setInt(4,Champion.getBaseDamage());
            statement.setInt(5,Champion.getBaseArmor());
            statement.setInt(6,Champion.getBaseHitChance());
            statement.setInt(7,Champion.getBaseHealth());
            statement.setInt(8,Champion.getMaxHealth());
            statement.setInt(9,Champion.getChampionLevel());
            statement.setInt(10,Champion.getCurrentHealth());
            statement.setInt(11,Champion.getWeaponDamageModifier());
            statement.setInt(12,Champion.getArmorModifier());
            statement.setInt(13,Champion.getHealthModifiers());
            statement.setInt(14,Champion.getWeaponHitChanceModifier());
            statement.setInt(15,Champion.getWeaponCritChanceModifier());
            statement.setInt(16,Champion.getWeaponCritDamageModifier());
            statement.setInt(17,Champion.getTotalDamage());
            statement.setInt(18,Champion.getTotalDefence());
            statement.setInt(19,Champion.getTotalHealth());
            statement.setInt(20,Champion.getTotalHitChance());
            statement.setInt(21,Champion.getTotalCritChance());
            statement.setString(22,Champion.getChampClass());
            statement.setInt(22, Fight.DeadEnemyCounter);
            statement.setString(23,Champion.getChampName());
            statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
    public Connection ConnectionPlus(){
        System.out.println("Loading driver...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }

        String url = "jdbc:mysql://localhost:3306/Hosok?useSSL=false";
        String username = "root";
        String password = "root";
        try{Connection connection = DriverManager.getConnection(url, username, password);
            return connection;}
        catch (java.sql.SQLException e){System.out.println("Adabázis nem megy");
        return null;}
    }
}
            /*"VALUES ('"+BuildChamp.ChampName+"', '"+BuildChamp.XP+"', '"+BuildChamp.BaseDefence+"', '"+BuildChamp.BaseDamage+"','"+BuildChamp.BaseArmor+"','"+BuildChamp.BaseCritChance+"'" +
                    "'"+BuildChamp.BaseHealth+"','"+BuildChamp.MaxHealth+"','"+BuildChamp.ChampionLevel+"','"+BuildChamp.CurrentHealth+"'.'"+BuildChamp.WeaponDamageModifier+"','"+BuildChamp.ArmorModifier+"'," +
                    "'"+BuildChamp.HealthModifiers+"','"+BuildChamp.WeaponHitChanceModifier+"','"+WeaponCritChanceModifier+"','"+WeaponCritDamageModifier+"','"+TotalDamage+"','"+TotalDefence+"','"+TotalHealth+"'," +
                    "'"+TotalHitChance+"','"+TotalCritChance+"')")*/;
//statement.executeQuery ("SELECT Name, MaxHP, CurrentHP, XP FROM hos");
/*            ResultSet rs = statement.getResultSet ();
            //int count = 0;
            while (rs.next ())
            {
                String nameVal = rs.getString ("Name");
                int MaxHPVal = rs.getInt ("MaxHP");
                int CurrentHPVal = rs.getInt ("CurrentHP");
                int XPVal = rs.getInt ("XP");
                System.out.println (
                        "Name = " + nameVal
                                + ", MaxHP = " + MaxHPVal
                                + ", CurrentHP = " + CurrentHPVal + "XP =" + XPVal);
                //++count;
            }*/
/*            statement.executeUpdate("INSERT INTO hos(ChampName, XP, BaseDefence, BaseDamage, BaseArmor, BaseCritChance, BaseHealth, MaxHealth, ChampionLevel, CurrentHealth, WeaponDamageModifier, " +
                    "ArmorModifier, HealthModifiers, WeaponHitChanceModifier, WeaponCritChanceModifier, WeaponCritDamageModifier, TotalDamage, TotalDefence, TotalHealth, TotalHitChance" +
                    "TotalCritChance )  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");*/

/*
package sql;

import com.davesoft.appraisal.ext.logging.AppLogger;
import config_handling.PropertiesHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class SqlConnector {

    private static SqlConnector instance = new SqlConnector();

    private String dbUrl;
    private Connection connection = null;

    public static SqlConnector getInstance() {
        return instance;
    }

    private SqlConnector() {
    }

    private void createDbUrl() {
        //PropertiesHandler propHandler = PropertiesHandler.getInstance();
        dbUrl = "jdbc:mysql://" + propHandler.getSqlDbHost() + "/" + propHandler.getSqlDbName() + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
    }

    public void createNewSqlConnection() {
        AppLogger.log.info("Trying to connect to MySQL database.");
        createDbUrl();
        AppLogger.log.debug("SQL database url: " + dbUrl);
        connectToMySql();
    }

    protected void connectToMySql() {
        PropertiesHandler propHandler = PropertiesHandler.getInstance();
        try {
            AppLogger.log.info("Kapcsolódás az SQL szerverhez");
            connection = DriverManager.getConnection(dbUrl, propHandler.getSqlDbUsername(), propHandler.getSqlDbPassword());
        } catch (Exception e) {
            AppLogger.log.error("Error while trying to connect to MySQL database. " + e);
        }
    }

    public Connection getConnection() {
        if (connection == null) {
            connectToMySql();
            return connection;
        } else {
            return connection;
        }
    }

    public Boolean isSqlConnected() {
        if (connection != null) {
            return true;
        } else {
            return false;
        }
    }
}*/