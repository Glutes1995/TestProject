public class TemperatureCalculator {
    //Metode der beregner fahrenheit til celsius
    public static double fahrToCels(double fahr) {
        double result = (fahr - 32) * 5 / 9;
        return result;
    }
    //Metode der beregner celsius til fahrenheit
    public static double celsToFahr(double cels) {
        return cels * 9 / 5 + 32;
    }
    //main metoden der kalder på metoderne og gemmer dem i variableog derefter outputter resultatet
    public static void main(String[] args) {
        double cels = TemperatureCalculator.fahrToCels(68);
        System.out.println("68 grader fahrenheit = " + cels + "  grader Celsius");
        double fahrenheit = TemperatureCalculator.celsToFahr(20);
        System.out.println("20 grader celsius = " + fahrenheit + " grader Fahrenheit");
    }
}