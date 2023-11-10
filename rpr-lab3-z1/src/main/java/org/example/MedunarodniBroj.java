package org.example;

public class MedunarodniBroj extends TelefonskiBroj{
    String drzava;
    String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        String ispis=drzava+"/"+broj;
        System.out.printf(ispis);
        return ispis;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
