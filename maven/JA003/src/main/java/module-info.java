module ca.teletact.ja003 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.teletact.ja003 to javafx.fxml;
    exports ca.teletact.ja003;
}