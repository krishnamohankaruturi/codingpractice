package sample;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AvergeofNums {
    public static void main(String[] args) {
        Double collect = Stream.of(1, 4, 6, 3, 5, 7).collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(collect);
        //max value

        Optional<Integer> reduce = Stream.of(1, 4, 6, 3, 5, 7).reduce(Integer::min);
        System.out.println(reduce.get());
    }
}
