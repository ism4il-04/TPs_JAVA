package TP9.database;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import TP9.util.DBConfigLoader;

public class MySQLManager implements DatabaseManager{

    Properties props = DBConfigLoader.chargeDBConfig(configPath, "mysql");
    String url = props.getProperty("url");
    String username = props.getProperty("user");
    String password = props.getProperty("password");

    public MySQLManager() throws Exception {
    }

    @Override
    public void connect() throws ConnectException {

    }

    @Override
    public void disconnect() throws ConnectException {

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
