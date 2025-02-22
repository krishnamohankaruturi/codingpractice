package practiceqs;

public class TwoStringsAnagram {
    public static void main(String[] args) {
        String input1 = "silent";
        String input2 = "lisken";
        System.out.println(areAnagrams1(input1,input2));
    }

    private static boolean areAnagrams1(String input1, String input2) {
        int max = 26;
        int[] frq = new int[max];
        for(int i = 0; i < input1.length() ; i++)
        {
            frq[input1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < input2.length(); i++)
        {
            frq[input2.charAt(i) -'a']--;
        }
        for(int count : frq)
        {
            if(count != 0)
                return  false;
        }
        return true;
    }
}
