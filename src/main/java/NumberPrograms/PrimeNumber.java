package NumberPrograms;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 4;
        boolean flag = false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % 2 == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {

            System.out.println("Prime number");
        } else {

            System.out.println("Not a Prime number");
        }
    }
}
