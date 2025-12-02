
package com.marilane.patrons.abstractFactoryModifie;

public class Main {
    public static void main(String[] args) {


        FabriqueArtisanale fabriqueChaiseArtisanal  = new FabriqueArtisanale();
        FabriqueModerne fabriqueChaisesModernes = new FabriqueModerne();

        Chaise chaiseModerne = fabriqueChaisesModernes.creerChaise();
        Chaise chaiseArtisanle = fabriqueChaiseArtisanal.creerChaise();

        chaiseModerne.afficherStyle();
        chaiseArtisanle.afficherStyle();



    }
}