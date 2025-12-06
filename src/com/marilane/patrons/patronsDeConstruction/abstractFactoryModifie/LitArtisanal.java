package com.marilane.patrons.patronsDeConstruction.abstractFactoryModifie;

public class LitArtisanal implements Lit{

    @Override
    public void afficherStyle() {
        System.out.println("je suis un lit artisanal ");
        System.out.println("je suis construit a partir des materieux naturels \n");
    }
}
