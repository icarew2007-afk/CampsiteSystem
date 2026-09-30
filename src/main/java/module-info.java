module org.example.campsitemanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.campsitemanagementsystem to javafx.fxml;
    exports org.example.campsitemanagementsystem;
}