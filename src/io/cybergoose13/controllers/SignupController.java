package io.cybergoose13.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class SignupController {

    private Parent root;
    private Stage stage;

    public void onClickBack(MouseEvent mouseEvent) throws IOException {
        root= FXMLLoader.load(getClass().getResource("../frame.fxml"));
        stage= (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 400d, 600d));
        stage.show();
    }
}
