package TP6t;

public class Main {
    public static void main(String[] args) {

        try {
            //1 charger le driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //etablir la connection avec la BDD

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
