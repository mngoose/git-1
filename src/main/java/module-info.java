module com.example.git1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.git1 to javafx.fxml;
    exports com.example.git1;
}