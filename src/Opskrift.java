import java.util.Scanner;

public class Opskrift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fortæl mig hvor mange cookies du kunne ønske dig at bage");
        int cookies = scanner.nextInt();

        System.out.println("Hvor mange gram mel skal man bruge til det?");
        int mel = scanner.nextInt();

        System.out.println("Så man skal altså bruge " + mel + " gram mel " + "til at lave " + cookies + " cookies");

        scanner.close();
    }
}
