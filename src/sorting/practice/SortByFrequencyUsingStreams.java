package sorting.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortByFrequencyUsingStreams {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 6, -1, 99999, 5, 8, 8, 8};

        Map<Integer, Long> collect = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Integer> sortedList = Arrays.stream(arr).boxed()
                .sorted(Comparator
                        .comparingLong(num -> - collect.get(num))
                        .thenComparingInt(num -> (int) num))
                .collect(Collectors.toList());

        System.out.println(sortedList);

    }
}
