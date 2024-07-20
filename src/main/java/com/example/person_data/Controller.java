package com.example.person_data;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void onButtonClicked (){
        System.out.println("button gedruckt");
    }

    public void btnVerbindung(ActionEvent event){
        Database_connection connectNow = new Database_connection();
        Connection connectDB = connectNow.getConnection();

        String connectQuery = "SELECT UserName FROM UserAccount";

        try{
            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(connectQuery);

            while (queryOutput.next()) {
                String userName = queryOutput.getString("UserName");
                System.out.println("User Name: " + userName);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

