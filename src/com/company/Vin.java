package com.company;

public class Vin {
    protected int id_vin;
    protected String nume;
    protected float alcoolemie;
    protected int cantitate;


    public Vin( int id_vin, String nume,  float alcoolemie, int cantitate){
        this.id_vin = id_vin;
        this.nume = nume;
        this.alcoolemie = alcoolemie;
        this.cantitate = cantitate;
    }

    public void print(){
        System.out.println("Crama noastra are vin " + this.nume + " de alcoolemie "  + this.alcoolemie
                + "% in cantitatea de " + this.cantitate + "(L) si este indexat cu id-ul " + this.id_vin + ".");
    }



}
