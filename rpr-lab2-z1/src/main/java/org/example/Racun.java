package org.example;

public class Racun {
    public static double sinus(double broj){
        double rezultat=Math.sin(broj);
        return rezultat;
    }

    public static int faktorijel(int broj){
        if (broj < 0) {
            throw new IllegalArgumentException("Faktorijel nije definisan za negativne brojeve");
        }

       int fakt = 1;
        for (int i = 1; i <= broj; i++) {
           fakt *= i;
        }
        return fakt;}
}
