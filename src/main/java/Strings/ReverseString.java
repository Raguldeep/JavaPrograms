package Strings;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Reverse";
        String rev = "";

        char[] ch = str.toCharArray();

        for (int i = str.length() - 1; i >= 0; i--) {

            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
