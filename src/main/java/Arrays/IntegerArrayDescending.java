package Arrays;

import java.util.Arrays;

public class IntegerArrayDescending {

    static int[] arrOne = {12, 20, 3, 24, 5, 16};

    public static void main(String[] args) {

        Arrays.sort(arrOne);

        System.out.println(Arrays.toString(arrOne));

        for (int i = arrOne.length - 1; i >= 0; i--) {
            System.out.println(arrOne[i]);
        }
    }
}
