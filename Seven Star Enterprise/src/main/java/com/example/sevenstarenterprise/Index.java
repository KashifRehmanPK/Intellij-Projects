package com.example.sevenstarenterprise;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class Index {

    public Button BackButton;
    public Button button1;
    public Button Button2;
    public Button Button3;
    public Button Button4;

    Main obj1 = new Main();

    public void Back(ActionEvent event) throws IOException {


        obj1.changeScene("Menu.fxml");
    }



    public void kisimMalButton(ActionEvent event) {
    }


}


