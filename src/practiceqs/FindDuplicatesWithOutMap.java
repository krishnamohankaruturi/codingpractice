package practiceqs;

import associations.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicatesWithOutMap {
    public static void main(String[] args) {
       int[] arr = {2,2,4,2,6,4,34,66,34};
        Arrays.sort(arr);
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] == arr[i+1])
            {
                if(index == 0 || temp[index-1] != arr[i])
                {
                    temp[index++] = arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(temp));

    }
}
