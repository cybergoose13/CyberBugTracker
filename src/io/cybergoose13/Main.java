package io.cybergoose13;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        makeConnection();
        Parent root = FXMLLoader.load(getClass().getResource("frame.fxml"));
        primaryStage.setTitle("Pawnee");
        primaryStage.setScene(new Scene(root, 405, 605));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void makeConnection(){
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
