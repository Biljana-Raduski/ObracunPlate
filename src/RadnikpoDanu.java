public class RadnikpoDanu extends Radnik{


    public RadnikpoDanu(String ime, String prezime, String jmbg, String ziroRacun, int plata) {
        super(ime, prezime, jmbg, ziroRacun, plata);
    }

    @Override
    void isplatiPlatu() {
        plata = plata * 24; //obracun dnevnica za 24 radna dana
        System.out.println(this);

    }
}
