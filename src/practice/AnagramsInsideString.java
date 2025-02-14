package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AnagramsInsideString {
    public static void main(String[] args) {
        String str = "cbaebabacd";
        String anagram = "dac";
        char[] charArray1 = anagram.toCharArray();
        Arrays.sort(charArray1);
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= str.length() - anagram.length(); i++) {
            String substring = str.substring(i, i + anagram.length());
            char[] charArray = substring.toCharArray();
            Arrays.sort(charArray);
            if (Arrays.equals(charArray1, charArray)) {
                list.add(substring);
            }
        }
        System.out.println(list);
    }

}

