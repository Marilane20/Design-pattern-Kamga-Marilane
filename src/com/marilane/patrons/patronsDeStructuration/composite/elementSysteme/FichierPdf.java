package com.marilane.patrons.patronsDeStructuration.composite.elementSysteme;

public class FichierPdf extends ElementSystem {

    private String nom;
    private String type;

    public FichierPdf( String nom , String type) {
        this.nom = nom ;
        this.type = type;
    }

    @Override
    public void decrire() {

        System.out.println(" je suis un fichier de type" + type + " et je m'appele " + nom);

    }


}
