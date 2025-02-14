package practice;
import  java.util.*;

public class AverageOfNums {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        double average = numbers.stream()
                .reduce(0, Integer::sum) / (double) numbers.size();
        System.out.println(average);

    }
}
