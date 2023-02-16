package com.example.print;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public Connection databaseLink;

    public Connection getConnection() {

        String databaseName = "star seven enterprise";

        String databaseUser = "root";

        String databasePassword = "12345";

        String url = "jdbc:mysql://localhost/";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url + databaseName, databaseUser, databasePassword);

        } catch (Exception e) {

            e.printStackTrace();
        }
        return databaseLink;
    }

}
