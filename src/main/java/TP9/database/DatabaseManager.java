package TP9.database;

import java.util.List;
import java.util.Map;

public interface DatabaseManager {
    String configPath = "src/main/resources/dbconfig.properties";
    void connect() throws ConnectException;
    void disconnect() throws ConnectException;
    List<Map<String, Object>> executeQuery(String sql) throws DQLException;
    int executeUpdate(String sql) throws DMLException;
    int executeInsert(String sql) throws DMLException;
    int executeDelete(String sql) throws DMLException;
}