package com.marilane.patrons.patronsDeConstruction.abstractFactoryModifie;

public class SofaModerne implements Sofa {

    @Override
    public void afficherStyle() {
        System.out.println("je suis un sofa moderne");
        System.out.println("je suis construis a partir des materiaux modernes \n");
    }

}
