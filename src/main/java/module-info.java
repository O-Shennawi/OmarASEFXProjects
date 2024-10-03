module com.example.omar_fxprojects {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.omar_fxprojects to javafx.fxml;
    exports com.example.omar_fxprojects;
}