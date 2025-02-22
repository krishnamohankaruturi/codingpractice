package practiceqs;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int[]  arr = {2,5,7,88,4,1,55};
        int smallest = arr[0];
        int largest = arr[0];
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] < smallest)
                smallest=arr[i];
            else if(arr[i] > largest)
                largest = arr[i];
        }
        System.out.println("smallest number -->" + smallest +"   "+"largest Number" + largest);
    }
}
