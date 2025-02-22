package practiceqs;

import java.util.HashMap;
import java.util.Map;

public class TwoStringsAnagrams {
    public static void main(String[] args) {
        String input1 = "listen";
        String input2 = "silekt";
        System.out.println(areAnagram(input1, input2));

    }

    private static boolean areAnagram(String input1, String input2) {
        char[] charArray1 = input1.toCharArray();
        char[] charArray2 = input2.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : charArray1)
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        for (char ch : charArray2)
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        for (Map.Entry<Character, Integer> ch : map.entrySet()) {
            if (ch.getValue() != 0)
                return false;
        }
        return true;
    }
}
