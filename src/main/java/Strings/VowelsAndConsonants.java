package Strings;

public class VowelsAndConsonants {

    public static void main(String[] args) {

        String str = "Please enter some text";

        int vowels = 0;
        int consonants = 0;
        int space = 0;

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch == ' ') {
                space++;
            } else {
                consonants++;
            }
        }
        System.out.println(vowels);
        System.out.println(space);
        System.out.println(consonants);
    }
}
