package com.example.sevenstarenterprise;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import java.io.IOException;

public class LanDanROKAR {

    public Button BackButton;
    public Button button1;
    public Button button2;
    public Button button4;
    public Button button3;
    public Button Back;

    Main obj1 = new Main();

    public void Back(ActionEvent event) throws IOException {

        obj1.changeScene("LanDanROKAR.fxml");
    }

    public void pashgiKthata(ActionEvent event) throws IOException {

        obj1.changeScene("LanDanRokarPashgiKhata.fxml");
    }

    public void wasoliButton(ActionEvent event) throws IOException {


        obj1.changeScene("LanDanRokarWasool.fxml");
    }

    public void generalButton(ActionEvent event) throws IOException {


        obj1.changeScene("LanDanRokarGeneral.fxml");
    }

    public void aadigiButton(ActionEvent event) throws IOException {


        obj1.changeScene("LanDanRokarAdaegi.fxml");
    }

    public void BackButton(ActionEvent event) throws IOException {

        obj1.changeScene("Menu.fxml");
    }
}
