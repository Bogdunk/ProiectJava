package com.company;

public class Angajat {
    protected String nume;
    protected int varsta;
    protected String post_ocupat;

    public Angajat( String nume, int varsta, String post_ocupat ){
        this.nume = nume;
        this.varsta = varsta;
        this.post_ocupat = post_ocupat;
    }
    public void arata_angajat(){
        System.out.print("Nume:" + this.nume + "\nVarsta:" + this.varsta + "\nPost:" + post_ocupat);
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getPost_ocupat() {
        return post_ocupat;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPost_ocupat(String post_ocupat) {
        this.post_ocupat = post_ocupat;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
