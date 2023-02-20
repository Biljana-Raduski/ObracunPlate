public class RadnikpoSatu extends Radnik{


    public RadnikpoSatu(String ime, String prezime, String jmbg, String ziroRacun, int plata) {
        super(ime, prezime, jmbg, ziroRacun, plata);
    }

    @Override
    void isplatiPlatu() {
       plata = plata * 8 * 24; //obracun plate po satu za 24 radna dana
        System.out.println(this);

    }
}
