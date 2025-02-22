package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
         int[] arr = {4,7,9,2,6,1,7,3,0,2};
         performInsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void performInsertionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j= i+1; j> 0; j--)
            {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j - 1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else {
                    break;
                }


            }

        }
    }
}
