package Strings;

public class CapitalFirstLetterOfString {

    public static void main(String[] args) {

        String str = "arise! awake! and stop not until the goal is reached";
        String[] split = str.split(" ");

        for (String s : split) {

            String first = s.substring(0, 1);
            String remaining = s.substring(1, s.length());
            String add = first.toUpperCase() + remaining;
            System.out.print(s + " - ");
            System.out.println(add);

        }
    }
}
