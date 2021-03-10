package io.cybergoose13.handlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseHandler {

    private static String dbName= "test.db";
    private static String dbPath= "jdbc:sqlite:";
    private static String dbClassName= "org.sqlite.JDBC";
    private static Connection connection= null;
    private static Statement statement= null;

    public static void makeDBConnection(){
        try{
            Class.forName(dbClassName);
            connection= DriverManager.getConnection(dbPath + dbName);
        }catch (Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Connection established.");
    }

    public static void closeDBConnection(){
        try{
            connection.close();
            System.out.println("Connection Closed.");
        }catch (Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage() );
        }
    }


    public static void createDBTable(){
        try{
            statement= connection.createStatement();
            String sql = "CREATE TABLE TEST_TABLE" +
                        "(ID INT PRIMARY KEY    NOT NULL," +
                        " NAME          TEXT    NOT NULL," +
                        " AGE           INT     NOT NULL," +
                        "ADDRESS        CHAR(50), " +
                        " SALARY        REAL)";
        }catch(Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage() );
        }
    }
}
