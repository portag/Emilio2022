module org.jaroso.JavaFXEmilio {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.jaroso.JavaFXEmilio to javafx.fxml;
    exports org.jaroso.JavaFXEmilio;
}
