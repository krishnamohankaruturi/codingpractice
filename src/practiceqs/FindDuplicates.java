package practiceqs;

import associations.A;

import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,1};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length; i++)
            map.put(arr[i],map.getOrDefault(map.get(arr[i]),0)+1);
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> i: map.entrySet())
        {
           if(i.getValue()> 1)
               list.add(i.getKey());
        }
        System.out.println(list);
    }
}
