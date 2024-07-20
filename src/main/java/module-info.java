module person_data{
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;


    opens com.example.person_data to javafx.controls,javafx.fxml, javafx.graphics;


}