package com.marilane.patrons.patronsDeConstruction.singletonCours;

public  final class Singleton {

    private static Singleton instance=null;
    public int x;
    public  int y;


    private Singleton(int x2,int y2){

        this.x = x2;
        this.y = y2;
    }

    public Singleton() {

    }

    public static Singleton getInstance(){

        if(instance == null) {
            instance= new Singleton();
        }

        return instance;
    }

    public static Singleton getInstance(int x, int y){

        if(instance == null) {
            instance= new Singleton(x,y);
        }

        return instance;
    }


    public int Somme(int x ,int y){
        return x+y;
    }

    public float moyenne(int x ,int y){
        return Somme(x,y)/2;
    }

    public void affiche(){
        System.out.println("\n je suis une insance et mes valerus sont : x= "+this.x+" et y="+this.y);
    }

    //redefinie la methode clone pour empecher son utilisation

   /* @Override
    public Object Clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }*/

}
