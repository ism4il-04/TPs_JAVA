package TP7.EX2;

public class EntrepriseSecrete extends Entreprise {
    public EntrepriseSecrete(int nombreEmployes, int capital, String nom, String mission) {
        super(nombreEmployes, capital, nom, mission);
    }

    public String mission() throws SecretMissionException {
        if (mission.equals("Entreprise Secrete")) {
            throw new SecretMissionException("cette entreprise est secrete.");
        }
        return mission;
    }
}
