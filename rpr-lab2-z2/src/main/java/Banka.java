import java.util.List;

public class Banka {
    private Long brojRacuna;
    private List<Korisnik> korisnici;
    private List<Uposlenik>uposlenici;

    public Banka() {
    }
    public Korisnik kreirajNovogKorisnika(String ime, String prezime){
        Korisnik korisnik=new Korisnik(ime, prezime);
        return korisnik;
    }

    public Uposlenik kreirajNovogUposlenika(String ime, String prezime){
        Uposlenik uposlenik=new Uposlenik(ime, prezime);
        return uposlenik;
    }
    public Racun kreirajRacunZaKorisnika(Korisnik korisnik){
        Racun racun=new Racun(korisnik);
        return racun;
    }
}
