package Strings;

public class CountTheNumberOfWordsInString {

    public static void main(String[] args) {

        String word = "we are getting character at any particular index";

        String[] split = word.split(" ");
        System.out.println(split.length);

        for (String count : split) {

            System.out.println(count);
        }
    }
}
