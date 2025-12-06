package com.marilane.patrons.patronsDeConstruction.singletonCours;

public class TestSingleton {

    public static void main(String[] args){

        int som= Singleton.getInstance().Somme(2,  5);
        System.out.println("la somme est:"+som);

        Singleton s1 = Singleton.getInstance(8,3);
        s1.affiche();

        Singleton s2 = Singleton.getInstance( 8,3);
        s1.affiche();

    }
}






























