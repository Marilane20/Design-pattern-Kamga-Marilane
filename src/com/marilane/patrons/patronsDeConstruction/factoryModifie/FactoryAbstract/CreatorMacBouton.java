package com.marilane.patrons.patronsDeConstruction.factoryModifie.FactoryAbstract;

public class CreatorMacBouton  extends BoutonCreator {
    @Override
    Bouton createBouton() {
        return new BoutonMac();
    }
}
