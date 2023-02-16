package com.example.print;

import javafx.event.ActionEvent;

import java.awt.*;
import java.sql.Date;
import java.sql.ResultSet;

public class Report_Controller {



    private int ID;
    private int Diya;
    private int Baki;

    private String Date;
    private String Name;
    private String Cheezan;
    private int Tadad;
    private int Rate;
    private int Small_Total;
    private  String Adda_Location;
    private int Telliphone;

    private Button button;



    Report_Controller(){
        this.button = new Button("Send");
    }





    //    public Report_Controller() {
//        String print;
//
//        Button update;
//
//    }
//    public Report_Controller(Button button) {
//        this.button = button;
//    }
    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }










    public Report_Controller(int id,String date,String name,int small_Total,String adda_Location,int telliphone) {
        ID = id;
        Date = date;
        Name = name;
        // Cheezan = cheezan;
        // Tadad = tadad;
        //Rate = rate;
        Small_Total = small_Total;
        Adda_Location = adda_Location;
        Telliphone = telliphone;


    }

    public Report_Controller(String cheezan, int tadad, int rate, int small_total) {
        Cheezan = cheezan;
        Tadad = tadad;
        Rate = rate;
        Small_Total=small_total;
    }



    /////////////////////Getter and setters//////////////////////////////


    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCheezan() {
        return Cheezan;
    }

    public void setCheezan(String cheezan) {
        Cheezan = cheezan;
    }

    public int getTadad() {
        return Tadad;
    }

    public void setTadad(int tadad) {
        Tadad = tadad;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int Rate) {
        this.Rate = Rate;
    }

    public int getSmall_Total() {
        return Small_Total;
    }

    public void setSmall_Total(int small_Total) {
        Small_Total = small_Total;
    }

    public String getAdda_Location() {
        return Adda_Location;
    }

    public void setAdda_Location(String adda_Location) {
        Adda_Location = adda_Location;
    }

    public int getTelliphone() {
        return Telliphone;
    }

    public void setTelliphone(int Telliphone) {
        this.Telliphone = Telliphone;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDiya() {
        return Diya;
    }

    public void setDiya(int diya) {
        Diya = diya;
    }

    public int getBaki() {
        return Baki;
    }

    public void setBaki(int baki) {
        Baki = baki;
    }


    ///////////////////////////////////////////////////////////////


}
