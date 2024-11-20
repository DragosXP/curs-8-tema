package com.bankmanager;

public class Data {

    int zi;
    int luna;
    int an;

    Data() {
        zi = 1;
        luna = 1;
        an = 1900;
    }

    Data(int zi, int luna, int an) {
        this.zi = zi;
        this.luna = luna;
        this.an = an;
    }

    Data(Data d) {
        this.zi = d.zi;
        this.luna = d.luna;
        this.an = d.an;
    }

    @Override
    public String toString() {
        return zi + "/" + luna + "/" + an;
    }
}
