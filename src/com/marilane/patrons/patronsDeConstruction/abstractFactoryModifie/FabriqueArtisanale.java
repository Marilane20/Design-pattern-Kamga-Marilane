package com.marilane.patrons.patronsDeConstruction.abstractFactoryModifie;

public class FabriqueArtisanale implements FabriquerMeuble {

 @Override
    public Chaise creerChaise() { return new ChaiseArtisanal(); }
    public Table creerTable() { return new TableArtisanale(); }
    public Sofa creerSofa() { return new SofaArtisanal(); }
    public Lit creerLit() { return new LitArtisanal(); }


}
