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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class AplicacionClienteViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Button btnGestionarSuscripciones;

    @FXML
    private Label contadorEmail;

    @FXML
    private Label contadorSms;

    @FXML
    private TextArea cuadroPush;

    @FXML
    private ImageView iconoEmail;

    @FXML
    private ImageView iconoSms;

    Sesion sesion = Sesion.getInstance();

    @FXML
    void onCerrarSesionClick(ActionEvent event) {
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
    void onEmailClick(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/sistemas_notificacion/Aplications/cliente/ClienteEmail.fxml"));
            Scene newScene = new Scene(loader.load());

            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            currentStage.setScene(newScene);
            currentStage.setTitle("Email");

        } catch (IOException e) {
            System.out.println("Error al cargar la nueva ventana: " + e.getMessage());
            e.printStackTrace();
        }

    }

    @FXML
    void onGestionarClick(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/sistemas_notificacion/Aplications/cliente/GestionarSuscripciones.fxml"));
            Scene newScene = new Scene(loader.load());

            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            currentStage.setScene(newScene);
            currentStage.setTitle("Suscripciones");

        } catch (IOException e) {
            System.out.println("Error al cargar la nueva ventana: " + e.getMessage());
            e.printStackTrace();
        }

    }

    @FXML
    void onSMSClick(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/sistemas_notificacion/Aplications/cliente/ClienteSMS.fxml"));
            Scene newScene = new Scene(loader.load());

            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            currentStage.setScene(newScene);
            currentStage.setTitle("SMS");

        } catch (IOException e) {
            System.out.println("Error al cargar la nueva ventana: " + e.getMessage());
            e.printStackTrace();
        }

    }


    public void mostrarNotificacionPush() {

        limpiarNotificacion();
        var primeraNotificacion = sesion.getUsuario().getNotificaciones().peekFirst();
        if (primeraNotificacion != null && primeraNotificacion.getMensaje() != null) {
            cuadroPush.setText(primeraNotificacion.getMensaje());
        }
    }


    public void limpiarNotificacion() {
        cuadroPush.clear();
    }


    @FXML
    void initialize() {

        mostrarNotificacionPush();

        assert btnCerrarSesion != null : "fx:id=\"btnCerrarSesion\" was not injected: check your FXML file 'AplicacionCliente.fxml'.";
        assert btnGestionarSuscripciones != null : "fx:id=\"btnGestionarSuscripciones\" was not injected: check your FXML file 'AplicacionCliente.fxml'.";
        assert contadorEmail != null : "fx:id=\"contadorEmail\" was not injected: check your FXML file 'AplicacionCliente.fxml'.";
        assert contadorSms != null : "fx:id=\"contadorSms\" was not injected: check your FXML file 'AplicacionCliente.fxml'.";
        assert cuadroPush != null : "fx:id=\"cuadroPush\" was not injected: check your FXML file 'AplicacionCliente.fxml'.";
        assert iconoEmail != null : "fx:id=\"iconoEmail\" was not injected: check your FXML file 'AplicacionCliente.fxml'.";
        assert iconoSms != null : "fx:id=\"iconoSms\" was not injected: check your FXML file 'AplicacionCliente.fxml'.";

    }

}







