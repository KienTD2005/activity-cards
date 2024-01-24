package org.sample.java.Algorithm;

public class FibonacciNumbers {
    public static void main(String[] args) {
        FibonacciNumbers fn = new FibonacciNumbers();

        for (int i = 1; i <= 55; i++) {
            System.out.println("fib (" + i + ") = " + fn.fib(i));
        }

    }

    private long fib(int n){
        if (n == 0)
        {
            return 0;
        }

        if (n == 1)
        {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
