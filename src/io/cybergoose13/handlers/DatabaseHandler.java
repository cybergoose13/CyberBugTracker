package io.cybergoose13.handlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseHandler {

    private final static String dbUserTable= "USER_TABLE";
    private final static String dbProgramTable= "PROGRAM_TABLE";
    private final static String dbName= "test.db";
    private final static String dbPath= "jdbc:sqlite:";
    private final static String dbClassName= "org.sqlite.JDBC";
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


//      https://www.tutorialspoint.com/sqlite/sqlite_java.htm
    public static void createDBTable(){
        try{
            statement= connection.createStatement();
            String sql = "CREATE TABLE " + dbUserTable +
                        "(USERID INT PRIMARY KEY    NOT NULL," +
                        " USERNAME      TEXT    NOT NULL," +
                        " PASSWORD      CHAR(50) NOT NULL)";
            String programTable= "CREATE TABLE " + dbProgramTable +
                                "(ID INT PRIMARY KEY    NOT NULL," +
                                " NAME          TEXT    NOT NULL," +
                                " CREATOR       TEXT    NOT NULL," +
                                " USERID        INT     NOT NULL," +
                                " FOREIGN KEY(USERID) REFERENCES " + dbUserTable + "(USERID) )";

            statement.executeUpdate(sql);
            statement.executeUpdate(programTable);
            statement.close();
            connection.close();
        }catch(Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage() );
        }
    }
}
