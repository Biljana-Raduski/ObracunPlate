public abstract class Radnik {

    protected String ime;
    protected String prezime;
    protected String jmbg;
    protected String ziroRacun;
    protected int plata;



    public Radnik(String ime, String prezime, String jmbg, String ziroRacun, int plata) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.ziroRacun = ziroRacun;
        this.plata = plata;

        }
        abstract void isplatiPlatu();

    @Override
    public String toString() {
        return "Radnik{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", jmbg='" + jmbg + '\'' +
                ", ziroRacun='" + ziroRacun + '\'' +
                ", plata=" + plata +
                '}';
    }
}

