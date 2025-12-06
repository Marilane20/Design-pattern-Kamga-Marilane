package com.marilane.patrons.patronsDeConstruction.builder.builderCours;

public  abstract class MonteurPizza {

    protected Pizza pizza = new Pizza ();


    public Pizza getPizza(){

        //appel des methodes pour construire respectivement la pate; sauce et garniture
        monterPate();
        monterSauce();
        monterGarniture();

        return pizza;
    }

    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();

}
