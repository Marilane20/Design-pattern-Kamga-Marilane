package com.marilane.patrons.patronsDeStructuration.composite.elementSysteme;

public class Client {

    public static void main( String args[]) {

        System.out.println("=======================PROGRAMME PATRON COMPOSITE======================");

        ElementSystem fichierTexte = new FichierTxt("les patrons de structuration" ,"texte");
        ElementSystem fichierpdf = new FichierPdf("les patrons de conception" ,"pdf");
        ElementSystem td1pdf = new FichierPdf("exercices sur les patrons de construction" ,"pdf");
        ElementSystem td2pdf = new FichierPdf("exercices sur les patrons de structuration" ,"pdf");

        Dossier repertoireCoursInf461 = new Dossier("cours INF 461 annee 2025-2026");
        Dossier repertoireTDInf461 = new Dossier("travaux diriges INF 463 annee 2025-2026");

        repertoireTDInf461.ajouterElement(td1pdf);
        repertoireTDInf461.ajouterElement(td2pdf);

        repertoireCoursInf461.ajouterElement(repertoireTDInf461);

        fichierTexte.decrire();
        fichierpdf.decrire();
        td1pdf.decrire();
        td2pdf.decrire();

        System.out.println("========================les repertoires===========================");
        repertoireTDInf461.decrire();
        repertoireCoursInf461.decrire();




    }
}
