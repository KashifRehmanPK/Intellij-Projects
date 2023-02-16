package com.example.mybankingapplication;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class RemoveUser {
    public Button Back;
    public Button Remove;

    public void Back(ActionEvent event) throws IOException {

        Main m = new Main();

        m.changeScene("Menu.fxml");
    }

    public void Remove(ActionEvent event) {
    }
}
