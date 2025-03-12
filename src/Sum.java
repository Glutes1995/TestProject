public class Sum {

    //Method that sums two numbers
    public static int sum(int a, int b) {

        return a + b;
    }


    public static void main(String[] args) {
        //calls upon method with arguments and saves it in the variable sum + prints the result of the method
        int sum = sum(5, 5);
        System.out.println(sum);
    }
}
