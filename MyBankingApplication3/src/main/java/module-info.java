module com.example.mybankingapplication3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.mybankingapplication3 to javafx.fxml;
    exports com.example.mybankingapplication3;
}