package Strings;

import java.util.Arrays;

public class StringAscending {

    public static void main(String[] args) {

        String[] str = {"Uyg", "hgf", "Apple", "ball"};
        String[] lower = new String[str.length];

        for (int i = 0; i < str.length; i++) {
            lower[i] = str[i].toLowerCase();
        }
        Arrays.sort(lower);
        System.out.println(Arrays.toString(lower));

    }
}
