package practiceqs;

public class Fibonocci {
    public static void main(String[] args) {
        int n = 100;
        int first = 0, sec= 1;
        for(int i = 0; first < n; i++)
        {
            System.out.print(first+" ");
            int third = first + sec;
            first = sec;
            sec = third;
        }
    }
}
