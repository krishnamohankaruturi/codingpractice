package practice.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestDuplicate
{
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 1, 3, 5, 4};

        Integer i = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .sorted((o1, o2) -> Integer.compare(o1.getKey(), o2.getKey()))
                .skip(1)
                .map(x -> x.getKey())
                .findFirst().get();
        System.out.println(i);

    }
}
