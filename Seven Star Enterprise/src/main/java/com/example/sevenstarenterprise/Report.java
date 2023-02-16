package com.example.sevenstarenterprise;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.util.Collection;

import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

public class Report implements Initializable {

    public Button button6;
    public Button button7;
    public Button BackButton;

    public Button search;
    public ComboBox combo;
    @FXML
    private Label Label;
    @FXML
    private ChoiceBox<String> myChoiceBox;

    @FXML
    private TextField searchBar;
    @FXML
    private ListView<String> listView;
    String Data;
    Main obj1 = new Main();
    private ArrayList<String> arrayList;


    @FXML
    void search(ActionEvent event) {

        listView.getItems().clear();
        listView.getItems().addAll(searchList(searchBar.getText(), words));

    }


    public void Back(ActionEvent event) throws IOException {

        obj1.changeScene("Menu.fxml");

    }







    private String[] food = {"Today", "Weekly", "Monthly", "Six-Months", "Yearly", "Overall"};

    //public class Controller implements Initializable {

    ArrayList<String> words = new ArrayList<>(

            Arrays.asList("Islamabad", "Rawalpindi", "Lahore", "Karachi", "Peshawer", "Bannu", "Rawat", "Mandi Bahawaldin", "Sawat", "Taxila", "Gawadar", "Faisalabad", "Add New City"));





    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        myChoiceBox.setValue("Today");
        myChoiceBox.getItems().addAll(food);

        Data = String.valueOf(myChoiceBox.getItems());
        //myChoiceBox.setValue("Islamabad");


        //listView.setEditable(true);
        //SortedList<String> sortedList = new SortedList(words);
     /*   ObservableList<String> sortedList = FXCollections.observableArrayList(words);
        listView.setItems(sortedList);
        listView.getItems().addAll(sortedList);*/

        //SortedList<String> sortedList = new SortedList<>(FXCollections.observableArrayList(words));
        /*ObservableList<String> sortedList = FXCollections.observableArrayList(words);
        listView.setItems(sortedList);*/
    }














    public void EnterButton(ActionEvent event) throws IOException {



            if ("Today" == myChoiceBox.getValue()) {
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ReportToday.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(fxmlLoader.load());
                stage.setTitle("ReportToday.fxml");
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.show();
            }


            if ("Weekly" == myChoiceBox.getValue()) {
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ReportWeekly.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(fxmlLoader.load());
                stage.setTitle("ReportWeekly.fxml");
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.show();
            }


            if ("Monthly" == myChoiceBox.getValue()) {
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ReportMonthly.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(fxmlLoader.load());
                stage.setTitle("ReportMonthly.fxml");
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.show();
            }

            if ("Six-Months" == myChoiceBox.getValue()) {
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ReoprtSix-Months.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(fxmlLoader.load());
                stage.setTitle("ReoprtSix-Months.fxml");
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.show();
            }

            if ("Yearly" == myChoiceBox.getValue()) {
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ReportYearly.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(fxmlLoader.load());
                stage.setTitle("ReportYearly.fxml");
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.show();
            }

        if ("Overall" == myChoiceBox.getValue()) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ReportOverall.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("ReportOverall.fxml");
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        }

    }


    private List<String> searchList (String searchWords, List<String> listOfStrings) {

        List<String> searchWordsArray = Arrays.asList(searchWords.trim().split(" "));

        return listOfStrings.stream().filter(input -> {

            return searchWordsArray.stream().allMatch (word ->

                    input.toLowerCase().contains (word.toLowerCase()));

        }).collect (Collectors.toList());

    }


}
