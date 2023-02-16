package com.example.sevenstarenterprise;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

import java.io.IOException;

import java.util.Objects;



public class Main extends Application {
    private static Stage stg;




/*

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPag.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
*/

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    //public void start(Stage primaryStage) throws IOException {
        public void start(Stage primaryStage) throws IOException {
        stg = primaryStage;
        //primaryStage.setResizable();
        //primaryStage.setFullScreen(true);
        //primaryStage.centerOnScreen();

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("LoginPag.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
        primaryStage.setTitle("Seven Star Enterprise !");
        primaryStage.setScene(scene);
        primaryStage.show();

    }










    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxml)));
        stg.getScene().setRoot(pane);


    }

/*    public static class FXMLDocumentController implements Initializable {


        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

        }
    }*/
}
