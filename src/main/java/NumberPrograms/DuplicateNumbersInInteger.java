package NumberPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbersInInteger {

    static int num = 1343556678;

    public static void main(String[] args) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        String str = Integer.toString(num);

        char[] ch = str.toCharArray();

        for (Character cha : ch) {
            if (hashMap.containsKey(cha)) {
                hashMap.put(cha, hashMap.get(cha) + 1);
            } else {
                hashMap.put(cha, 1);
            }
        }

        for (Map.Entry nu : hashMap.entrySet()) {

            System.out.println(nu.getKey() + " - " + nu.getValue());
        }
    }
}
