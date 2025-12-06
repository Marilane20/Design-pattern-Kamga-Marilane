package com.marilane.patrons.patronsDeConstruction.builder.builderModifie;

public class MonteurPizzaMargarita extends MonteurPizza{

    public void monterPate() {
        pizza.setPate("classique");
    }

    public void monterSauce() {
        pizza.setSauce("tomate");
    }

    public void monterGarniture() {
        pizza.setGarniture("mozzarella + basilic");
    }
}
