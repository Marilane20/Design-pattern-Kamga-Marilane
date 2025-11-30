package com.marilane.patrons.factoryModifie;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        System.out.println("entrez le type de bouton a creer");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();



        switch (type) {

            case "Linux":

                creerBouton(new CreateLinuxButton() );
                break;


            case "windows":

                creerBouton(new CreatorWindowsButton());

                break;


            case "Mac":


                creerBouton( new CreatorMacBouton());



        }


    }

    public static void creerBouton( BoutonCreator bn)
    {

        Bouton bouton = bn.createBouton();
        bouton.afficherBouton();

    }
}
