module ca.teletact.ja002 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.teletact.ja002 to javafx.fxml;
    exports ca.teletact.ja002;
}