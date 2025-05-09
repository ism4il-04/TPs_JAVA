package TP9.database;

import java.sql.*;
import java.util.*;
import TP9.util.DBConfigLoader;

public class MySQLManager implements DatabaseManager{

    Properties props = DBConfigLoader.chargeDBConfig(configPath, "mysql");
    Connection connection;
    Statement stm;
    String url = props.getProperty("url");
    String username = props.getProperty("user");
    String password = props.getProperty("password");

    public MySQLManager() throws Exception {
    }

    @Override
    public Statement connect() throws ConnectException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(url, username, password);
            stm = connection.createStatement();
        } catch (SQLException | ClassNotFoundException e) {
            throw new ConnectException("Erreur de connexion");
        }
        return null;
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
        List<Map<String, Object>> results = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData md = rs.getMetaData();
            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                for (int i = 1; i <= md.getColumnCount(); i++) {
                    row.put(md.getColumnName(i), rs.getObject(i));
                }
                results.add(row);
            }
        } catch (SQLException e){
            throw new DQLException("Erreur de selection");
        }
        return results;
    }

    @Override
    public int executeDML(String sql) throws DMLException {
        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement()) {
            return stmt.executeUpdate(sql);

        } catch (SQLException e) {
            throw new DMLException("Erreur DML");
        }
    }
}
