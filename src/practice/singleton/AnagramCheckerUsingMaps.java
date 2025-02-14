package practice.singleton;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheckerUsingMaps {

    public static void main(String[] args) {

        String str1 = "aabb";
        String str2 = "abbb";

        if (areAnagrams2(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
        }


    }

    private static boolean areAnagrams2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Anagrams must have the same length
        }
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        for(char ch : str2.toCharArray())
        {
            if(!charCountMap.containsKey(ch))
            {
                return  false;

            }
            charCountMap.put(ch, charCountMap.get(ch)-1);
            if(charCountMap.get(ch) == 0)
            {
                charCountMap.remove(ch);
            }
        }
        return  charCountMap.isEmpty();

    }
}
