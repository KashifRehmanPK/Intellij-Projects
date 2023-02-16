package com.example.sevenstarenterprise;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

import java.util.*;

public class CASHIN implements Initializable {
    public Button BackButton;
    public Button Back;
    public Label label;
    public TextField mazdori;
    public TextField kharcha;
    public TextField comission;
    public TextField kham_bikri;
    public TextField pukhta_bikri;
    public TextField karaya;
    public TextField telliphone;
    public TextField godam_karaya;
    public TextField manshana;
    public TextField number;
    public TextField name;
    public TextField adda;
    public TextField kul_total;


   // @FXML
   // ListView<String> list;
    //String[] listData = {"Jan", "Feb", "Mar"};

    //String data[];


  //  BorderPane root = new BorderPane();













    // list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){





///////////////////////////////////////////////CLOCK////////////////////////////////////////////////
 /*public void clock()
    {
        Thread clock = new Thread(() -> {
            try {
                while (true) {
                    Calendar cal = new GregorianCalendar();
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    int month = cal.get(Calendar.MONTH);
                    int year = cal.get(Calendar.YEAR);
                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR);
                    label.setText("Time  " + ""+hour + ":" + minute + ":" + second + "   Date " + year + "/" + month + "/" + day);
                    System.out.println(label);
                    Thread.sleep(1000);

                }
            }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
        });
        clock.start();

    }*/










/*
 public CASHIN() {

    //    initialize();
        clock();
    }
*/



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        //clock();-------------------------------------------------------------------------





        // LocalDate localDate = LocalDate.now();
        //System.out.println(localDate);
       // label.setText(String.valueOf(localDate));


    }







/////////////////////////////////////////////////////BACK////////////////////////////////////////////////
    public void Back(ActionEvent event) throws IOException {

        Main obj1 = new Main();

        //System.out.println("11");
        obj1.changeScene("Menu.fxml");
        //System.out.println("22");
    }


    public void MouseClicked(MouseEvent mouseEvent) throws SQLException {


        System.out.println("entered");
        //Save_Page.setImage(MouseClicked);
       // public void CreateAccount(ActionEvent event) throws SQLException {

            DatabaseConnection connectNow = new DatabaseConnection();

            Connection connectDB = connectNow.getConnection();

            //String connectQuery = "INSERT INTO account ('first_name','last_name','Branch') VALUES ('"+firstName.getText()+"','"+Last_Name.getText()+"','"+Branch.getText()+"')";
            String connectQuery = "INSERT INTO account  (Name,Address,خام بکری,خرچہ,پختہ بکری,کرایہ,گودام کرایہ,کمشن,مزدوری,ٹیلیفون,منشانہ,کُل ٹوٹل) " +
                    "VALUES ('"+name.getText()+"','"+adda.getText()+"','"+kham_bikri.getText()+"','"+kharcha.getText()+"','"+pukhta_bikri.getText()+"','"+karaya.getText()+"','"+godam_karaya.getText()+"','"+comission.getText()+"','"+mazdori.getText()+"','"+telliphone.getText()+"','"+manshana.getText()+"','"+kul_total.getText()+"')";

            Statement statement = connectDB.createStatement();
            try {
                statement.executeUpdate(connectQuery);
            }
            catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("query executed successfully");

        }





}
