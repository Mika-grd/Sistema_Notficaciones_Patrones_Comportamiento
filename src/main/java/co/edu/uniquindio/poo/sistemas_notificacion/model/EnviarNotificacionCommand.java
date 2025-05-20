package co.edu.uniquindio.poo.sistemas_notificacion.model;

public class EnviarNotificacionCommand implements ComandoNotificacion {
    private Notificacion notificacion;
    private NotificacionHandler cadenaValidacion;

    public EnviarNotificacionCommand(Notificacion notificacion) {
        this.notificacion = notificacion;

        // Construir la cadena de validación
        ValidarMensajeHandler validarMensaje = new ValidarMensajeHandler();
        ValidarUsuarioBloqueadoHandler validarUsuario = new ValidarUsuarioBloqueadoHandler();
        validarMensaje.setNext(validarUsuario);
        this.cadenaValidacion = validarMensaje;
    }

    @Override
    public void ejecutar() throws Exception {
        // Validación
        cadenaValidacion.handle(notificacion);

        // Simular envío
        System.out.println("Enviando notificación a " + notificacion.getUsuario().getNombre());
        System.out.println("Mensaje:\n" + notificacion.getMensaje());
    }
}
