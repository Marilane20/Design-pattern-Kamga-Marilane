package com.marilane.patrons.abstractFactoryModifie;

public class FabriqueArtisanale implements FabriquerMeuble {

 @Override
    public Chaise creerChaise() { return new ChaiseArtisanal(); }
    public Table creerTable() { return new TableArtisanale(); }
}
