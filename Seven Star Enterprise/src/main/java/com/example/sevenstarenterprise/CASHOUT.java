
package com.example.sevenstarenterprise;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class CASHOUT {

    public Button BackButton;
    Main obj1 = new Main();


    public void Back(ActionEvent event) throws IOException {


        System.out.println("11");
        obj1.changeScene("Menu.fxml");
        System.out.println("22");
    }

}
