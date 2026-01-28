package com.marilane.patrons.patronsDeStructuration.composite.TPArbreGenealogique;

public class Client {

    public static void main( String[] args){
        System.out.println("MON ARBRE GENEALOGIQUE");

        //creation des parents de la premiere famille

        Famille pere = new Personne("Kekeu severin");
        Famille mere = new Personne("Medjom martine");

        //creation des parents de la deuxieme famille

        Famille pere2 = new Personne("Tagne bernard");
        Famille mere2 = new Personne("metalom francoise");



        // creation des enfants de la premiere famille
        Famille enfant1  = new Personne("andre");
        Famille enfant2  = new Personne("achille");
        Famille enfant3  = new Personne("amanda");
        Famille enfant4  = new Personne("emeline");
        Famille enfant5  = new Personne("armel");
        Famille enfant6  = new Personne("marilane");

        //creation des enfant de la deuxieme famille

        Famille enfant2_1  = new Personne("herman");
        Famille enfant2_2  = new Personne("emmanuel");
        Famille enfant2_3  = new Personne("audrey");
        Famille enfant2_4  = new Personne("maguy");
        Famille enfant2_5  = new Personne("thomas");
        Famille enfant2_6  = new Personne("ange");





        //creation de la famille 1
        GroupeFamille famille1 = new GroupeFamille(pere.getNom() , mere.getNom());

        //creation de la famille 2
        GroupeFamille famille2 = new GroupeFamille(pere2.getNom() , mere2.getNom());

        //afficher le nom de la premiere famille
        System.out.println(famille1.getNom());

        //afficher le nom de la deuxieme famille
        System.out.println(famille2.getNom());

        //ajout des enfants de la premiere famille

        famille1.ajouterMembre(enfant1);
        famille1.ajouterMembre(enfant2);
        famille1.ajouterMembre(enfant3);
        famille1.ajouterMembre(enfant4);
        famille1.ajouterMembre(enfant5);
        famille1.ajouterMembre(enfant6);
        famille1.afficher();

        //ajout des enfants de la deuxieme famille

        famille2.ajouterMembre(enfant2_1);
        famille2.ajouterMembre(enfant2_2);
        famille2.ajouterMembre(enfant2_3);
        famille2.ajouterMembre(enfant2_4);
        famille2.ajouterMembre(enfant2_5);
        famille2.ajouterMembre(enfant2_6);
        famille2.afficher();

        //creation de la famille du grandpere

         Famille grandpere = new Personne("guiffo");
         Famille grandmere = new Personne("mondjo");

        GroupeFamille familleGuifo = new GroupeFamille(grandpere.getNom(), grandmere.getNom());
        familleGuifo.ajouterMembre(famille1);
        familleGuifo.ajouterMembre(famille2);

        //affichage

        System.out.println("===========Affichage de la grande famille=========");
        familleGuifo.afficher();

        //Descendants de la famille
        System.out.println("===========Descendants de la grande  famille=========");
        familleGuifo.afficherDescendants();


        //AScendant d'un enfants.

        System.out.println("\n== Ascendants de Andre ==");
        enfant1.afficherAscendant();

        // --- Supprimer un membre ---
        System.out.println("\n== Suppression de Achille ==");
        famille1.supprimer(enfant2);
        familleGuifo.afficher();










    }
}
