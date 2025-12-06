package com.marilane.patrons.patronsDeConstruction.builder.builderModifie;

public class MonteurPizzaVegetarienne extends MonteurPizza{


    public void monterPate() {
        pizza.setPate("fine");
    }

    public void monterSauce() {
        pizza.setSauce("tomate");
    }

    public void monterGarniture() {
        pizza.setGarniture("poivron + oignon + olives");
    }
}
