package com.marilane.patrons.patronsDeConstruction.factoryModifie.FactoryAbstract;

public class CreateLinuxButton extends BoutonCreator {
    @Override
    Bouton createBouton() {
        return new BoutonLinux();
    }
}
