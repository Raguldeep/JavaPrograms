package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintUniqueWordsFromString {

    public static void main(String[] args) {

        String str = "Welcome to Geeks for Geeks to the Country";
        HashMap<String, Integer> hashMap = new HashMap<>();

        String[] split = str.split(" ");

        for (String s : split) {
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) + 1);
            } else
                hashMap.put(s, 1);
        }

        System.out.println(hashMap);

        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue().equals(1)) {

                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
