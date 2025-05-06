package co.edu.uniquindio.poo.sistemas_notificacion.model;

public abstract class Template {

    private User usuario;
    private String nombre;

    public Template(User usuario) {
        this.usuario = usuario;
        this.nombre = usuario.getNombre();
    }

    void formatMessage() {};

    private void generarEncabezado() {};
    private void generarMensaje() {};
}
