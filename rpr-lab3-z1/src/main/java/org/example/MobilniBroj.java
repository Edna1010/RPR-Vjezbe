package org.example;

public class MobilniBroj extends TelefonskiBroj{
    int mobilnaMreza;
    String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        String ispis="0"+mobilnaMreza+"/"+broj;
        System.out.printf(ispis);
                return ispis;

    }

    @Override
    public int hashCode() {
        return 0;
    }
}
