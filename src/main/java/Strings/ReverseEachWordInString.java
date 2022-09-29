package Strings;

public class ReverseEachWordInString {

    public static void main(String[] args) {

        String str = "Welcome to Geeks for Geeks to the Country";
        String reverseString = "";

        String[] split = str.split(" ");

        for (String s : split) {

            String word = s;
            String revWord = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                revWord = revWord + word.charAt(i);
            }

            reverseString = reverseString + revWord + " ";
        }
        System.out.println(reverseString);

    }
}
