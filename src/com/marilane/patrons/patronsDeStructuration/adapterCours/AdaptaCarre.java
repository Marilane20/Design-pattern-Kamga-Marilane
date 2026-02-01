package com.marilane.patrons.patronsDeStructuration.adapterCours;

public class AdaptaCarre implements Icarre{

   private Rectangle rectangle;

   public AdaptaCarre (Rectangle rectangle){
       super();
       this.rectangle = rectangle;
   }

    @Override
    public float Aire() {
        return rectangle.Aire();
    }

    @Override
    public float Perimetre() {
        return rectangle.perimetre();
    }
}
