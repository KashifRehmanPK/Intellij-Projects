package com.example.sevenstarenterprise;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class BookTypes {


    public Button CashBook;
    public Button UdhaarBook;

    Main obj1 = new Main();

    public void CashBookButton(ActionEvent event) {
    }

    public void UdhaarBookButton(ActionEvent event) {
    }

    public void BackButton(ActionEvent event) throws IOException {


            obj1.changeScene("Menu.fxml");
        }
    }