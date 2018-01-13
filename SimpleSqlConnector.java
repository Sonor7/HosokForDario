package com.company;


import javax.print.attribute.standard.RequestingUserName;
import java.net.URL;
import java.sql.*;
public class SimpleSqlConnector extends BuildChamp{
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
            statement.setString(1,ChampName);
            statement.setInt(2,XP);
            statement.setInt(3,BaseDefence);
            statement.setInt(4,BaseDamage);
            statement.setInt(5,BaseArmor);
            statement.setInt(6,BaseHitChance);
            statement.setInt(7,BaseHealth);
            statement.setInt(8,MaxHealth);
            statement.setInt(9,ChampionLevel);
            statement.setInt(10,CurrentHealth);
            statement.setInt(11,WeaponDamageModifier);
            statement.setInt(12,ArmorModifier);
            statement.setInt(13,HealthModifiers);
            statement.setInt(14,WeaponHitChanceModifier);
            statement.setInt(15,WeaponCritChanceModifier);
            statement.setInt(16,WeaponCritDamageModifier);
            statement.setInt(17,TotalDamage);
            statement.setInt(18,TotalDefence);
            statement.setInt(19,TotalHealth);
            statement.setInt(20,TotalHitChance);
            statement.setInt(21,TotalCritChance);
            statement.setString(22,ChampClass);
            statement.setInt(23,Fight.DeadEnemyCounter);
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
            statement.setInt(1,XP);
            statement.setInt(2,BaseDefence);
            statement.setInt(3,BaseDamage);
            statement.setInt(4,BaseArmor);
            statement.setInt(5,BaseHitChance);
            statement.setInt(6,BaseHealth);
            statement.setInt(7,MaxHealth);
            statement.setInt(8,ChampionLevel);
            statement.setInt(9,CurrentHealth);
            statement.setInt(10,WeaponDamageModifier);
            statement.setInt(11,ArmorModifier);
            statement.setInt(12,HealthModifiers);
            statement.setInt(13,WeaponHitChanceModifier);
            statement.setInt(14,WeaponCritChanceModifier);
            statement.setInt(15,WeaponCritDamageModifier);
            statement.setInt(16,TotalDamage);
            statement.setInt(17,TotalDefence);
            statement.setInt(18,TotalHealth);
            statement.setInt(19,TotalHitChance);
            statement.setInt(20,TotalCritChance);
            statement.setString(21,ChampClass);
            statement.setInt(22,Fight.DeadEnemyCounter);
            statement.setString(23,champName);
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