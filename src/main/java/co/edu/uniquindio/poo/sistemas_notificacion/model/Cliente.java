package co.edu.uniquindio.poo.sistemas_notificacion.model;

public class Cliente extends User {
    public String nombreUsuario;
    public String contraseña;


    public Cliente(String nombre, String email, String telefono, Template template, NotificationStrategy preferredStrategy, String nombreUsuario, String contraseña) {
        super(nombre, email, telefono, template, preferredStrategy);
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

}
