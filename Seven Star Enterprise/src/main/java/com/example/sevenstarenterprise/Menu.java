package com.example.sevenstarenterprise;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Menu {

    public Button CASHIN;
    public Button CASHOUT;
    public Button button1;

    public Button button3;
    public Button button4;
    public Button button5;
    public Button Logout;
    public Button book;


    Main obj1 = new Main();

    public void Indexbutton(ActionEvent event) throws IOException {


        obj1.changeScene("Index.fxml");
    }


    public void landanbutton(ActionEvent event) throws IOException {


        obj1.changeScene("LanDanROKAR.fxml");
    }


    public void reportbutton(ActionEvent event) throws IOException {


        obj1.changeScene("Report.fxml");
    }

    public void backupbutton(ActionEvent event) throws IOException {


        obj1.changeScene("BackUp1.fxml");
    }

    public void CASHIN(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("CASH IN.fxml"));
        Stage stage = new Stage();
        stage.setX(0);  //location at coner (left top)
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("CASH IN.fxml");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL); // close top stage to access previous stage
        stage.initOwner(button3.getScene().getWindow()); // close top stage to access previous stage and give vidration animation
        stage.setMaximized(true); //maximize stage
        stage.show();
    }


    public void CASHOUT(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("CASH OUT.fxml"));
        Stage stage = new Stage();
        stage.setX(0);  //location at coner (left top)
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("CASH OUT.fxml");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL); // close top stage to access previous stage
        stage.initOwner(button3.getScene().getWindow()); // close top stage to access previous stage and give vidration animation
        stage.setMaximized(true); //maximize stage
        stage.show();
    }


    public void logoutButton(ActionEvent event) throws IOException {

        obj1.changeScene("LoginPag.fxml");
    }
    
    public void bookButton(ActionEvent event) throws IOException {

        obj1.changeScene("BookTypes.fxml");

    }
}