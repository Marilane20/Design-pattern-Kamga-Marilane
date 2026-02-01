package com.marilane.patrons.patronsDeStructuration.adapterCours;

public class Client {

    public static void main ( String args[]){

       Carre carre = new Carre(14);

       AdaptaCarre adaptateur = new AdaptaCarre(new Rectangle(12,12));


       System.out.println("==================INFORMATIONS DU CARREE===========================");
       System.out.println(carre.Aire());
       System.out.println(carre.Perimetre());
       System.out.println("==================INFORMATION DU RECTANGLE==========================");
       System.out.println(adaptateur.Aire());
       System.out.println(adaptateur.Perimetre());





    }
}
