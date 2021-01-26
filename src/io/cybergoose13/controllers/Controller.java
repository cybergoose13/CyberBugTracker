package io.cybergoose13.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {

    private Parent root;
    private Stage stage;

    public void onSelectUsername(MouseEvent mouseEvent) {
    }

    public void onSelectPassword(MouseEvent mouseEvent){
    }

    public void onClickSignIn(MouseEvent mouseEvent) {
    }

    public void onClickRegister(MouseEvent mouseEvent) throws Exception {
        root = FXMLLoader.load(getClass().getResource("../signup.fxml"));
        stage= (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 400d, 600d));
        stage.show();
    }
}
