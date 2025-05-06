package co.edu.uniquindio.poo.sistemas_notificacion.model;

import java.util.LinkedList;

public abstract class EventManager {

    private LinkedList<User> suscriptores = new LinkedList<>();

    public void añadirSuscriptor(User suscriptor) {}
    public void eliminarSuscriptor(User suscriptor) {}

}
