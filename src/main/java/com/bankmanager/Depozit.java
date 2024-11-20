package com.bankmanager;

public class Depozit {

    int numar;
    ContBancar cont;
    double dobanda;
    Data dataInceput;
    Data dataSfarsit;
    double sumaInitiala;
    double sumaFinala;

    Depozit() {
        numar = 0;
        cont = new ContBancar();
        dobanda = 0;
        dataInceput = new Data();
        dataSfarsit = new Data();
        sumaInitiala = 0;
        sumaFinala = 0;
    }

    Depozit(int numar, ContBancar cont, double dobanda, Data dataInceput,
            Data dataSfarsit, double sumaInitiala, double sumaFinala) {

        this.numar = numar;
        this.cont = new ContBancar(cont);
        this.dobanda = dobanda;
        this.dataInceput = new Data(dataInceput);
        this.dataSfarsit = new Data(dataSfarsit);
        this.sumaInitiala = sumaInitiala;
        this.sumaFinala = sumaFinala;
    }

    Depozit(Depozit d) {
        this.numar = d.numar;
        this.cont = new ContBancar(d.cont);
        this.dobanda = d.dobanda;
        this.dataInceput = new Data(d.dataInceput);
        this.dataSfarsit = new Data(d.dataSfarsit);
        this.sumaInitiala = d.sumaInitiala;
        this.sumaFinala = d.sumaFinala;
    }

    @Override
    public String toString() {
        return "Numar: " + numar + "\nCont: " + cont + "\nDobanda: " + dobanda + "\nData Inceput: " + dataInceput
                + "\nData Sfarsit: " + dataSfarsit + "\nSuma Initiala: " + sumaInitiala + "\nSuma Finala: " + sumaFinala;
    }
}
