package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,6,8,3,6,1,9,0,4};
        int l = 0;
        int r = arr.length-1;
        mergeSort(arr,l,r);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if(l>=r)
         return;
        int mid = l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int[] temp = new int[r-l+1];
        int l1= l;
        int r1 = mid+1;
        int index= 0;
        while (l1<=mid && r1<=r)
        {
            if(arr[l1] < arr[r1])
            {
                temp[index++] = arr[l1++];
            }
            else {
                temp[index++] = arr[r1++];
            }
        }
        while (l1 <= mid)
        {
            temp[index++] = arr[l1++];
        }
        while (r1 <= r)
        {
            temp[index++] = arr[r1++];
        }
        for(int i=0; i< temp.length;i++)
        {
            arr[i+l] = temp[i];
        }
    }
}
