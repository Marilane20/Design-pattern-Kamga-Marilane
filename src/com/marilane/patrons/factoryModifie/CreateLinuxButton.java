package com.marilane.patrons.factoryModifie;

public class CreateLinuxButton extends BoutonCreator{
    @Override
    Bouton createBouton() {
        return new BoutonLinux();
    }
}
