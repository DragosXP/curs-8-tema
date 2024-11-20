package com.bankmanager;

public class Adresa {

    String oras;
    String strada;
    int codPostal;

    Adresa() {
        oras = "<gol>";
        strada = "<gol>";
        codPostal = 0;
    }

    Adresa(String oras, String strada, int codPostal) {
        this.oras = oras;
        this.strada = strada;
        this.codPostal = codPostal;
    }

    Adresa(Adresa a) {
        this.oras = a.oras;
        this.strada = a.strada;
        this.codPostal = a.codPostal;
    }

    @Override
    public String toString() {
        return "Oras: " + oras + " | Strada: " + strada + " | Cod Postal: " + codPostal;
    }
}
