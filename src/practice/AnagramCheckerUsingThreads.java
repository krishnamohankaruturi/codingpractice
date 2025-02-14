package practice;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AnagramCheckerUsingThreads {


    private  static class  FrequencyCounter implements Runnable
    {
        private  final String str;
        private final Map<Character,Integer> frequncyMap;

        private FrequencyCounter(String str, Map<Character, Integer> frequncyMap) {
            this.str = str;
            this.frequncyMap = frequncyMap;
        }

        @Override
        public void run() {
            for(Character ch : str.toCharArray())
            {
                frequncyMap.merge(ch,1, (v1,v2) -> v1+v2);
            }

        }
    }


    public static boolean areAnagrams(String str1, String str2) throws InterruptedException {
        if(str1.length() != str1.length())
          return  false;
        Map<Character,Integer> freqMap1 = new ConcurrentHashMap<>();
        Map<Character,Integer> freqMap2 = new ConcurrentHashMap<>();
        Thread t1 = new Thread(new FrequencyCounter(str1,freqMap1));
        Thread t2 = new Thread(new FrequencyCounter(str2,freqMap2));

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        return  freqMap1.equals(freqMap2);

    }

    public static void main(String[] args) throws InterruptedException {
        String str1 = "listen";
        String str2 = "sigent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
        }
    }
}
