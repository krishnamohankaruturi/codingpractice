package practice.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class FruitsInBasket {
    public static void main(String[] args) {
        System.out.println(maxFruitsInBasket());

    }

    private static int maxFruitsInBasket() {
        int[] fruits = {1,2,3,1,2,2};
        Map<Integer,Integer> fruitCount = new HashMap();
        int maxCount = 0;
        int left = 0;
        for(int right=0; right< fruits.length;right++)
        {
            int currentFruit = fruits[right];
            fruitCount.put(fruits[right],fruitCount.getOrDefault(currentFruit,0)+1);
            while (fruitCount.size() > 2)
            {
                int fruitToRemove = fruits[left];
                fruitCount.put(fruitToRemove,fruitCount.get(fruitToRemove)-1);
                if(fruitCount.get(fruitToRemove) == 0)
                    fruitCount.remove(fruitToRemove);
                left++;
            }
            maxCount = Math.max(maxCount,right-left+1);

        }
        return maxCount;
    }
}
