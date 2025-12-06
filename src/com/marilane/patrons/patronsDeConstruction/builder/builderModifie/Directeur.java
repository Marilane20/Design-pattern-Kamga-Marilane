package com.marilane.patrons.patronsDeConstruction.builder.builderModifie;

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

    //construire pizza vegetarienne
    public Pizza construirepizzaVegetarienne()
    {
        MonteurPizza pizzaVegetarienne = new MonteurPizzaVegetarienne();

        return pizzaVegetarienne.getPizza();
    }

    //construire pizza Margarita
    public Pizza construirepizzaMargarita()
    {
        MonteurPizza pizzaMargarita = new MonteurPizzaMargarita();

        return pizzaMargarita.getPizza();
    }


}
