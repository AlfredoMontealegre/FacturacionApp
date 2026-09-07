module ni.uam.edu.facturacionapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.uam.edu.facturacionapp to javafx.fxml;
    exports ni.uam.edu.facturacionapp;
}