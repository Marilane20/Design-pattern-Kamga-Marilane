package com.marilane.patrons.patronsDeStructuration.composite.elementSysteme;

import java.util.ArrayList;
import java.util.List;

public class Dossier extends ElementSystem{

    private List<ElementSystem>elements = new ArrayList<>();
    private String nom;

    public Dossier ( String nom) {
        this.nom = nom;
    }


    @Override
    public void decrire() {

        for(ElementSystem element : elements) {
            element.decrire();
        }
    }

    public void ajouterElement (ElementSystem newElement) {
        elements.add(newElement);
    }

    public void supprimerElement( ElementSystem elementDelete) {
        elements.remove(elementDelete);
    }

    public ElementSystem getEnfant ( int i) {

        return elements.get(i);
    }


}
