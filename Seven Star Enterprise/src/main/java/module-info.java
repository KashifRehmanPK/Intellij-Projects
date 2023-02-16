module com.example.sevenstarenterprise {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.sevenstarenterprise to javafx.fxml;
    exports com.example.sevenstarenterprise;
}