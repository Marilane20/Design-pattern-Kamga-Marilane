package com.marilane.patrons.patronsDeStructuration.composite.arbreGenealogique;

public interface MembreFamille {

    void afficher(String indentation);

    MembreFamille rechercher(String nom);

    String getNom();
}
