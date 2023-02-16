package com.example.sevenstarenterprise;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class ReportOverall {
    public Button button6;
    public Button button7;
    public Button BackButton;
    Main obj1 = new Main();

    public void bikributton(ActionEvent event) {
    }

    public void addaReport(ActionEvent event) {
    }

    public void Back(ActionEvent event) throws IOException {
        obj1.changeScene("Menu.fxml");
    }
}
