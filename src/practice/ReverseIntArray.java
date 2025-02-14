package practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntArray {
    public static void main(String[] args) {
        int[] a = {3,6,8,55,8,2};
        int[] array = IntStream.rangeClosed(1, a.length).map(x -> a[a.length - x]).toArray();
        System.out.println(Arrays.toString(array));

    }
}
