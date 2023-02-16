package com.example.mybankingapplication3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;


public class DatabaseConnection {




    public Connection databaseLink;

    public Connection getConnection() {

        String databaseName = "mybankingapplication";

        String databaseUser = "root";

        String databasePassword = "12345";

        String url = "jdbc:mysql://localhost/";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url + databaseName, databaseUser, databasePassword);

        }
        catch (Exception e) {

            e.printStackTrace();
        }
        return databaseLink;
    }


           /*     try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mybankingapplication","root","p@ssword");

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }
        catch(Exception e){ System.out.println(e);
    }
*/


}
