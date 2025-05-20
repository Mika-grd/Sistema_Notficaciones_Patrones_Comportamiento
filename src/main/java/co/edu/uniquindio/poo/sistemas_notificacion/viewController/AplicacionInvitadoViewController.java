package co.edu.uniquindio.poo.sistemas_notificacion.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.sistemas_notificacion.model.Sesion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class AplicacionInvitadoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private TextArea cuadroPush;

    Sesion sesion = Sesion.getInstance();

    @FXML
    public void onCerrarSesionClick(ActionEvent event) {
        sesion.setUsuario(null);

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/sistemas_notificacion/Logins/Login.fxml"));
            Scene newScene = new Scene(loader.load());

            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            currentStage.setScene(newScene);
            currentStage.setTitle("Login");

        } catch (IOException e) {
            System.out.println("Error al cargar la nueva ventana: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {

        var primeraNotificacion = sesion.getUsuario().getNotificaciones().peekFirst();
        if (primeraNotificacion != null && primeraNotificacion.getMensaje() != null) {
            cuadroPush.setText(primeraNotificacion.getMensaje());
        }

        assert btnCerrarSesion != null : "fx:id=\"btnCerrarSesion\" was not injected: check your FXML file 'AplicacionInvitado.fxml'.";
        assert cuadroPush != null : "fx:id=\"cuadroPush\" was not injected: check your FXML file 'AplicacionInvitado.fxml'.";

    }

}




