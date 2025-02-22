package practiceqs;



public class PrintNPrimeNumbers {
    public static void main(String[] args) {
        int n= 20;
        for(int i = 1; i <= n; i++)
        {
           if(isPrimeNum(i))
               System.out.print(i+ " ");
        }
    }

    private static boolean isPrimeNum(int input) {
        for(int i = 2; i < input; i++ )
        {
            if(input%i == 0)
                return  false;
        }
        return true;
    }
}
