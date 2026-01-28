package com.marilane.patrons.patronsDeStructuration.composite.arbreGenealogique;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Famille racine = new Famille("Famille Racine");

        while (true) {
            System.out.println("\n=== MENU ARBRE GENEALOGIQUE ===");
            System.out.println("1. Ajouter une personne");
            System.out.println("2. Ajouter une famille");
            System.out.println("3. Supprimer un membre");
            System.out.println("4. Rechercher un membre");
            System.out.println("5. Afficher l'arbre");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // nettoyage buffer

            switch (choix) {

                case 1 -> {
                    System.out.print("Nom de la personne : ");
                    String nom = scanner.nextLine();

                    System.out.print("Ajouter à quelle famille ? ");
                    String parentNom = scanner.nextLine();

                    MembreFamille parent = racine.rechercher(parentNom);
                    if (parent instanceof Famille famille) {
                        famille.ajouter(new Personne(nom));
                        System.out.println("Personne ajoutée.");
                    } else {
                        System.out.println("Famille introuvable.");
                    }
                }

                case 2 -> {
                    System.out.print("Nom de la famille : ");
                    String nomFamille = scanner.nextLine();

                    System.out.print("Ajouter à quelle famille parente ? ");
                    String parentNom = scanner.nextLine();

                    MembreFamille parent = racine.rechercher(parentNom);
                    if (parent instanceof Famille famille) {
                        famille.ajouter(new Famille(nomFamille));
                        System.out.println("Famille ajoutée.");
                    } else {
                        System.out.println("Famille introuvable.");
                    }
                }

                case 3 -> {
                    System.out.print("Nom du membre à supprimer : ");
                    String nom = scanner.nextLine();

                    racine.supprimerParNom(nom);
                    System.out.println("Suppression effectuée (si existant).");
                }

                case 4 -> {
                    System.out.print("Nom à rechercher : ");
                    String nom = scanner.nextLine();

                    MembreFamille res = racine.rechercher(nom);
                    if (res != null) {
                        System.out.println("Membre trouvé :");
                        res.afficher("");
                    } else {
                        System.out.println("Membre non trouvé.");
                    }
                }

                case 5 -> {
                    System.out.println("\n=== ARBRE COMPLET ===");
                    racine.afficher("");
                }

                case 0 -> {
                    System.out.println("Fin du programme.");
                    return;
                }

                default -> System.out.println("Choix invalide.");
            }
        }
    }
}
