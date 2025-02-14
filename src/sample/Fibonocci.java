package sample;

public class Fibonocci {
    public static void main(String[] args) {
        int first = 0;
        int second= 1;
        int third;
        int n= 10;
        System.out.print(first+" "+second);
        for(int i =2; i< n; i++)
        {
            third= first+second;
            first=second;
            second=third;
            System.out.print(" "+third);
        }
    }
}
