module com.example.labweek8 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.labweek8 to javafx.fxml;
    exports com.example.labweek8;
}