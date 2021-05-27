package com.company;

public class comanda {

    protected int id_comanda;
    protected String nume_client;
    protected String adresa_client;
    protected String produs_comandat;

    public comanda( int id_comanda, String nume_client,  String adresa_client, String produs_comandat ){
        this.id_comanda = id_comanda;
        this.nume_client = nume_client;
        this.adresa_client = adresa_client;
        this.produs_comandat = produs_comandat;
    }

    public int getId_comanda() {
        return id_comanda;
    }

    public String getAdresa_client() {
        return adresa_client;
    }

    public String getNume_client() {
        return nume_client;
    }

    public String getProdus_comandat() {
        return produs_comandat;
    }

    public void setAdresa_client(String adresa_client) {
        this.adresa_client = adresa_client;
    }

    public void setId_comanda(int id_comanda) {
        this.id_comanda = id_comanda;
    }

    public void setNume_client(String nume_client) {
        this.nume_client = nume_client;
    }

    public void setProdus_comandat(String produs_comandat) {
        this.produs_comandat = produs_comandat;
    }
}
