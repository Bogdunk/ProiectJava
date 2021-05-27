package com.company;

public class comanda_online extends comanda {
    private String data_primire_comanda;

    public comanda_online(int id_comanda, String nume_client, String adresa_client, String produs_comandat) {
        super(id_comanda, nume_client, adresa_client, produs_comandat);
    }
}
