package bonus;

public class Fibonacci {
    public static void main(String[] args) {

    }

    public static int calculate(int n) {
        if (n <= 1) {
            return n;
        }

        int fib2 = 0;
        int fib1 = 1;
        int fib = 1;

        for (int i = 2; i < n; i++) {
            fib = fib2 + fib1;
            fib2 = fib1;
            fib1 = fib;
        }

        return fib;

    }
}
