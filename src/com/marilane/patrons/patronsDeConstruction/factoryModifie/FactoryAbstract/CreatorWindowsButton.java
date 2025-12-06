package com.marilane.patrons.patronsDeConstruction.factoryModifie.FactoryAbstract;

public class CreatorWindowsButton extends BoutonCreator {
    @Override
    Bouton createBouton() {
        return new BoutonWindows();

    }
}
