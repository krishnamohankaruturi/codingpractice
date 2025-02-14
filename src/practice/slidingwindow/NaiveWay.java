package practice.slidingwindow;

public class NaiveWay {
    public static void main(String[] args) {
        System.out.println(computeMaxSubArraySum());
    }

    private static int computeMaxSubArraySum() {
        int[] arr = {3,4,5,2,};
        int k= 3;
        int maxSum = 0;
        for(int i= 0;i < arr.length-k;i++)
        {
            int sum = 0;
            for(int j= i; j< i+k;j++)
            {
                sum = sum+arr[j];
            }
            maxSum= Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
