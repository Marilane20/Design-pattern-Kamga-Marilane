package com.marilane.patrons.patronsDeStructuration.composite.elementSysteme;

public class FichierTxt extends ElementSystem {

    private String nom;
    private String type;

    public FichierTxt( String nom , String type) {
        this.nom = nom ;
        this.type = type;
    }

    @Override
    public void decrire() {

        System.out.println(" je suis un fichier de type" + type + " et je m'appele " + nom);

    }
}
