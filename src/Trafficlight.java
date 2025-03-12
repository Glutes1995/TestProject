import java.util.Scanner;

public class Trafficlight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv grøn, gul eller rød med små bogstaver og tryk ENTER");
        String color = scanner.nextLine();

        switch (color) {
            case "grøn":
                System.out.println("Gå!");
                break;
            case "gul":
                System.out.println("Vent!");
                break;
            case "rød":
                System.out.println("Stop!");
                break;
            default:
                System.out.println("Det er ikke en af farverne!\n" +
                        "Eller også har du glemt at skrive med småt");
        }

        String safety = color.equals("grøn") ? "Det er sikkert at krydse vejen" :
                color.equals("gul") ? "Det er ikke sikkert at krydse vejen endnu" :
                        color.equals("rød") ? "Det er ikke sikkert at krydse vejen" :
                                "";
        System.out.println(safety);
    }
}
