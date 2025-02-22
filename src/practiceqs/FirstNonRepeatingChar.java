package practiceqs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swwwissboookddg";
        char[] charArray = str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch : charArray)
            map.put(ch,map.getOrDefault(ch, 0)+1);
        for(Map.Entry<Character,Integer> e: map.entrySet())
        {
            if(e.getValue() == 1) {
                System.out.println(e.getKey());
                return;
            }

        }


    }
}
