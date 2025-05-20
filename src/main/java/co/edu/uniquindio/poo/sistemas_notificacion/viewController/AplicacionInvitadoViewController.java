package co.edu.uniquindio.poo.sistemas_notificacion.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.Node;

public class AplicacionInvitadoViewController {

    @FXML
    private TextArea cuadroPush;

    @FXML
    private Button btnCerrarSesion;

    public void mostrarNotificacionPush(String mensaje) {
        if (mensaje != null && !mensaje.isBlank()) {
            cuadroPush.appendText(mensaje + "\n\n");
        }
    }

    @FXML
    public void onCerrarSesionClick(ActionEvent event) {
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setTitle("Sesión Cerrada");
        alerta.setHeaderText(null);
        alerta.setContentText("Has cerrado sesión como invitado.");
        alerta.showAndWait();

        // Cierra la ventana actual
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();

    }
}
