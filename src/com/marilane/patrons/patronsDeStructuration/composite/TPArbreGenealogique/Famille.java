package com.marilane.patrons.patronsDeStructuration.composite.TPArbreGenealogique;

public  abstract class Famille {
    //variables qui va representer le parent de chaque composant

    protected Famille parent;


    public abstract void afficher();
    public abstract String getNom();

    public void setParent( Famille parent){
        this.parent = parent;
    }

    public Famille getParent(){
        return this.parent;
    }

    public void afficherAscendant(){
        if (parent != null){
            System.out.println(parent.getNom());
            parent.afficherAscendant();

        }
    }

    public void afficherDescendants(){
        // vide pour une Personne
    }


}
