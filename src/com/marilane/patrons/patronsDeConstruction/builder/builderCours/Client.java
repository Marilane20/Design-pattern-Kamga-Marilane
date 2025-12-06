package com.marilane.patrons.patronsDeConstruction.builder.builderCours;

public class Client {

    public static void main(String[] args){

        Directeur directeur = new Directeur();

        //CONSTRUIRE PIZZA REINE
        System.out.println("\n");
        System.out.println("**************************pizza Reine Fabriquee*****************************************\n");
        directeur.construirepizzaReine().print();
        System.out.println("\n");


        //CONSTRUIRE PIZZA PIQUANTE
        System.out.println("***************************pizza Piquante Fabriquee************************************\n");
        directeur.construirePizzaPiquante().print();
        System.out.println("\n");
    }
}
