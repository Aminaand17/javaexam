package com.exam.view;

import java.util.Scanner;

import com.exam.services.CoursService;

public class AdminView {
    private final CoursService coursService;
    private final Scanner scanner;
    private final GestionCoursView gestionCoursView;

    public AdminView(CoursService coursService) {
        this.coursService = coursService;
        this.scanner = new Scanner(System.in);
        this.gestionCoursView = new GestionCoursView(coursService); 
    }

    public void afficherMenu() {
        while (true) {
            System.out.println("\n===== Menu Admin =====");
            System.out.println("1. Ajouter un cours");
            System.out.println("2. Ajouter un niveau");
            System.out.println("3. Afficher tous les cours");
            System.out.println("4. Afficher les cours par niveau");
            System.out.println("5. Afficher les cours par classe");
            System.out.println("6. Afficher les cours par professeur");
            System.out.println("0. Quitter");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); 

            switch (choix) {
                case 1:
                    gestionCoursView.ajouterCours();
                    break;
                case 2:
                    gestionCoursView.ajouterNiveau();
                    break;
                case 3:
                    gestionCoursView.afficherTousLesCours();
                    break;
                case 4:
                    gestionCoursView.afficherCoursParNiveau();
                    break;
                case 5:
                    gestionCoursView.afficherCoursParClasse();
                    break;
                case 6:
                    gestionCoursView.afficherCoursParProfesseur();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    return;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }
}
