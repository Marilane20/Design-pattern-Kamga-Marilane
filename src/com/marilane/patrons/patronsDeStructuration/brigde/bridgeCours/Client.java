package com.marilane.patrons.patronsDeStructuration.brigde.bridgeCours;

public class Client {

    public static void main( String[] args){

        System.out.println("=========les cercles de differentes couleurs=======");

        Forme cercle1 = new Cercle(new CouleurRouge());
        Forme cercle2 = new Cercle(new CouleurVert());
        cercle1.dessiner();
        cercle2.dessiner();

        System.out.println("=========les rectangles de differentes couleurs=======");

        Forme rect1 = new Rectangle(new CouleurVert());
        Forme rect2 = new Rectangle(new CouleurRouge());
        rect1.dessiner();
        rect2.dessiner();




    }
}
