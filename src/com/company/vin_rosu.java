package com.company;

public class vin_rosu extends Vin {
    private String proprietati;

    public vin_rosu(int id_vin, String nume, float alcoolemie, int cantitate, String proprietati_vin) {
        super(id_vin, nume, alcoolemie, cantitate);
        this.proprietati = proprietati_vin;
    }
    public void print_vin_rosu(){
        System.out.print("Crama noastra are vin " + this.nume + " de alcoolemie "  + this.alcoolemie
                + "% in cantitatea de " + this.cantitate + "(L) si este indexat cu id-ul " + this.id_vin + "." );
        System.out.println("Vinul " + this.nume + " are " + this.proprietati);

    }
}
