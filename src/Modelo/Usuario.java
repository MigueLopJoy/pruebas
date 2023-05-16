package Modelo;

public class Usuario {

    private int idUsuario;
    private String nombre;

    private Login login;
    public Usuario() {
        super();
    }

    public Usuario(String nombre, Login login) {
        super();
        this.nombre = nombre;
        this.login = login;
    }
    public Usuario(int idUsuario, String nombre, Login login) {
        super();
        this.idUsuario = idUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
