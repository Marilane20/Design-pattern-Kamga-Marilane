package com.marilane.patrons.patronsDeStructuration.brigde.bridgeCours;

public class Cercle extends Forme {


    public Cercle (Couleur color){
        super(color);
    }

    @Override
    public void dessiner() {
        couleur.colorier();

    }
}
