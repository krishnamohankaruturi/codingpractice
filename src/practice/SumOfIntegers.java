package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfIntegers
{
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> reduce = numbers.stream().filter(x -> x%2 == 0).reduce(Integer::sum);
        System.out.println(reduce.get());
    }
}
