package io.cybergoose13.controllers;

import io.cybergoose13.handlers.SceneHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class Controller {

    private SceneHandler sceneHandler= new SceneHandler();

    public void onSelectUsername(MouseEvent mouseEvent) {
    }

    public void onSelectPassword(MouseEvent mouseEvent){
    }

    public void onClickSignIn(MouseEvent mouseEvent) {
    }

    public void onClickRegister(MouseEvent mouseEvent) throws Exception {
        sceneHandler.setScene("../signup.fxml",
                ((Node)mouseEvent.getSource()).getScene().getWindow());
    }
}
