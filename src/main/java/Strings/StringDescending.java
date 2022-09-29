package Strings;

import java.util.Arrays;

public class StringDescending {

    public static void main(String[] args) {

        String[] str = {"Uyg", "hgf", "Apple", "ball"};
        String[] des = new String[str.length];

        for (int i = 0; i < str.length; i++) {
            des[i] = str[i].toLowerCase();
        }

        Arrays.sort(des);
        for (int i = des.length - 1; i >= 0; i--) {
            System.out.println(des[i]);
        }
    }
}
