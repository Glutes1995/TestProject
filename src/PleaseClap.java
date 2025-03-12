import java.util.Scanner;

public class PleaseClap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String clapEmoji = "\uD83D\uDC4F";

        System.out.println("Skriv en sætning her og tryk enter, så skal du få et bifald");

        String input = scanner.nextLine();
        String klap = input.replace(" ",clapEmoji);
        System.out.println(klap.toUpperCase());

        scanner.close();
    }
}
