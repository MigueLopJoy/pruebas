package Modelo;

public class Login {
    private int idLogin;
    private String nombreUsuario;
    private String contraseña;

    public Login() {
        super();
    }

    public Login(String nombreUsuario, String contraseña) {
        super();
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
