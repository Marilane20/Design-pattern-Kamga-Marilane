package com.marilane.patrons.patronsDeConstruction.factoryModifie.factoryMethode;

public class Client {

    public static void main(String[] args){
        System.out.println("bonjour et bienvenu dans le porgramme de la factoryMethode modifiee du pattern factory");

        FabriqueProduit fabriqueProduit=new FabriqueProduit();
        Produit produit= null;

        //Affiche un produit de type A
        produit=fabriqueProduit.createProduit(fabriqueProduit.typeA);
        produit.methodeproduit();

        //Affiche un produit de type B

        produit=fabriqueProduit.createProduit(fabriqueProduit.typeB);
        produit.methodeproduit();

        produit=fabriqueProduit.createProduit(fabriqueProduit.typeC);
        produit.methodeproduit();


        produit=fabriqueProduit.createProduit(fabriqueProduit.typeD);
        produit.methodeproduit();

        //produit inexistant
        String e= "E";
        produit = fabriqueProduit.createProduit(e);
        produit.methodeproduit();

    }



}
