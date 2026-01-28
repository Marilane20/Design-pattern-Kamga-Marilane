package com.marilane.patrons.patronsDeStructuration.adapterCours;

public class Rectangle {

    public float longueur;
    public float largeur;

    public Rectangle( float largeur , float longueur){

        this.largeur = largeur;
        this.longueur = longueur;
    }

    public float Aire(){
        return longueur * largeur;
    }

    public float perimetre () {
        return (longueur + largeur) * 2;
    }

}
