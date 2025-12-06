package com.marilane.patrons.patronsDeConstruction.abstractFactoryModifie;

public class LitModerne implements Lit {

    @Override
    public void afficherStyle() {
        System.out.println("je suis un Lit moderne");
        System.out.println("je suis construis a partir des materiaux modernes \n");
    }
}
