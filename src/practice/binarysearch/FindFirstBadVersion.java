package practice.binarysearch;

public class FindFirstBadVersion {
    public static void main(String[] args) {
        findFisrtBadVetsion(5);
    }

    private static int findFisrtBadVetsion(int n) {
        int ans = -1;
        int start = 1;
        int end = n;


        while (start <= end) {
            int mid = (start + end) / 2;
            if (isBadversion(mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        return ans;

    }

    private static boolean isBadversion(int mid) {
        return  true;
    }
}
