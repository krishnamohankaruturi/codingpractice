package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramInsideStringUsingSlidingWindow {
    public static void main(String[] args) {
        String str = "cbaebabacd";
        String anagram = "acd";
        List<Integer> indices = findAnagrams(str, anagram);
        System.out.println("Anagram start indices: " + indices);
    }

    private static List<Integer> findAnagrams(String str, String anagram) {
        List<Integer> result = new ArrayList<>();
        if(str.length() < anagram.length()) return result;
        int analength = anagram.length();

        int[] charCountP = new int[26];
        int[] charCountWindow = new int[26];

        for(char c : anagram.toCharArray())
        {
            charCountP[c-'a']++;

        }
        for(int i = 0; i <analength; i++)
        {
            charCountWindow[str.charAt(i)-'a']++;
        }
        if(Arrays.equals(charCountP,charCountWindow))
        {
            result.add(0);
        }
        for(int i = analength; i < str.length(); i++)
        {
            charCountWindow[str.charAt(i)-'a']++;
            charCountWindow[str.charAt(i-analength)-'a']--;
            if(Arrays.equals(charCountP,charCountWindow))
            {
                result.add(i-analength+1);
            }

        }
        return result;
    }
}
