package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {3, 9, 4, 8, 2, 6, 4, 1, 7, 9, 2};
        //performBubbleSort(a);
        performBubbleSortUsingRecursion(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void performBubbleSortUsingRecursion(int[] a,int size)
    {
        if(size==0)
            return;

        for (int j = 0; j < size-1; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
        performBubbleSortUsingRecursion(a,size-1);

    }

    private static void performBubbleSort(int[] a) {
        int flag = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                flag=1;
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if(flag == 0)
                return;
        }
    }
}
