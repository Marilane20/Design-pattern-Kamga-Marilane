package com.marilane.patrons.patronsDeConstruction.factoryCours.factoryMethod;

public class Client {

    public static void main(String[] args){
        System.out.println("bonjour et bienvenu dans le porgramme de la methode factory du pattern factory");

        FabriqueProduit fabriqueProduit=new FabriqueProduit();
        Produit produit= null;

        //Affiche un produit de type A
        produit=fabriqueProduit.createProduit(fabriqueProduit.typeA);
        produit.methodeproduit();

        //Affiche un produit de type B

        produit=fabriqueProduit.createProduit(fabriqueProduit.typeB);
        produit.methodeproduit();

        produit=fabriqueProduit.createProduit(fabriqueProduit.typeB);
        produit.methodeproduit();

        //produit inexistant
        String d= "D";
        produit = fabriqueProduit.createProduit(d);
        produit.methodeproduit();

    }
}
