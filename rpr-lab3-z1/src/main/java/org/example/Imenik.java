package org.example;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.String;

public class Imenik {
    String ime;
    TelefonskiBroj broj;
    HashMap mapa=new HashMap<String, TelefonskiBroj>();
    public void dodaj(String ime, TelefonskiBroj broj){
        mapa.put(ime, broj);

    }
    public String dajBroj(String ime){
        String broj= mapa.get(ime).toString();
        return broj;
    }
    String dajIme(TelefonskiBroj broj){
        String ime= mapa.get(broj).toString();
        return ime;
    }
    String naSlovo(char s){
       for(Map.Entry<String,TelefonskiBroj>unos:mapa.entrySet()){
           String ime=unos.getKey();
           if(ime.charAt(0)==Character.toLowerCase(s))
               System.out.println(ime+"-"+mapa.get(ime));
       }


    }

}
