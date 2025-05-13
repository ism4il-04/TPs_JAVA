import TP9.database.*;
import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class MySQLTest {

    private static DatabaseManager db;

    @BeforeAll
    public static void setup() throws Exception {
        db = new MySQLManager();
        db.connect();
    }

    @AfterAll
    public static void teardown() throws Exception {
        db.disconnect();
    }

    @Test
    public void testSelectAllUsers() throws Exception {
        List<Map<String, Object>> results = db.executeQuery("SELECT * FROM utilisateurs");
        assertFalse(results.isEmpty(), "La table utilisateurs devrait contenir des données");
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
        String insertSQL = "INSERT INTO utilisateurs (id, nom, age) VALUES (20, 'Yassir', 28)";
        db.executeDML(insertSQL);

        List<Map<String, Object>> results = db.executeQuery("SELECT * FROM utilisateurs WHERE id = 20");
        assertEquals(1, results.size());
        assertEquals("Yassir", results.get(0).get("nom"));
        assertEquals(28, ((Number) results.get(0).get("age")).intValue());
    }


}
