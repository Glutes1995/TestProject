import java.util.Scanner;

public class TommeBeregner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double cmPerTomme = 2.54;

        System.out.println("Velkommen til Tommeberegneren!\n" +
                "Her kan du få omregnet tommer til centimeter =)\n\n" +
                "Hvor mange tommer vil du have omregnet? Angiv gerne decimaler!");
        double tommer = scanner.nextDouble();
        double tommerTilCm = tommer * cmPerTomme;
        System.out.println("Du har spurgt hvor mange centimeter " + tommer + " tommer svarer til.\n" +
                "Svaret er ca. " + tommerTilCm + " cm.");

        scanner.close();
    }
}