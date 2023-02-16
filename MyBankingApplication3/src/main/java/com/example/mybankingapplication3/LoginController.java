package com.example.mybankingapplication3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class LoginController {


    public Button LofginButton;

    @FXML
    private Label wrongLogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void Login(ActionEvent event) throws IOException {
        Main m = new Main();

      /*  username.setText("java");
        password.setText("123");
*/

        if (username.getText().toString().equals("java") && password.getText().toString().equals("123")) {
            wrongLogin.setText("Success!");

            m.changeScene("Menu.fxml");

        } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogin.setText("Please enter your data.");

        } else {

            wrongLogin.setText("Wrong username or password");
        }

    }
}







/*

    Main obj1 = new Main();

    public void Login(ActionEvent event) throws IOException {

        obj1.changeScene("Menu.fxml");
    }


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


}*/
