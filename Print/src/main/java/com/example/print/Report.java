package com.example.print;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class Report {

    Double bHeight = 10.0;

    public Button Back;
    public javafx.scene.control.DatePicker DatePicker;

    public Button PrintAll;
    // public TableColumn<Report_Controller,Button> Print_Column;


    public String ReportButtonClicked = null;
    public int x1 = 0;
    Main obj1 = new Main();

    @FXML
    //ListView<String> list;
    ListView<String> Report_Controller;
    String[] listData = {"Jan", "Feb", "Mar"};

    //String data[];
    Date data[];

    Date localDate = null;
    String connectQuery = null;

    BorderPane root = new BorderPane();


    public void Monthly_Action(ActionEvent actionEvent) {
        DatePicker.getEditor().clear();

        ObservableList<Report_Controller> dataClassList;
        com.example.print.DatabaseConnection connectNow = new com.example.print.DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

//        String connectQuery = "Select cash_in_sell.Date, cash_in_sell.Name,cash_in_sell.Adda_Location, cash_in_sell.telliphone"+
//                "FROM cash_in_sell" +
//                "WHERE Date BETWEEN DATE_SUB(NOW(), INTERVAL 30 DAY) AND NOW();";
        connectQuery = "SELECT cash_in_sell.ID,cash_in_sell.Date, cash_in_sell.Name, cash_in_sell.kul_total, cash_in_sell.Adda_Location, cash_in_sell.telliphone " +
                " FROM cash_in_sell "+
                "WHERE Date BETWEEN DATE_SUB(NOW(), INTERVAL 30 DAY) AND NOW()";

        try {

            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(connectQuery);

            //int sum = 0;

            while (queryOutput.next()) {

//                System.out.println(queryOutput.getString("Date"));
//                System.out.println(queryOutput.getString("Name"));
//                System.out.println(queryOutput.getString("Cheezan"));
//                System.out.println(queryOutput.getString("Tadad"));
//                System.out.println(queryOutput.getString("Rate"));
//                System.out.println(queryOutput.getString("Small_Total"));
//                System.out.println(queryOutput.getString("Adda_Location"));
//                System.out.println(queryOutput.getString("Telliphone"));

                SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd h:mm a");
                Report_Controller dc = new Report_Controller(
                        queryOutput.getInt("ID"),
                        (queryOutput.getDate("Date")) + " " + (queryOutput.getTime("Date")),
                        queryOutput.getString("Name"),
                        //queryOutput.getString("Cheezan"),
                        //queryOutput.getInt("Tadad"),
                        //queryOutput.getInt("Rate"),
                        queryOutput.getInt("kul_total"),
                        queryOutput.getString("Adda_Location"),
                        queryOutput.getInt("Telliphone"));
                //Integer.parseInt(queryOutput.getString(

            }
            // tableView.setItems(null);


            ReportButtonClicked = "Monthly";
            localDate = null;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
