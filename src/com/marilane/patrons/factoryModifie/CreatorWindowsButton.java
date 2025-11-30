package com.marilane.patrons.factoryModifie;

public class CreatorWindowsButton extends BoutonCreator{
    @Override
    Bouton createBouton() {
        return new BoutonWindows();

    }
}
