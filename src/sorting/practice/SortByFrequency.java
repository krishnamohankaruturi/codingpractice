package sorting.practice;

import java.util.*;

public class SortByFrequency {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 6, -1, 99999, 5, 8, 8, 8};
        sortByFreq(arr);
    }

    private static void sortByFreq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Integer> sortedList = new ArrayList<>();
        for (int num : arr) {
            sortedList.add(num);
        }

        Collections.sort(sortedList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int freqCompare = map.get(o2) - map.get(o1);
                if (freqCompare != 0) {
                    return freqCompare;
                } else {
                    return o1 - o2;
                }

            }
        });





        /*sortedList.sort((a, b) -> {
            int freqCompare = map.get(b) - map.get(a);
            return (freqCompare != 0) ? freqCompare : a - b;
        });
*/
        System.out.println(sortedList);


    }
}
