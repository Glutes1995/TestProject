public class Lampe {
    //Instance variables for the class
    boolean isOn;
    private static int antalLamper;
    String name;

    //Constructor - blueprint for what your instance objects contain
    //Man skal give parametre for hvert objekt. her om den er tændt eller slukket(true or false)
    //parameteren bliver gemt i instance variablen
    public Lampe(boolean isOn) {
        this.isOn = isOn;
        //lampe tæller, der tæller hver gang du laver et nyt lampe objekt
        antalLamper++;
    }

    //Empty constructor "overload" - No parameter needed
    public Lampe() {
        this.isOn = false;
        //lampe tæller, der tæller hver gang du laver et nyt lampe objekt
        antalLamper++;
    }

    //Method that turns lights on and off
    public void flipTheSwitch() {
        isOn = !isOn;
    }

    //Metode der returnerer antallet af lampe objekter
    public static int getNumberOfLamps() {
        return antalLamper;
    }

    //Metode til at navngive en lampe
    public void setName(String name) {
        this.name = name;
    }

    //toString method that overrides existing toString method in javas Object class
    //Når du laver et print.out med dit objekt, så viser den hvad metoden har returneret
    //Metoden checker om en lampe er tændt eller slukket og returnerer output
    public String toString() {
        if (isOn) {
            return name + " er tændt";
        } else {
            return name + " er slukket";
        }
    }
}