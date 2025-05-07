package co.edu.uniquindio.poo.sistemas_notificacion.model;

public class SistemaNotificaciones {

    public String generarMensajeBase(EventManager evento, String mensaje) {
        evento.setMensajeEvento(mensaje);
        return "mensaje set to: " + evento.getMensajeEvento();
    }

    private String generarNotificacion(User user, EventManager evento) {
        String mensajeBase = evento.getMensajeEvento();
        String mensajeFormateado = user.getTemplate().formatMessage(user, mensajeBase);
        String metodoEnvio = user.getPreferredStrategy().buildNotification(user);

        return mensajeFormateado + "\n\n" + metodoEnvio;
    }


    public void generarNotificaciones(EventManager evento){
        for (User suscriptor : evento.getSuscriptores()){
            generarNotificacion(suscriptor, evento);
        }
    }


}
