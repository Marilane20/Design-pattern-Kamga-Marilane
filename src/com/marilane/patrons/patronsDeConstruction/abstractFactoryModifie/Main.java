
package com.marilane.patrons.patronsDeConstruction.abstractFactoryModifie;

public class Main {
    public static void main(String[] args) {


        FabriquerMeuble fabriqueMeublesArtisanal  = new FabriqueArtisanale();
        FabriquerMeuble fabriqueMeublesModernes = new FabriqueModerne();

        Chaise chaiseModerne = fabriqueMeublesModernes.creerChaise();
        Chaise chaiseArtisanle = fabriqueMeublesArtisanal.creerChaise();

        chaiseModerne.afficherStyle();
        chaiseArtisanle.afficherStyle();


        Sofa sofaModerne = fabriqueMeublesModernes.creerSofa();
        Sofa sofaArtisanle = fabriqueMeublesArtisanal.creerSofa();

        sofaModerne.afficherStyle();
        sofaArtisanle.afficherStyle();


        Table tableModerne = fabriqueMeublesModernes.creerTable();
        Table tableArtisanle = fabriqueMeublesArtisanal.creerTable();

        tableModerne.afficherStyle();
        tableArtisanle.afficherStyle();

        Lit litModerne = fabriqueMeublesModernes.creerLit();
        Lit litArtisanl = fabriqueMeublesArtisanal.creerLit();

        litModerne.afficherStyle();
        litArtisanl.afficherStyle();







    }
}