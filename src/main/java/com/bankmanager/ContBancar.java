package com.bankmanager;

public class ContBancar {

    int numar;
    Banca banca;
    String titular;
    double suma;

    ContBancar() {
        numar = 0;
        banca = new Banca();
        titular = "<gol>";
        suma = 0;
    }

    ContBancar(int numar, Banca banca, String titular, double suma) {
        this.numar = numar;
        this.banca = new Banca(banca);
        this.titular = titular;
        this.suma = suma;
    }

    ContBancar(ContBancar c) {
        this.numar = c.numar;
        this.banca = new Banca(c.banca);
        this.titular = c.titular;
        this.suma = c.suma;
    }

    @Override
    public String toString() {
        return "Numar: " + numar + " | Banca: " + banca + " | Titular: " + titular + " | Suma: " + suma;
    }
}
