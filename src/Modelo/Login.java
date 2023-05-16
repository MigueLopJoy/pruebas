package Modelo;
public class Login  implements elementoModelo {
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

    @Override
    public String getInsertString() {
        return "INSERT INTO logins (nombre_usuario, contraseña) VALUES ('" + this.nombreUsuario + "', '" + this.contraseña + "');";
    }

    @Override
    public String getDeleteString() {
        return "DELETE FROM logins WHERE idLogin = " + getIdFromDB() + ";";
    }

    @Override
    public int getIdFromDB() {
        return 0;
    }
}
