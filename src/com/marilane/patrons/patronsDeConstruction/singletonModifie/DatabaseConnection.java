package com.marilane.patrons.patronsDeConstruction.singletonModifie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {


    private static DatabaseConnection instance = null;

    // L'objet Connection de JDBC
    private Connection connection;

    // Informations de connexion à la base de données
    private static final String URL = "jdbc:mysql://localhost:3306/test_singleton";
    private static final String USER = "root";
    private static final String PASSWORD = "";


    private DatabaseConnection() {
        try {
            // Chargement du driver MySQL (optionnel depuis JDBC 4.0, mais bonne pratique)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Création de la connexion
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println(" Connexion à la base de données établie avec succès !");
            System.out.println(" Instance créée : " + this.hashCode());

        } catch (ClassNotFoundException e) {
            System.err.println(" Driver MySQL non trouvé !");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println(" Erreur de connexion à la base de données !");
            e.printStackTrace();
        }
    }

    //  Méthode statique publique pour obtenir l'instance unique

    public static DatabaseConnection getInstance() {
        // Si l'instance n'existe pas encore, on la crée
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Méthode pour obtenir l'objet Connection JDBC
    public Connection getConnection() {
        return this.connection;
    }

    // Méthode pour fermer proprement la connexion
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("🔒 Connexion fermée.");
            } catch (SQLException e) {
                System.err.println("Erreur lors de la fermeture de la connexion !");
                e.printStackTrace();
            }
        }
    }
}