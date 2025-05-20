package co.edu.uniquindio.poo.interfacesgraficassistemanoti.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LoginViewController {

    @FXML
    void onClientLogin(ActionEvent event) {
        System.out.println("Iniciar como Usuario");
        // deve ir a la pestaña del loginCliente
    }

    @FXML
    void onAdminLogin(ActionEvent event) {
        System.out.println("Iniciar como Administrador");
        // debe ir a la pestaña del loginAdministrador
    }

    @FXML
    void onGuestAccess(ActionEvent event) {
        System.out.println("Entrar como Invitado");
        // pasar sin credenciales
    }
}
