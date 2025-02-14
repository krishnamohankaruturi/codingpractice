package practice;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "mdfdam";
        if (checkPalindrome(str)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }

    private static boolean checkPalindrome(String str) {
        char[] charArray = str.toCharArray();
        int firstChar = 0;
        int lastChar = str.length() - 1;
        while (firstChar < lastChar) {
            if (charArray[firstChar] != charArray[lastChar])
                return false;
            firstChar++;
            lastChar--;
        }
        return true;
    }
}
