package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeat {
    public static void main(String[] args) {
        String str = "aaabbbcccdeef";
        char[] c = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<c.length;i++)
        {
           if(map.containsKey(c[i]))
           {
               map.put(c[i],map.get(c[i])+1);
           }
           else {
               map.put(c[i],1);
           }
        }
        for(Map.Entry<Character,Integer> e: map.entrySet())
        {
            if(e.getValue()==1)
            {
                System.out.println(e.getKey());
                return;
            }

        }

    }
}
