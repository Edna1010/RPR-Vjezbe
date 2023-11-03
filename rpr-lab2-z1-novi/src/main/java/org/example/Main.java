package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for(String s:args){
            int parametar=Integer.parseInt(s);
            int faktorijel=Racun.faktorijel(parametar);
            double parametar2=Double.parseDouble(s);
            double sinus=Racun.sinus(parametar2);
            System.out.println("Faktorijel broja je: "+faktorijel);
            System.out.println("\nSinus broja je: "+sinus);
        }
    }}