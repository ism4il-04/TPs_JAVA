import TP9.database.DatabaseManager;
import TP9.database.SQLServerManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class SQLServerTest {

    private static DatabaseManager db;

    @BeforeAll
    public static void setup() throws Exception {
        db = new SQLServerManager();
        db.connect();
    }
    @AfterAll
    public static void teardown() throws Exception {
        db.disconnect();
    }

    @Test
    public void testSelectUserByNom() {
        List<Map<String, Object>> results = db.executeQuery("SELECT nom FROM utilisateurs");
        for (Map<String, Object> row : results) {
            System.out.println(row.get("nom"));
        }
    }

    @Test
    public void testInsertUser() throws Exception {
        String insertSQL = "INSERT INTO utilisateurs (id, nom, age) VALUES (88, 'Ismail', 20)";
        db.executeDML(insertSQL);
    }

    @Test
    public void testUpdateUser() throws Exception {
        String updateSQL = "UPDATE utilisateurs SET nom = 'Ismail2' WHERE id = 88";
        db.executeDML(updateSQL);
    }

    @Test
    public void testDeleteUser() throws Exception {
        String deleteSQL = "DELETE FROM utilisateurs WHERE id = 88";
        db.executeDML(deleteSQL);
    }
}
