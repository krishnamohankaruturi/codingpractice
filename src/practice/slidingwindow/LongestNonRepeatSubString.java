package practice.slidingwindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestNonRepeatSubString {
    public static void main(String[] args) {
        String input = "pwwkew";
        int[] result = longestSubstringLen(input);
        System.out.println("start index :"+ result[0]);
        System.out.println("ens index :"+ result[1]);
    }

    private static int[] longestSubstringLen(String str) {
        Set<Integer> list = new HashSet<>();
        Set<Character> uniqueCharSet = new HashSet<>();
        int i=0,j=0,max=0;
        int startindex = 0, endindex= 0;
        while (j < str.length())
        {
            if(!uniqueCharSet.contains(str.charAt(j)))
            {
              uniqueCharSet.add(str.charAt(j));
              if(uniqueCharSet.size() > max) {
                  max = uniqueCharSet.size();
                  startindex=i;
                  endindex=j;
              }
              j++;
            }else {
                uniqueCharSet.remove(str.charAt(i));
                i++;
            }
        }
        return new int[]{startindex,endindex,max};
    }

}
