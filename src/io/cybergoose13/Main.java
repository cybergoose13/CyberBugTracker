package io.cybergoose13;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static io.cybergoose13.handlers.DatabaseHandler.makeDBConnection;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        makeDBConnection();
        Parent root = FXMLLoader.load(getClass().getResource("frame.fxml"));
        primaryStage.setTitle("Pawnee");
        primaryStage.setScene(new Scene(root, 405, 605));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
