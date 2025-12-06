package com.marilane.patrons.patronsDeConstruction.abstractFactoryModifie;

public class FabriqueModerne implements FabriquerMeuble{

    @Override
    public Chaise creerChaise() { return new ChaiseModerne(); }
    public Table creerTable() { return new TableModerne(); }
    public Sofa creerSofa() { return new SofaModerne(); }
    public Lit creerLit() { return new LitModerne(); }

}

