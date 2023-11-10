package org.example;

public class FiksniBroj extends TelefonskiBroj{
    private String broj;
  private Grad grad;
    public FiksniBroj(Grad grad, String broj) {
        this.grad=grad;
        this.broj = broj;
    }



    @Override
    public String ispisi() {
        switch(grad)
            case SARAJEVO;

    }

    @Override
    public int hashCode() {
        return 0;
    }
}
