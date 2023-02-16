package com.example.mybankingapplication3;

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


    public void Back(ActionEvent event) throws IOException {

        Main m = new Main();

        m.changeScene("Menu.fxml");
    }

}
