package com.marilane.patrons.abstractFactoryModifie;

public class FabriqueModerne implements FabriquerMeuble{

    @Override
    public Chaise creerChaise() { return new ChaiseModerne(); }
    public Table creerTable() { return new TableModerne(); }
}

