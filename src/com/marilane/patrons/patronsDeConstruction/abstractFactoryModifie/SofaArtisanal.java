package com.marilane.patrons.patronsDeConstruction.abstractFactoryModifie;

public class SofaArtisanal implements Sofa{
    @Override
    public void afficherStyle() {
        System.out.println("je suis un sofa artisanal ");
        System.out.println("je suis construit a partir des materieux naturels \n");
    }
}
