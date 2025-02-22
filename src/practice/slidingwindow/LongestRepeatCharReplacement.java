package practice.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatCharReplacement {
    public static void main(String[] args) {
        String str = "AABBA";
        System.out.println(characterReplacement(str,1));
    }

    private static int characterReplacement(String str, int k) {
        int left = 0;
        int maxLen = 0;
        int maxRepeatCount = 0;
        int len = str.length();
        Map<Character, Integer> map1 = new HashMap<>();
        for(int right=0; right < len; right++)
        {
            char cur = str.charAt(right);
            map1.put(cur,map1.getOrDefault(cur,0)+1);
            maxRepeatCount = Math.max(maxRepeatCount,map1.get(cur));
            int nonrepeat = (right-left+1)-maxRepeatCount;
            if(nonrepeat > k)
            {
                map1.put(str.charAt(left), map1.get(str.charAt(left)-1));
                left++;

            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
