package TP9.database;

import TP9.util.DBConfigLoader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class PostgreSQLManager implements DatabaseManager {

    Properties props = DBConfigLoader.chargeDBConfig(configPath, "postgresql");
    Connection connection;
    Statement stm;
    String url = props.getProperty("url");
    String username = props.getProperty("user");
    String password = props.getProperty("password");

    public PostgreSQLManager() throws Exception {
    }

    @Override
    public Statement connect() throws ConnectException {
        try {
            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection(url, username, password);
            stm = connection.createStatement();
            return stm;
        } catch (SQLException | ClassNotFoundException e) {
            throw new ConnectException("Erreur de connexion");
        }
    }

    @Override
    public void disconnect() throws ConnectException {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new ConnectException("Erreur de connexion");
        }
    }

    @Override
    public List<Map<String, Object>> executeQuery(String sql) throws DQLException {
        return List.of();
    }

    @Override
    public int executeUpdate(String sql) throws DMLException {
        return 0;
    }

    @Override
    public int executeInsert(String sql) throws DMLException {
        return 0;
    }

    @Override
    public int executeDelete(String sql) throws DMLException {
        return 0;
    }
}
