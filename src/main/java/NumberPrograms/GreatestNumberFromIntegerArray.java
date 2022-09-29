package NumberPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class GreatestNumberFromIntegerArray {

    public static void main(String[] args) {

        int[] arr = {1, 7, 2, 4, 5, 6, 8, 3};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }

        System.out.println(Collections.min(arrayList));
    }
}
