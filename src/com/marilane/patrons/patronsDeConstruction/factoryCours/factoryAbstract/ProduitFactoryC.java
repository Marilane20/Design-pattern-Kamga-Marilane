package com.marilane.patrons.patronsDeConstruction.factoryCours.factoryAbstract;

public class ProduitFactoryC extends ProduitFactory{

    protected Produit createProduit(){
        Produit produit = null;
        produit = new ProduitC();
        return produit;
    }
}
