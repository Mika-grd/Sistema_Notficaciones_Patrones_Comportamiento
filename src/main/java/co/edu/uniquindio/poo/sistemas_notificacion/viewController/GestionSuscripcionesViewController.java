package co.edu.uniquindio.poo.sistemas_notificacion.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class GestionSuscripcionesViewController {

    @FXML
    private Label lblUsuario;

    @FXML
    private TableView<?> tablaEventos;

    @FXML
    private TableColumn<?, ?> colTipoEvento;

    @FXML
    private Button btnSuscribirse;

    @FXML
    private Button btnDesuscribirse;

    @FXML
    private TableColumn<?, ?> colSuscrito;

    @FXML
    void onSuscribirseClick(ActionEvent event) {
        //logica para suscribirse

    }

    @FXML
    void onDesuscribirseClick(ActionEvent event) {
        //logica para desuscribirse

    }

}
