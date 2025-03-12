public class Calculator {
    public static void main(String[] args) {
        double sum = add(2, 2);
        double subResult = sub(2, 2);
        double mulresult = mul(2, 2);
        double divResult = div(8, 2);

        System.out.println("2+2= " + sum);
        System.out.println("2-2= " + subResult);
        System.out.println("2*2= " + mulresult);
        if (divResult != 0) {
            System.out.println("8/2= " + divResult);
        } else {
            System.out.println("You can't divide by zero!");
        }
        /*
        String zero = (div(2, 1) == 0) ? "You can't divide by zero" : "8/2= " + divResult;
        System.out.println(zero); */

    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (!(b == 0)) {
            return a / b;
        } else {
            return 0;
        }
    }
}