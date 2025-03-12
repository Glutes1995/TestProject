public class MyWorld {
    public static void main(String[] args) {

        Person a = new Person("Martin", "blonde", 29);
        Person b = new Person("Morten", "red", 32);

        System.out.println("The person count is: " + Person.getPersonCount());

        System.out.println(a.name + " has " + a.hairColor + " hair and is " + a.age + " years old.");
        System.out.println(b.name + " has " + b.hairColor + " hair and is " + b.age + " years old.");

        System.out.println(a.name + " " + a.toDeadlift());
        System.out.println(b.name + " " + b.toDeadlift());

    }
}
