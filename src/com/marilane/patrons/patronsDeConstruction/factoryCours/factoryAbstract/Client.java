package com.marilane.patrons.patronsDeConstruction.factoryCours.factoryAbstract;

public class Client {

    public static void main (String[] args){

        System.out.println("==============Methode 2: Abstract Factory ===============");
        ProduitFactory produitFactoryA=new ProduitFactoryA();
        ProduitFactory produitFactoryB=new ProduitFactoryB();
        ProduitFactory produitFactoryC=new ProduitFactoryC();

        Produit produit= null;

        //affiche un produit de type A
        produit = produitFactoryA.getProduit();
        produit.methodeproduit();

        //affiche un produit de type B
        produit = produitFactoryB.getProduit();
        produit.methodeproduit();

        //affiche un produit de type C

        produit = produitFactoryC.getProduit();
        produit.methodeproduit();

    }
}
