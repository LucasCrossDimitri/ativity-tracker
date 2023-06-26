module com.exemple {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.exemple to javafx.fxml;
    exports com.exemple;
}
