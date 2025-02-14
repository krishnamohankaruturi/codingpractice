package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String str = "java concept of the day";
        char[] charArray = str.replaceAll("\\s+", "").toCharArray();
        Map<Character,Integer> map = new ConcurrentHashMap<>();
        for(Character c: charArray){
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> e : map.entrySet())
        {
            if((e.getValue() == 1))
            {
                map.remove(e.getKey());

            }

        }
        int mincount = Integer.MAX_VALUE;
        char minchar = 'a';
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+": "+e.getValue());

            if(e.getValue() < mincount){
                mincount = e.getValue();
                minchar = e.getKey();
            }

        }
        System.out.println(minchar+"----"+mincount);

    }
}
