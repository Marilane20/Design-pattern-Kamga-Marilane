package com.marilane.patrons.patronsDeStructuration.composite.arbreGenealogique;


import java.util.ArrayList;
import java.util.List;

public class Famille implements MembreFamille {

    private String nom;
    private List<MembreFamille> membres = new ArrayList<>();

    public Famille(String nom) {
        this.nom = nom;
    }

    public void ajouter(MembreFamille membre) {
        membres.add(membre);
    }

    public void supprimerParNom(String nom) {
        membres.removeIf(m -> m.getNom().equalsIgnoreCase(nom));
    }

    @Override
    public void afficher(String indentation) {
        System.out.println(indentation + "+ " + nom);
        for (MembreFamille m : membres) {
            m.afficher(indentation + "   ");
        }
    }

    @Override
    public MembreFamille rechercher(String nom) {
        if (this.nom.equalsIgnoreCase(nom)) {
            return this;
        }

        for (MembreFamille m : membres) {
            MembreFamille res = m.rechercher(nom);
            if (res != null) return res;
        }
        return null;
    }

    @Override
    public String getNom() {
        return nom;
    }
}
