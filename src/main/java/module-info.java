module com.example.week02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week02 to javafx.fxml;
    exports com.example.week02;
}