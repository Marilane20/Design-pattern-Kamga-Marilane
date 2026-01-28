package com.marilane.patrons.patronsDeStructuration.composite.TPArbreGenealogique;

import com.marilane.patrons.patronsDeStructuration.composite.arbreGenealogique.MembreFamille;

import java.util.ArrayList;
import java.util.List;

public class GroupeFamille extends Famille{


    private String nomPere;
    private String nomMere;
    private List<Famille> membres = new ArrayList<>();

    //constructeur de la sale
    public GroupeFamille(String nomPere, String nomMere){
        this.nomPere = nomPere;
        this.nomMere = nomMere;

    }

    @Override
    public void afficher() {
        //affiche les information d'un famille et des membres
        System.out.println("Famille :" +nomPere+ " &  " +nomMere);
        for( Famille membre : membres){
            membre.afficher();
        }


    }
    @Override
    public String getNom() {
        return "Famille:"+nomPere;
    }

    public void ajouterMembre (Famille membre){
        membres.add(membre);

    }

    //recherche ascendante, recherche descendante//

    public void supprimer( ){

    }
}
