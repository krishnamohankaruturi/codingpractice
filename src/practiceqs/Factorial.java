package practiceqs;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        while (num > 0) {
            fact = fact * num;
            num--;
        }
        System.out.println(fact);
        int fact2 = factorial(5);
        System.out.println("using rec" + fact2);
    }


    static int factorial(int input) {
        if (input == 0 || input == 1)
            return 1;

        return input * factorial(input - 1);

    }
}
