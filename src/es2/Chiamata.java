package es2;

import es1.Rettangolo;

import java.util.Scanner;

public class Chiamata {
    public static void  main(String[] args){
        System.out.println("hello");

    }
    private int durata;
    private String numeroChiamato;


    public Chiamata(int durata, String numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }
    public int getDurata() {
        return durata;
    }
    public String getNumeroChiamato() {
        return numeroChiamato;
    }
}
