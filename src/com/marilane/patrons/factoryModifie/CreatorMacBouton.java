package com.marilane.patrons.factoryModifie;

public class CreatorMacBouton  extends  BoutonCreator{
    @Override
    Bouton createBouton() {
        return new BoutonMac();
    }
}
