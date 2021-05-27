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

    public int getId_vin() {
        return id_vin;
    }

    public String getNume() {
        return nume;
    }

    public float getAlcoolemie() {
        return alcoolemie;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAlcoolemie(float alcoolemie) {
        this.alcoolemie = alcoolemie;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setId_vin(int id_vin) {
        this.id_vin = id_vin;
    }
}
