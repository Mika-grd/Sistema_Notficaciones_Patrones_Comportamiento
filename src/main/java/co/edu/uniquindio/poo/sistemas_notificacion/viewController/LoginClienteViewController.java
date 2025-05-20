package co.edu.uniquindio.poo.interfacesgraficassistemanoti.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginClienteViewController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    void onVolverClick(ActionEvent event) {
        // debe regresar a la pestaña de login
    }

    @FXML
    void onLoginClick(ActionEvent event) {
        // debe ir a la vista del cliente
    }

}
