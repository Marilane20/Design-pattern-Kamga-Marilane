package com.marilane.patrons.patronsDeConstruction.singletonModifie;

import java.sql.*;
import java.util.Scanner;

public class MainSingleton {

    public static void main(String[] args) {

        System.out.println("=== TEST DU PATTERN SINGLETON ===\n");

        // Test 1 : Obtenir la première instance
        System.out.println("--- Test 1 : Création de la première instance ---");
        DatabaseConnection db1 = DatabaseConnection.getInstance();

        // Test 2 : Obtenir une "deuxième" instance
        System.out.println("\n--- Test 2 : Tentative de création d'une deuxième instance ---");
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        // Test 3 : Vérifier que c'est la même instance
        System.out.println("\n--- Test 3 : Vérification que c'est la même instance ---");
        System.out.println("db1 et db2 sont-ils identiques ? " + (db1 == db2));
        System.out.println("HashCode de db1 : " + db1.hashCode());
        System.out.println("HashCode de db2 : " + db2.hashCode());

        System.out.println("\n=== FIN DES TESTS DU SINGLETON ===\n");

        // On récupère la connexion (unique, grâce au Singleton)
        Connection conn = db1.getConnection();


        lancerMenu(conn);


        db1.closeConnection();
        System.out.println("\n=== Programme terminé. Connexion fermée. ===");
    }


    private static void lancerMenu(Connection conn) {

        Scanner sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n============================ PROGRAMME DE GESTION DES ETUDIANTS ==========================");
            System.out.println("1. Lister les étudiants");
            System.out.println("2. Ajouter un étudiant");
            System.out.println("3. Supprimer un étudiant");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine(); // éviter les bugs du Scanner

            switch (choix) {
                case 1:
                    listerEtudiants(conn);
                    break;
                case 2:
                    ajouterEtudiant(conn, sc);
                    break;
                case 3:
                    supprimerEtudiant(conn, sc);
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 0);

        sc.close();
    }

    /**
     * Lister les étudiants
     */
    private static void listerEtudiants(Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM etudiants");

            System.out.println("\n--- Liste des étudiants ---");

            while (rs.next()) {
                System.out.println(
                        rs.getString("matricule") + " - " +
                                rs.getString("nom") + " " +
                                rs.getString("prenom") + " - " +
                                rs.getString("email")
                );
            }

            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Erreur lors de la lecture !");
        }
    }

    //ajouter un etudiant
    private static void ajouterEtudiant(Connection conn, Scanner sc) {
        try {

            System.out.print("Maticule : ");
            String matricule = sc.nextLine();
            System.out.print("Nom : ");
            String nom = sc.nextLine();
            System.out.print("Prénom : ");
            String prenom = sc.nextLine();
            System.out.print("Email : ");
            String email = sc.nextLine();

            String sql = "INSERT INTO etudiants (matricule, nom, prenom, email) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, matricule);
            stmt.setString(2, nom);
            stmt.setString(3, prenom);
            stmt.setString(4, email);
            stmt.executeUpdate();
            stmt.close();
            System.out.println("Étudiant ajouté avec succès !");


        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout !");
        }
    }


     // Supprimer un étudiant

    private static void supprimerEtudiant(Connection conn, Scanner sc) {
        try {
            System.out.print("entrez le matricule de l'étudiant à supprimer : ");
            String matricule = sc.nextLine();

            String sql = "DELETE FROM etudiants WHERE matricule=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, matricule);
            int rows = stmt.executeUpdate();
            stmt.close();

            if (rows > 0)
                System.out.println("Étudiant supprimé !");
            else
                System.out.println("Aucun étudiant trouvé avec ce matricule.");


        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression !");
        }
    }
}
