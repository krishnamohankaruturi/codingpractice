package sample;

public class Print1to100nums {
    public static void main(String[] args) {
        int n= 100;
        printNNumbers(n);
    }

    private static void printNNumbers(int n) {
        if(n > 0)
        {
            printNNumbers(n-1);
            System.out.print(n+" ");
        }
        return;


    }
}
