public class Hilsen {

    String name;

    Hilsen(String name) {
        this.name = name;
    }

    public void hej() {

        System.out.println("Hej " + name + "!");
    }

    public static void main(String[] args) {

        Hilsen hilsen = new Hilsen("Peter");
        hilsen.hej();
    }
}
