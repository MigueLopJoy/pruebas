package Modelo;

public class Usuario implements elementoModelo{

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

    @Override
    public String getInsertString() {
        return "INSERT INTO usuarios (nombre, idLogin) VALUES ('" + this.nombre + "', " + this.login.getIdLogin() + ");";
    }
    @Override
    public String getDeleteString() {
        return "DELETE FROM usuarios WHERE idUsuario = " + getIdFromDB() + ";";
    }

    @Override
    public int getIdFromDB() {
        return 0;
    }
}
