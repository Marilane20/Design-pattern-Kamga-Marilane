package com.marilane.patrons.patronsDeStructuration.brigde.bridgeCours;

public  abstract class Forme {

    protected Couleur couleur;

    protected  Forme( Couleur couleur) {
        this.couleur = couleur;
    }

    public abstract void dessiner();
}
