package co.edu.uniquindio.poo.sistemas_notificacion.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class AplicacionClienteViewController {

    @FXML
    private TextArea cuadroPush;

    @FXML
    private Button btnGestionarSuscripciones;

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

    @FXML
    void onGestionarClick() {
        // debe ir a la pestaña que gestione las suscripciones
    }

    @FXML
    void onCerrarSesionClick() {
        // que vaya al login principal
    }
    @FXML
    void onEmailClick(){
        //que vaya o que inicie el cuadro donde esten las notificaciones email
    }
    @FXML
    void onSMSClick(){
        //que vaya o que inicie el cuadro donde estan las notificaciones sms

    }

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
