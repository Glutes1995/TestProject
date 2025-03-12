public class AdvSwitch {
    public static void main(String[] args) {

        String day = "Monday";
        String result;

        result = switch(day) {
            case "Saturday", "Sunday" -> "6am";
            case "Monday" -> "8am";
            default -> "7am";
        };

        System.out.println(result);
    }
}
