package com.example.mybankingapplication;

import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class MenuController implements Initializable {
    public Button AddUser;
    public Button RemoveUser;
    public Button Logout;
    public Label label;
    public Button finduser;

    @FXML
    ListView<String> list;
    String[] listData = {"Jan", "Feb", "Mar"};

    String data[];


    BorderPane root = new BorderPane();



       // list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //list.getItems().addAll(listData);
    //}


    //public void finduser(ActionEvent event)
    //{


        DatabaseConnection connectNow = new DatabaseConnection();

        Connection connectDB = connectNow.getConnection();

        String connectQuery = "SELECT * FROM account";

        String data[] = new String[2];


        List<String> resultsList = new ArrayList<String>();

        int j=0;
        try {

            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(connectQuery);

            while (queryOutput.next()) {

               resultsList.add(queryOutput.getString("first_name"));
            }

            ObservableList<String> ids = FXCollections.observableArrayList(resultsList);
            list.setItems(ids);

        } catch (Exception e) {
            e.printStackTrace();

        }









    }


 /*   private void list(String first_name) throws SQLException {

        //  ListView list = new ListView(options);


        DatabaseConnection connectNow = new DatabaseConnection();

        Connection connectDB = connectNow.getConnection();

        String connectQuery = "SELECT * FROM account";


        Statement statement = connectDB.createStatement();

        ResultSet queryOutput = statement.executeQuery(connectQuery);


        while (queryOutput.next()) {

           // main.getItems().addAll(data);
            list(queryOutput.getString(Arrays.toString(data)));

          //  ListView = new ListView<>();

           // main.setItems(list(data[i]);

        }

    }*/




    public void AddUser(ActionEvent event) throws IOException {

        Main m = new Main();

        m.changeScene("AddUser.fxml");

    }

    public void RemoveUser(ActionEvent event) throws IOException {

        Main m = new Main();

        m.changeScene("RemoveUser.fxml");

    }

    public void Logout(ActionEvent event) throws IOException {

        Main m = new Main();

        m.changeScene("Login.fxml");

    }


    public void laber_action(MouseEvent mouseEvent) {
    }
}
