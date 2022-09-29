package NumberPrograms;

public class NumberPalindrome {

    public static void main(String[] args) {

        int number = 121;
        int remainder = 0;
        int reverse = 0;
        int temp = number;


        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        if (temp == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}
