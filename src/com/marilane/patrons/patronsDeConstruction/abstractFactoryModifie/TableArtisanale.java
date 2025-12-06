package com.marilane.patrons.patronsDeConstruction.abstractFactoryModifie;

public class TableArtisanale implements Table{

    @Override
    public void afficherStyle() {
        System.out.println("je suis une table artisanale");
        System.out.println("je suis fait des materiaux naturels \n");
    }
}
