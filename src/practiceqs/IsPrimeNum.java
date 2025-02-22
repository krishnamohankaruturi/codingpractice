package practiceqs;

public class IsPrimeNum {
    public static void main(String[] args) {
        int input = 7;
        System.out.println(isPrime(9));

    }

    private static boolean isPrime(int input) {

        for(int i = 2; i< input; i++)
        {
            if(input%i == 0)
                return false;
        }
        return true;
    }
}
