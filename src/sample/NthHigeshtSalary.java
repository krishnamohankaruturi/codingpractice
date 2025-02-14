package sample;

import java.util.*;
import java.util.stream.Collectors;

public class NthHigeshtSalary {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("anil",10000);
        map.put("hari",20000);
        map.put("ahmed",15000);
        map.put("shreya",17000);
        map.put("krishna",16000);
        map.put("ramesh",16000);
        map.put("satish",10000);
        map.put("varun",15000);
        Map.Entry<String, Integer> stringIntegerEntry = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).skip(2).findFirst().get();

        System.out.println(stringIntegerEntry);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());


        list.sort(Comparator.comparing(Map.Entry<String,Integer>::getValue).thenComparing(Map.Entry<String,Integer>::getKey));

        System.out.println(list);



    }

}
