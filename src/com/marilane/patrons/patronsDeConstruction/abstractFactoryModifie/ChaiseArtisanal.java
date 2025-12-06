package com.marilane.patrons.patronsDeConstruction.abstractFactoryModifie;

public class ChaiseArtisanal implements Chaise{

    @Override
    public void afficherStyle() {
        System.out.println("je suis une chaise artisanale");
        System.out.println("je suis construit a partir des materiaux naturels \n");

    }
}
