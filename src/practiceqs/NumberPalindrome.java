package practiceqs;

public class NumberPalindrome {
    public static void main(String[] args) {
        int num = 17621;
        int temp = num;
        int rev = 0;
        while(temp != 0)
        {
            rev = (rev*10) + temp%10;
            temp = temp/10;

        }
        if(rev == num)
            System.out.println("Is palindrome");
        else {
            System.out.println("not a plaindrome");
        }
    }
}
