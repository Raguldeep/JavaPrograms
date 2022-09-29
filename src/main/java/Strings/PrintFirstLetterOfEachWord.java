package Strings;

public class PrintFirstLetterOfEachWord {

    public static void main(String[] args) {

        String inputString = "Arise! Awake! and stop not until the goal is reached";

        String[] split = inputString.split(" ");

        for (String firstLetter : split) {

            String f = firstLetter.substring(0,1);
            System.out.println(f.toLowerCase());

        }
    }
}
