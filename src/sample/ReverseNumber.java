package sample;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int remainder, rev = 0;
        while(num > 0)
        {
            remainder = num%10;
            rev = (rev * 10) + remainder;
            num = num / 10;

        }

        System.out.println(rev);
    }
}
