package com.marilane.patrons.patronsDeStructuration.composite.arbreGenealogique;

public class Personne implements MembreFamille {

    private String nom;

    public Personne(String nom) {
        this.nom = nom;
    }

    @Override
    public void afficher(String indentation) {
        System.out.println(indentation + "- " + nom);
    }

    @Override
    public MembreFamille rechercher(String nom) {
        return this.nom.equalsIgnoreCase(nom) ? this : null;
    }

    @Override
    public String getNom() {
        return nom;
    }

}
