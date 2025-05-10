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
            System.out.println(row.get("name"));
        }
    }

    @Test
    public void testDataFromCSVMatchesDatabase() throws Exception {
        List<Map<String, String>> csvRows = CSVUtils.loadCSV("src/test/resources/test_data.csv");
        List<Map<String, Object>> dbRows = db.executeQuery("SELECT * FROM utilisateurs");

        for (int i = 0; i < csvRows.size(); i++) {
            Map<String, String> csv = csvRows.get(i);
            Map<String, Object> db = dbRows.get(i);

            assertEquals(csv.get("id"), db.get("id").toString());
            assertEquals(csv.get("nom"), db.get("nom"));
            assertEquals(csv.get("age"), db.get("age").toString());
        }
    }


}
