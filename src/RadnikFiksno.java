public class RadnikFiksno extends Radnik {


    public RadnikFiksno(String ime, String prezime, String jmbg, String ziroRacun, int plata) {
        super(ime, prezime, jmbg, ziroRacun, plata);
    }

    @Override
    void isplatiPlatu() {
        System.out.println(this);

    }
}
