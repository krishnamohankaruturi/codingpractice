package sample;

import java.io.PrintStream;
import java.util.Arrays;

public class SwapWithOut3Variable {
    public static void main(String[] args) {
        int[] arr = {23,55,66,32,88,9,1};

        int i = 1, j= 3;

        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];

        System.out.println(Arrays.toString(arr));


    }
}
