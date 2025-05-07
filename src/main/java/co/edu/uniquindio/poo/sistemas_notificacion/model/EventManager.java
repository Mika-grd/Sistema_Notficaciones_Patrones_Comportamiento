package co.edu.uniquindio.poo.sistemas_notificacion.model;

import java.util.LinkedList;

public abstract class EventManager {

    private LinkedList<User> suscriptores = new LinkedList<>();
    private String mensajeEvento;
    private String tipoEvento;


    public EventManager() {
        this.mensajeEvento = "";
    }

    public void añadirSuscriptor(User suscriptor) {}
    public void eliminarSuscriptor(User suscriptor) {}

    public LinkedList<User> getSuscriptores() {
        return suscriptores;
    }

    public void setSuscriptores(LinkedList<User> suscriptores) {
        this.suscriptores = suscriptores;
    }

    public String getMensajeEvento() {
        return mensajeEvento;
    }

    public void setMensajeEvento(String mensajeEvento) {
        this.mensajeEvento = mensajeEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
}
