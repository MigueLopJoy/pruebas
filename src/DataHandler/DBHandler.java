package DataHandler;

import Modelo.Login;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHandler {

    public static Usuario getUsuario(String sql) {
        DBConnection dbConnection = new DBConnection("root", "1234");
        Connection connection = dbConnection.getConnection();
        ResultSet resultSet = null;
        Statement statement = null;
        Usuario usuario = null;
        Login login = null;
        int idLogin;
        int idUsuario = 0;
        String nombre = "";

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                idUsuario = resultSet.getInt("idUsuario");
                nombre = resultSet.getString("nombre");
                idLogin = resultSet.getInt("idLogin");
                login = getLogin("SELECT * FROM logins WHERE idLogin = " + idLogin + ";");
            }
            usuario = new Usuario(idUsuario, nombre, login);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(statement);
            closeResultset(resultSet);
            closeConnection(connection);
        }
        return usuario;
    }

    public static Login getLogin(String sql) {
        DBConnection dbConnection = new DBConnection("root", "1234");
        Connection connection = dbConnection.getConnection();
        ResultSet resultSet = null;
        Statement statement = null;
        Login login = null;
        int idLogin = 0;
        String nombreUsuario = "";
        String contraseña = "";

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                idLogin = resultSet.getInt("idLogin");
                nombreUsuario = resultSet.getString("nombre_usuario");
                contraseña = resultSet.getString("contrasña");
            }
            login = new Login(idLogin, nombreUsuario, contraseña);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(statement);
            closeResultset(resultSet);
            closeConnection(connection);
        }
        return login;
    }
    public static boolean hayRegistros(String sql) {
        DBConnection dbConnection = new DBConnection("root", "1234");
        Connection connection = dbConnection.getConnection();
        ResultSet resultSet = null;
        Statement statement = null;
        boolean hayRegistros = false;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                hayRegistros = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(statement);
            closeConnection(connection);
        }

        return hayRegistros;
    }
    public static void executeUpdate(String sql) {
        DBConnection dbConnection = new DBConnection("root", "1234");
        Connection connection = dbConnection.getConnection();
        Statement statement = null;
        int updates;

        try {
            statement = connection.createStatement();
            updates = statement.executeUpdate(sql);
            if (updates >= 1) {
                System.out.println("Operacion realizada con exito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void closeStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeResultset(ResultSet resultset) {
        try {
            if (resultset != null) {
                resultset.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
