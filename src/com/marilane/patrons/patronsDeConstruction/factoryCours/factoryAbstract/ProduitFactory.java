package com.marilane.patrons.patronsDeConstruction.factoryCours.factoryAbstract;

public  abstract class ProduitFactory {

    public Produit getProduit(){
        return createProduit();
    }
    protected abstract Produit createProduit();
}
