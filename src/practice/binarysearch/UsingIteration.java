package practice.binarysearch;

import java.util.Arrays;

public class UsingIteration {

    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 2, 1, 7, 92, 20, 0, 44};
        int target = 20;
        Arrays.sort(arr);
        //System.out.println(binaruSearching(target, arr));
        System.out.println(binarySearchingRecursion(target,0, arr.length-1, arr));

    }

    private static int binarySearchingRecursion(int target, int low, int high, int[] arr) {
        if (low > high)
            return -1;


        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchingRecursion(target, mid + 1, high, arr);
        } else {
            return binarySearchingRecursion(target, low, mid - 1, arr);
        }


    }

    private static int binaruSearching(int target, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
