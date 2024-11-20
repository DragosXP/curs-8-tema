package com.bankmanager;

public class Banca {

    String nume;
    Adresa adresa;

    Banca() {
        nume = "<gol>";
        adresa = new Adresa();
    }

    Banca(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = new Adresa(adresa);
    }

    Banca(Banca b) {
        this.nume = b.nume;
        this.adresa = new Adresa(b.adresa);
    }

    @Override
    public String toString() {
        return "Nume: " + nume + " | Adresa: " + adresa;
    }
}
