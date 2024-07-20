package com.example.person_data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database_connection {
    public Connection databaseLink;

    public Connection getConnection() {
        String databaseName = "personendaten";
        String databaseUser = "root";
        String databasePassword ="";
        String url = "jdbc:mysql://localhost/" + databaseName;

        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);

        } catch (Exception e) {
            e.printStackTrace();
        }
         return databaseLink;
    }

}
