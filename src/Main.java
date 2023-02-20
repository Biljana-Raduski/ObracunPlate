public class Main {
    public static void main(String[] args) {

        Radnik radnikpoSatu1 = new RadnikpoSatu("Nemanja", "Paunovic", "0507998710658","200265897",350);
        radnikpoSatu1.isplatiPlatu();

        Radnik radnikpodanu1 = new RadnikpoDanu("Vladimir", "Obrenovic","25478691","54789625",3000);
        radnikpodanu1.isplatiPlatu();

        Radnik radnikfiksno1 = new RadnikFiksno("Stefan","Filipovic","2654488996","24558845",80000);
        radnikfiksno1.isplatiPlatu();


    }
}