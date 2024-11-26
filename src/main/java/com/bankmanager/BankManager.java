package com.bankmanager;

public class BankManager {

    public static void main(String[] args) {
        Adresa adresa = new Adresa("Buzau", "Pacii", 13579);
        Banca banca = new Banca("BT", adresa);
        ContBancar cont = new ContBancar(42, banca, "Alfred", 999999.13);
        Data inceput = new Data(2, 8, 2013);
        Data sfarsit = new Data(3, 9, 2014);
        Depozit d1, d2, d3;

        // Testare constructor fara paramentrii 
        d1 = new Depozit();
        System.out.println(">> d1\n" + d1 + "\n");

        // Testare constructor cu toti parametrii
        d2 = new Depozit(715, cont, 5, inceput, sfarsit, 123.4, 12345.6);
        System.out.println(">> d2\n" + d2 + "\n");

        // Testare constructor de copiere
        d3 = new Depozit(d2);
        System.out.println(">> d3\n" + d3 + "\n");
        // Testing GitHub
    }
}
