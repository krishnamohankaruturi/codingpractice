package practice;

import java.util.*;

public class FirstNonRepeatUsingSet {
    public static void main(String[] args) {
        String str = "aaabdbbcccdeef";
        char[] charArray = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for(char c: charArray)
        {
            set.add(c);
        }
        Iterator<Character> iterator = set.iterator();
        if(iterator.hasNext())
        {
            Character next = iterator.next();
            System.out.println(next);

        }

    }
}
