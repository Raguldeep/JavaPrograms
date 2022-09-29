package Arrays;

import java.util.Arrays;

public class CopyOneArrayToAnotherArray {

    public static void main(String[] args) {

        int[] arrOne = {1, 2, 3, 4, 5, 6};
        int[] arrTwo = new int[arrOne.length];

        for (int i = 0; i < arrOne.length; i++) {
            arrTwo[i] = arrOne[i];
        }

        for (int i = 0; i < arrOne.length; i++) {
        }
        System.out.print("Array One - " + Arrays.toString(arrOne));

        System.out.println();

        for (int i = 0; i < arrTwo.length; i++) {
        }
        System.out.print("Array Two - " + Arrays.toString(arrTwo));

    }
}
