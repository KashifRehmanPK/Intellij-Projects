module com.example.print {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;


    opens com.example.print to javafx.fxml;
    exports com.example.print;
}