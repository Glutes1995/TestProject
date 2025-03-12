public class Person {
    private static int personCount;
    String name;
    String hairColor;
    int age;

    public Person(String name, String hairColor, int age) {
        this.name = name;
        this.hairColor = hairColor;
        this.age = age;
        personCount++;
    }
    //Method that returns personCount when called
    public static int getPersonCount() {
        return personCount;
    }
    public String toDeadlift() {
        if (hairColor.equals("blonde")) {
            return "is good at the deadlift";
        } else {
           return "is bad at the deadlift";
        }
    }
}
