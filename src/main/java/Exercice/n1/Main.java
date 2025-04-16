package Exercice.n1;
public class Main {
    public static void main(String[] args) {
        Adresse adresse1 = new Adresse("93000", "Tetouan", "Mhannech");
        Adresse adresse2 = new Adresse("14020", "Kenitra", "Zemzem");
        Adresse adresse3 = new Adresse("20000", "Casablanca", "Maarif");
        Adresse adresse4 = new Adresse("10000", "Rabat", "Agdal");
        Adresse adresse5 = new Adresse("80000", "Rabat", "California");
        Adresse[] adresses1 = {adresse1, adresse2};
        Adresse[] adresses2 = {adresse3, adresse4};
        Adresse[] adresses3 = {adresse5, adresse4};
        Adresse[] adresses4 = {adresse2};
        Personne personne1 = new Personne("ismail", adresses4, 'M');
        Personne personne2 = new Personne("Raihana", adresses1, 'F');
        Personne personne3 = new Personne("Karim", adresses2, 'M');
        Personne personne4 = new Personne("Imane", adresses3, 'F');
        Personne[] personnes = {personne1, personne2, personne3,personne4};
        ListePersonnes E = new ListePersonnes(personnes);
        Personne F=E.findByNom("Karim");
        if(F==null) {
            System.out.println("La personne n'existe pas");
        } else {
            System.out.println("La personne Karim trouvé:");
            System.out.println("Nom: " + F.getNom() + " Sexe: "+F.getSexe());
            System.out.println("Ses adresses:");
            for(int i=0;i<F.getAdresses().length;i++) {
                System.out.println("Adresse n°"+(i+1)+": "+ F.getAdresses()[i].getVille()+","+F.getAdresses()[i].getRue()+","+F.getAdresses()[i].getCodePostal());
            }
        }
        String cp = "93000";
        if(E.findByCodePostal(cp)){
            System.out.println("Le code postal "+cp+" est existant dans la liste des personnes");
        }else {
            System.out.println("Le code postal " +cp+" n'existe pas");
        }
        String nomVille="Rabat";
        System.out.println("Le nombre des personnes qui habitent dans "+nomVille+" est: "+E.countPersonneVille(nomVille));
        String oldNom = "Karim";
        String newNom = "Ahmed";
        System.out.println("Avant changer nom de personnes "+oldNom+" : "+newNom);
        E.afficherListePersonnes();
        E.editPersonneNom(oldNom, newNom);
        System.out.println("Après changer nom de personnes "+oldNom+" : "+newNom);
        E.afficherListePersonnes();
        String oldVille = "Rabat";
        String newVille = "Salé";
        E.editPersonneVille(oldVille, newVille);
        System.out.println("Après changer nom de ville");
        E.afficherListePersonnes();
    }
}