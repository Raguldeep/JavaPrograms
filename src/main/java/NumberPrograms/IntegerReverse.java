package NumberPrograms;

public class IntegerReverse {

    public static void main(String[] args) {

        int number = 542341;
        int remainder = 0;
        int reverse = 0;
        int temp = number;


        while (number != 0) {

            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        System.out.println(reverse);

    }
}
