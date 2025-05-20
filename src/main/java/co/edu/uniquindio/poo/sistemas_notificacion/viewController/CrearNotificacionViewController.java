package co.edu.uniquindio.poo.sistemas_notificacion.viewController;

import co.edu.uniquindio.poo.sistemas_notificacion.model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CrearNotificacionViewController {

    @FXML
    private ComboBox<EventManager> comboEventos;

    @FXML
    private TextField campoMensaje;

    @FXML
    private Button btnEnviar;

    private final ObservableList<EventManager> listaEventos = FXCollections.observableArrayList();

    SistemaNotificaciones sistemaNotificaciones = SistemaNotificaciones.getInstance();

    @FXML
    public void initialize() {
        // Cargar los eventos disponibles en el ComboBox
        comboEventos.setItems(listaEventos);
        comboEventos.setPromptText("Seleccione un evento");

        listaEventos.setAll(
                new EventoInformacion(),
                new EventoPromocion(),
                new EventoSeguridad()
        );
    }


    @FXML
    public void onEnviarNotificacion() {
        EventManager eventoSeleccionado = comboEventos.getValue();
        String mensaje = campoMensaje.getText();

        if (eventoSeleccionado == null || mensaje.isBlank()) {
            mostrarAlerta("Por favor seleccione un evento y escriba un mensaje.");
            return;
        }

        sistemaNotificaciones.generarMensajeBase(eventoSeleccionado, mensaje);
        sistemaNotificaciones.generarNotificaciones(eventoSeleccionado);

        mostrarConfirmacion("Notificaciones enviadas correctamente.");
        campoMensaje.clear();
        comboEventos.getSelectionModel().clearSelection();
    }

    private void mostrarAlerta(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Advertencia");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private void mostrarConfirmacion(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Éxito");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}

