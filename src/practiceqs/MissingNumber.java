package practiceqs;

public class MissingNumber {
    public static void main(String[] args) {

        int[] a = {1, 2, 4, 5, 6};
        System.out.println(missingNum(a));

    }

    private static int missingNum(int[] a) {
        int n = a.length + 1;
        for (int i = 1; i <= n; i++) {
            boolean find = false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    find = true;
                    break;
                }
            }
            if (!find)
                return i;
        }
        return  -1;

    }
}
