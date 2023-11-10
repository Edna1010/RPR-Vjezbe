package org.example;

import java.util.Objects;

enum Grad {SARAJEVO, ZENICA, MOSTAR}

public class FiksniBroj extends TelefonskiBroj {
    Grad grad;
    String broj;

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        switch (grad){
            case SARAJEVO:
                System.out.printf("033/"+broj);
                break;
            case MOSTAR:
                System.out.printf("036/"+broj);
                break;
            case ZENICA:
                    System.out.printf("032/"+broj);
            break;

        }
        return "";
    }

    @Override
    public int hashCode() {
        return 0;
    }


}
