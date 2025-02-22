package practiceqs;

public class Palindrome {
    public static void main(String[] args) {
        String str = "mafdm";
        String rev = "";
        char[] charArray = str.toCharArray();
        for(int i = charArray.length-1; i>=0; i--)
        {
            rev += str.charAt(i);
        }
        if(str.equals(rev))
            System.out.println("Its palindrome");
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
