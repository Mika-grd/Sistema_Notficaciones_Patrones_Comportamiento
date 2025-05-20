package co.edu.uniquindio.poo.sistemas_notificacion.model;

public class Sesion {

    private User usuario;
    private static Sesion instance;

    private Sesion() {
    }

    public static Sesion getInstance() {
        if (instance == null) {
            synchronized (Sesion.class) {

                if (instance == null) {
                    instance = new Sesion();
                }
            }
        }
        return instance;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
}
