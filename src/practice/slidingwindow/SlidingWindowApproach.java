package practice.slidingwindow;

public class SlidingWindowApproach {
    public static void main(String[] args) {
        System.out.println(maxSum());


    }

    private static int maxSum() {
        int[] arr = {2,4,5,7,9,8};
        int k= 3;
        int maxSum = 0, windoSum = 0;
        for(int i = 0; i< arr.length-k;i++)
        {
            windoSum += arr[i];
        }
        maxSum=windoSum;

        for(int i=k; i < arr.length; i++)
        {
            windoSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum,windoSum);
        }

        return maxSum;
    }


}
