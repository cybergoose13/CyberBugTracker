package io.cybergoose13.handlers;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseHandler {

    public static void makeDBConnection(){
        String dbName= "test.db";
        String dbPath= "jdbc:sqlite:";
        String dbClassName= "org.sqlite.JDBC";
        Connection connection= null;
        try{
            Class.forName(dbClassName);
            connection= DriverManager.getConnection(dbPath + dbName);
        }catch (Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Connection established.");
    }
}
