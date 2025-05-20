package co.edu.uniquindio.poo.sistemas_notificacion;

import co.edu.uniquindio.poo.sistemas_notificacion.model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/sistemas_notificacion/Logins/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        Sesion sesion = Sesion.getInstance();

        SistemaNotificaciones sistemaNotificaciones = SistemaNotificaciones.getInstance();

        Invitado invitado = Sesion.getInstance().getInvitado();

        invitado.agregarSuscripcion(sistemaNotificaciones.getEventoPromocion());

        sistemaNotificaciones.añadir(invitado, true);

        sistemaNotificaciones.generarMensajeBase(sistemaNotificaciones.getEventoPromocion(), "Promocion Disponible!");

        sistemaNotificaciones.generarNotificaciones(sistemaNotificaciones.getEventoPromocion());




        launch();
    }



}