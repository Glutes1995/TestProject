public class Værelse {
    public static void main(String[] args) {

        Lampe skrivebordsLampe = new Lampe(true);
        skrivebordsLampe.setName("Lampen ved skrivebordet");

        Lampe natLampe = new Lampe();
        natLampe.setName("Lampen ved siden af sengen");

        Lampe loftLampe = new Lampe(true);
        loftLampe.setName("Lampen over spisebordet");

        System.out.println("Antal lamper er " + Lampe.getNumberOfLamps());

        System.out.println(skrivebordsLampe);
        System.out.println(natLampe);
        System.out.println(loftLampe);

        skrivebordsLampe.flipTheSwitch();
        natLampe.flipTheSwitch();
        loftLampe.flipTheSwitch();

        System.out.println(skrivebordsLampe);
        System.out.println(natLampe);
        System.out.println(loftLampe);
    }
}
