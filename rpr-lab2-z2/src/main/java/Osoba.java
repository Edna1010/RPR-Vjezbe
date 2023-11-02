public class Osoba {
    String Ime;
    String Prezime;

    public Osoba(String ime, String prezime) {
        Ime = ime;
        Prezime = prezime;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "Ime='" + Ime + '\'' +
                ", Prezime='" + Prezime + '\'' +
                '}';
    }
}
