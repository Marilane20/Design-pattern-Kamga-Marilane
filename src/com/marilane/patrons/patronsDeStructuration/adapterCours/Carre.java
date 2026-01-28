package com.marilane.patrons.patronsDeStructuration.adapterCours;

public class Carre implements Icarre{

    public float cote;

    public Carre( float cote){
        super();
        this.cote = cote ;
    }
    @Override
    public float Aire() {
        return cote * cote;
    }

    @Override
    public float Perimetre() {
        return cote * 4  ;
    }
}
