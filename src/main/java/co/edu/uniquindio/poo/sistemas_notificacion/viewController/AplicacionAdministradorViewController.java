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

public class AplicacionAdministradorViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Button btnCrearNotificacion;

    @FXML
    private Button btnGestionClientes;

    @FXML
    private Button btnGestionEventos;


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

    @FXML
    private Button verEmailBoton;

    @FXML
    private Button verSMSboton;

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
    void onCrearNotificacionClick(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/sistemas_notificacion/Aplications/admin/CrearNotificacion.fxml"));
            Scene newScene = new Scene(loader.load());

            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            currentStage.setScene(newScene);
            currentStage.setTitle("CrearNotificacion");

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
    void onGestionClientesClick(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/sistemas_notificacion/Aplications/admin/CRUD_clientes.fxml"));
            Scene newScene = new Scene(loader.load());

            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            currentStage.setScene(newScene);
            currentStage.setTitle("CRUD_clientes");

        } catch (IOException e) {
            System.out.println("Error al cargar la nueva ventana: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @FXML
    void onGestionEventosClick(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/sistemas_notificacion/Aplications/admin/GestionarSuscripcionesAdmin.fxml"));
            Scene newScene = new Scene(loader.load());

            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            currentStage.setScene(newScene);
            currentStage.setTitle("CRUD_eventos");

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

    @FXML
    void initialize() {
        assert btnCerrarSesion != null : "fx:id=\"btnCerrarSesion\" was not injected: check your FXML file 'AplicacionAdministrador.fxml'.";
        assert btnCrearNotificacion != null : "fx:id=\"btnCrearNotificacion\" was not injected: check your FXML file 'AplicacionAdministrador.fxml'.";
        assert btnGestionClientes != null : "fx:id=\"btnGestionClientes\" was not injected: check your FXML file 'AplicacionAdministrador.fxml'.";
        assert btnGestionEventos != null : "fx:id=\"btnGestionEventos\" was not injected: check your FXML file 'AplicacionAdministrador.fxml'.";
        assert contadorEmail != null : "fx:id=\"contadorEmail\" was not injected: check your FXML file 'AplicacionAdministrador.fxml'.";
        assert contadorSms != null : "fx:id=\"contadorSms\" was not injected: check your FXML file 'AplicacionAdministrador.fxml'.";
        assert cuadroPush != null : "fx:id=\"cuadroPush\" was not injected: check your FXML file 'AplicacionAdministrador.fxml'.";
        assert iconoEmail != null : "fx:id=\"iconoEmail\" was not injected: check your FXML file 'AplicacionAdministrador.fxml'.";
        assert iconoSms != null : "fx:id=\"iconoSms\" was not injected: check your FXML file 'AplicacionAdministrador.fxml'.";
        assert verEmailBoton != null : "fx:id=\"verEmailBoton\" was not injected: check your FXML file 'AplicacionAdministrador.fxml'.";
        assert verSMSboton != null : "fx:id=\"verSMSboton\" was not injected: check your FXML file 'AplicacionAdministrador.fxml'.";

    }

}

