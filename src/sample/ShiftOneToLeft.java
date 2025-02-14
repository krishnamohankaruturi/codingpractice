package sample;

import java.util.Arrays;

public class ShiftOneToLeft {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3,4,1,6,7,1,5,1};
        shiftOneToLeft(arr);
    }

    private static void shiftOneToLeft(int[] arr) {
        int i= 0;
        int k = 0;
        while (k < arr.length)
        {
            if(arr[k] == 1)
            {
                int val = arr[i];
                arr[i] = arr[k];
                arr[k] = val;
                i++;
            }
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
