package practice.binarysearch;

public class SquareRoot {


    static long floorSqrt(long x) {

        if (x < 2)
            return x;
        long start = 1;
        long end = x / 2;
        long ans = 0;
        while (start <= end) {
            long mid = (start + end) / 2;
            long square = mid * mid;
            if (square == x)
                return mid;
            else if (square < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(floorSqrt(82));

    }
}
