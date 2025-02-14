package practice.miscellinious;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);

        set1.retainAll(set2);
        //set1.removeAll(set2);
        System.out.println("Intersection : "+set1);

        Set<Integer> collect = set1.stream().filter(set2::contains).collect(Collectors.toSet());
        System.out.println("Using streams "+collect);


    }
}
