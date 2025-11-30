package com.marilane.patrons.factoryCours.factoryAbstract;

public class ProduitFactoryB extends ProduitFactory{

    protected Produit createProduit(){
        Produit produit = null;
        produit = new ProduitB();
        return produit;
    }
}
