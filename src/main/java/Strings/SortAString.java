package Strings;

import java.util.Arrays;

public class SortAString {

    public static void main(String[] args) {

        String str = "GeeksforGeeks";

        char[] ch = str.toLowerCase().toCharArray();

        Arrays.sort(ch);
        System.out.println(ch);
    }
}
