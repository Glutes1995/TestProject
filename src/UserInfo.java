import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv venligst deres navn");
        String navn = scanner.nextLine();

        System.out.println("Hej " + navn + "! Hvad er din yndlingsfarve?");
        String farve = scanner.nextLine();

        System.out.println("Jeg kan også godt lide farven " + farve + " =)");
        System.out.println("Så du hedder altså " + navn + " og kan lide farven " + farve);

        scanner.close();
    }
}