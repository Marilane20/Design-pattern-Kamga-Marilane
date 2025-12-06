package com.marilane.patrons.patronsDeConstruction.builder.builderModifie;

public class MonteurPizzaPiquante  extends MonteurPizza{

    public void monterPate(){

        pizza.setPate("feuilletee");
    }

    public void monterSauce(){

        pizza.setSauce("piquante");
    }

    public void monterGarniture(){

        pizza.setGarniture("pepperoni + salami");
    }

}
