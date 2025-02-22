package practice.binarysearch;

public class SmallestThanTarget
{
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'd';
        System.out.println(smallestThanTarget(arr, target));
    }

    private static char smallestThanTarget(char[] letters, char target) {
        int n= letters.length;
        int ans = 0;
        if(target > letters[n-1] || target < letters[0])
            return letters[0];
        int low = 0;
        int high = n-1;
        while (low <= high)
        {
            int mid = low +(high-low)/2;
            if(letters[mid] <= target)
            {
                low = mid+1;
            }
            else {
                ans= mid;
                high = mid -1;
            }
        }
        return  letters[ans];

    }
}
