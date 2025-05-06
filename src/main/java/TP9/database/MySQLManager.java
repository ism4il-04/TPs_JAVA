package TP9.database;

import java.util.List;
import java.util.Map;

public class MySQLManager implements DatabaseManager{

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
