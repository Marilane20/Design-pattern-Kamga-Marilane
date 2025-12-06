package com.marilane.patrons.patronsDeConstruction.builder.builderCours;

public class Directeur {

    //construire pizza reine
    public Pizza construirePizzaPiquante(){

        MonteurPizza pizzap = new MonteurPizzaPiquante();

        return pizzap.getPizza();
    }

    //construire pizza piquante
    public Pizza construirepizzaReine()
    {
        MonteurPizza pizzaReine = new MonteurPizzaReine();

        return pizzaReine.getPizza();
    }
}
