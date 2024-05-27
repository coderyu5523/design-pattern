module com.example.designpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.designpattern to javafx.fxml;
    exports com.example.designpattern;
}