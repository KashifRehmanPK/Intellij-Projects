package com.example.sevenstarenterprise;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class DatabaseConnection {


    public Connection databaseLink;

    public Connection getConnection() {

        String databaseName = "mybankingapplication";

        String databaseUser = "root";

        String databasePassword = "P@ssword1";

        String url = "jdbc:mysql://localhost/";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url + databaseName, databaseUser, databasePassword);

        } catch (Exception e) {

            e.printStackTrace();
        }
        return databaseLink;
    }

}











/*


package com.example.mybankingapplication;

        import javafx.event.ActionEvent;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

        import java.io.IOException;
        import java.sql.Connection;
        import java.sql.SQLException;
        import java.sql.Statement;

public class AddUser {

    public TextField ID;
    public Button CreateAccount;
    public Button Back;
    public TextField firstName;
    public TextField Last_Name;
    public TextField Branch;

    public void CreateAccount(ActionEvent event) throws SQLException {

        DatabaseConnection connectNow = new DatabaseConnection();

        Connection connectDB = connectNow.getConnection();

        //String connectQuery = "INSERT INTO account ('first_name','last_name','Branch') VALUES ('"+firstName.getText()+"','"+Last_Name.getText()+"','"+Branch.getText()+"')";
        String connectQuery = "INSERT INTO account  (first_name,last_name,Branch) VALUES ('"+firstName.getText()+"','"+Last_Name.getText()+"','"+Branch.getText()+"')";

        Statement statement = connectDB.createStatement();
        try {
            statement.executeUpdate(connectQuery);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("query executed successfully");

    }
*/
















/*

import javafx.beans.value.ChangeListener;
        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.ListView;
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

        int j = 0;
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
}
*/
