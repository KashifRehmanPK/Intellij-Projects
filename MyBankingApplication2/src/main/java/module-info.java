module com.example.mybankingapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;
    requires javafx.base;


    opens com.example.mybankingapplication to javafx.fxml;
    exports com.example.mybankingapplication;
}