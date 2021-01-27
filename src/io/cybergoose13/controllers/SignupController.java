package io.cybergoose13.controllers;

import io.cybergoose13.handlers.SceneHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class SignupController {

    private SceneHandler sceneHandler= new SceneHandler();

    public void onClickBack(MouseEvent mouseEvent) throws Exception{
        sceneHandler.setScene("../frame.fxml",
                ((Node)mouseEvent.getSource()).getScene().getWindow());
    }
}
