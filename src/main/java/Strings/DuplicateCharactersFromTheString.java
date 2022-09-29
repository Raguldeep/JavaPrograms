package Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersFromTheString {

    public static void main(String[] args) {

        String str = "Process finished with exit code";

        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] ch = str.toCharArray();

        for (Character cha : ch) {
            if (hashMap.containsKey(cha)) {
                hashMap.put(cha, hashMap.get(cha) + 1);
            } else {
                hashMap.put(cha, 1);
            }
        }

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
