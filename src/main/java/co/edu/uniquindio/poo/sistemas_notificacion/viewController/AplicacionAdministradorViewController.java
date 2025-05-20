package co.edu.uniquindio.poo.sistemas_notificacion.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class AplicacionAdministradorViewController {

    @FXML
    private TextArea cuadroPush;

    @FXML
    private Button btnGestionClientes;

    @FXML
    private Button btnGestionEventos;

    @FXML
    private Button btnRegistrarEventos;

    @FXML
    private Button btnCrearNotificacion;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private ImageView iconoSms;

    @FXML
    private ImageView iconoEmail;

    @FXML
    private Label contadorSms;

    @FXML
    private Label contadorEmail;

    // Métodos para acciones de botones
    @FXML
    void onGestionClientesClick() {
        // Lógica para ir a la gestión de clientes
    }

    @FXML
    void onGestionEventosClick() {
        // Lógica para ir a la gestión de eventos
    }

    @FXML
    void onRegistrarEventosClick() {
        // Lógica para registrar nuevos eventos
    }

    @FXML
    void onCrearNotificacionClick() {
        // Lógica para crear una nueva notificación
    }

    @FXML
    void onCerrarSesionClick() {
        // Lógica para volver al login principal
    }

    @FXML
    void onEmailClick() {
        // Mostrar o gestionar notificaciones email
    }

    @FXML
    void onSMSClick() {
        // Mostrar o gestionar notificaciones SMS
    }

    // Utilidades para la vista
    public void mostrarNotificacionPush(String mensaje) {
        cuadroPush.setText(mensaje);
    }

    public void actualizarContadores(int sms, int email) {
        contadorSms.setText(String.valueOf(sms));
        contadorEmail.setText(String.valueOf(email));
    }

    public void limpiarNotificacion() {
        cuadroPush.clear();
    }
}
