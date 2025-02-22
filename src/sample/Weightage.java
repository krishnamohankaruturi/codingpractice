package sample;

public class Weightage {
    public static void main(String[] args) {
        System.out.println(getWeightage("abc"));
    }

    private static int getWeightage(String abc) {
        String str = "bcd";
        char[] charArray = str.toCharArray();
        int sum = 0;
        for(int i = 0; i < charArray.length; i++)
            sum += (charArray[i] - 'a') + 1;
        return sum;
    }
}
