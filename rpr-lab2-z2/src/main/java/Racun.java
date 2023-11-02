public class Racun {
    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private Double stanjeRacuna;

    public Racun( Osoba korisnikRacuna) {
        this.korisnikRacuna = korisnikRacuna;
    }

    private boolean provjeriOdobrenjePrekoracenja(Double odobrenje) {
        return false;
    }

    public boolean izvrsiUplatu(Double uplata){
        return false;
    }
    public boolean izvrsiIsplatu(Double isplata){
        return false;
    }
    public void odobriPrekoracenje(Double prekoracenje){};

}
