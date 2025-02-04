package agence;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	Gestionnaire gest = new Gestionnaire();
        Scanner in = new Scanner(System.in);
        String id="12";
        System.out.println("1- Créer voyage");
        System.out.println("2- Créer client");
        System.out.println("3- Créer réservation");
        System.out.println("4- Afficher client");
        System.out.println("5- Afficher réservation");
        System.out.println("6- Afficher voyage");
        System.out.println("7- Modifier un client");
        System.out.println("8- Exit");
        int choix = 0;
        do {
            System.out.println("Tapez le numero de l'operation à effectuer:");
            choix = in.nextInt();
        
        
        switch (choix) {
            case 1:
                gest.CreerVoyage();
                break;
            case 2:
                gest.AjoutClt();
                break;
            case 3:
                gest.CreerReservation();
                break;
            case 4:
                gest.AffichageClt();
                break;
            case 5:
                gest.AffichageRes();
                break;
            case 6:
                gest.AffichageVoyage();
                break;
            case 7:
                gest.modifier();
                break;
            case 8: gest.Rech_Client(id).toString();
        }
        } while (choix!=9);
    
}}
