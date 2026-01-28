package com.marilane.patrons.patronsDeStructuration.composite.TPArbreGenealogique;

public class Client {

    public static void main( String[] args){
        System.out.println("MON ARBRE GENEALOGIQUE");

        //creation des parents

        Famille pere = new Personne("Kekeu severin");
        Famille mere = new Personne("Medjom martine");

        // creation des enfants
        Famille enfant1  = new Personne("andre");
        Famille enfant2  = new Personne("achille");
        Famille enfant3  = new Personne("amanda");
        Famille enfant4  = new Personne("emeline");
        Famille enfant5  = new Personne("armel");
        Famille enfant6  = new Personne("marilane");

        //creation de la famille
        GroupeFamille famille = new GroupeFamille(pere.getNom() , mere.getNom());

        //afficher les membre de la famille pour la premiere fois

        ((famille)).afficher();

        //test affichage d'un enfant

        enfant1.afficher();

        //afficher le nom de la famille
        System.out.println(famille.getNom());

        //ajoute du premier enfant dans la famille

        famille.ajouterMembre(enfant1);
        famille.afficher();


    }
}
