package com.example.sevenstarenterprise;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.IOException;

import static javafx.application.Application.launch;


public class LoginPag {



 /*   public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPag.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }*/

    public ImageView loginbgID;
    @FXML
    private Button button;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void userLogin(ActionEvent event) throws IOException {
        Main m = new Main();


        username.setText("java");
        password.setText("123");


        if (username.getText().toString().equals("java") && password.getText().toString().equals("123")) {
            wrongLogin.setText("Success!");

            m.changeScene("Menu.fxml");

        } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogin.setText("Please enter your data.");

        } else {

            wrongLogin.setText("Wrong username or password");
        }


    }

  /*  @Override
    public void start(Stage stage) {
        stage.setTitle("HTML");
        stage.setWidth(500);
        stage.setHeight(500);
        Scene scene = new Scene(new Group());
        VBox root = new VBox();

        final ImageView selectedImage = new ImageView();
        Image image1 = new Image(Main.class.getResourceAsStream("a.jpg"));

        selectedImage.setImage(image1);

        root.getChildren().addAll(selectedImage);

        scene.setRoot(root);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }*/
}

















    /*  @FXML
    private Label welcomeText;

*/


    /*

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
*/

