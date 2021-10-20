module ca.teletact.ja001 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.teletact.ja001 to javafx.fxml;
    exports ca.teletact.ja001;
}