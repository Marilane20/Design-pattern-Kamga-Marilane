package com.marilane.patrons.patronsDeConstruction.abstractFactoryModifie;

public class ChaiseModerne implements Chaise{

    @Override
    public void afficherStyle() {
        System.out.println("je suis une chaise moderne");
        System.out.println("je suis construit a partir des materiaux modernes \n");
    }
}
