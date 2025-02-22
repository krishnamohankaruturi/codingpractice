package sorting.practice;

import java.util.Arrays;

public class SortByFreqBruteForce {

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 6, 1, 4, 4, 6, 3, 3, 3, 3};

        // Step 1: Create a frequency array
        int n = arr.length;
        int[][] freqArr = new int[n][2]; // [number, frequency]

        // Fill freqArr with unique numbers and their frequencies
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (freqArr[j][0] == arr[i]) {
                    freqArr[j][1]++; // Increase frequency count
                    found = true;
                    break;
                }
            }
            if (!found) {
                freqArr[uniqueCount][0] = arr[i];
                freqArr[uniqueCount][1] = 1;
                uniqueCount++;
            }
        }

        // Step 2: Sort array based on frequency (descending) and value (ascending)
        Arrays.sort(freqArr, 0, uniqueCount, (a, b) -> (b[1] != a[1]) ? b[1] - a[1] : a[0] - b[0]);

        // Step 3: Construct the sorted result
        int[] sortedArr = new int[n];
        int index = 0;
        for (int i = 0; i < uniqueCount; i++) {
            for (int j = 0; j < freqArr[i][1]; j++) {
                sortedArr[index++] = freqArr[i][0];
            }
        }

        // Print sorted array
        System.out.println(Arrays.toString(sortedArr));
    }
}
