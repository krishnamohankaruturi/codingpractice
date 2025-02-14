package practice;

public class PribtFirst10Nums {
    public static void main(String[] args) {
        printNnumbers(10);
    }

    private static void printNnumbers(int n) {
        if(n < 0)
         return;
        printNnumbers(n-1);
        System.out.println(n);
    }
}
