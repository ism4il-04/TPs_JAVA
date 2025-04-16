package TP4.EX3;

public class Test1 {
    public static void main(String[] args) {
        Employe Com = new Commercial("Lyamani" ,"Ismail" , 35 , 6 , 30000,12,4);
        Employe Tech = new Technicien("Kamali " , "stan" , 28 , 2 , 700 ,5,10,5);
        Employe Manu = new Manutentionnaire("Chakir" , "Elias" , 36 , 3, 160,5);
        Com.afficher();
        System.out.println("Salaire total :" +Com.calculerSalaire() + "DH\n");
        Tech.afficher();
        System.out.println("Salaire total :" +Tech.calculerSalaire() + "DH\n");
        Manu.afficher();
        System.out.println("Salaire total :" +Manu.calculerSalaire() + "DH\n");
    }
}
