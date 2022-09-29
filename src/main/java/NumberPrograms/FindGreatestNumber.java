package NumberPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class FindGreatestNumber {

    public static void main(String[] args) {

        int a = 555;
        int b = 10;
        int c = 300;

//        ArrayList<Integer> arr =new ArrayList<>();
//        arr.add(a);
//        arr.add(b);
//        arr.add(c);
//        System.out.println(arr);
//
//        System.out.println(Collections.min(arr));

        if (a >= b && a >= c) {
            System.out.println("A is the greatest");

        } else if (b >= c && b >= a) {
            System.out.println("B is the greatest");

        } else {
            System.out.println("C is the greatest");

        }
    }
}
