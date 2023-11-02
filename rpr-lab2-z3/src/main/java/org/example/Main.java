package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Unesite brojeve u listu, za kraj unosa napisite stop");
        List<Double>lista=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
       while(true){
           String unos=scanner.next();
           if(unos.equals("stop"))
               break;
          try{
               double broj=Double.parseDouble(unos);
               lista.add(broj);
           }
          catch(NumberFormatException e){
              System.out.printf("Unos nije ispravan. Molimo ponovite");
       }}
       if(lista.isEmpty())
           System.out.printf("Niste unijeli nijedan broj");
       else {
           double min= Collections.min(lista);
           double max=Collections.max(lista);
           double suma= (double) 0.0;
           for(double i:lista)
               suma+=i;
           double mean=suma/ lista.size();
           double suma_kvadrata=0.0;
           for(double i: lista)
               suma_kvadrata+=Math.pow(i,2);
           double standardna_devijacija=Math.sqrt(suma_kvadrata/ lista.size());
            System.out.printf("Minimalni element u listi je: "+min);
            System.out.printf("\nMaksimalni element u listi je: "+max);
            System.out.printf("\nMean ove liste je: "+mean);
            System.out.printf("\nStandardna devijacija iznosi: "+standardna_devijacija);
       }


    }}
