package com.marilane.patrons.patronsDeStructuration.composite.TPArbreGenealogique;

public class Personne extends Famille {

    private String nom;

    public Personne( String nom){
        this. nom = nom;
    }


    @Override
    public void afficher() {
        System.out.println( "Personne :" + getNom());

    }

    @Override
    public String getNom() {
        return this.nom;
    }
}
