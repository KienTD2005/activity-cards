package org.sample.java.Algorithm;

public class Driver {
    public static void main(String[] args) {
        FibonacciNumbers fn = new FibonacciNumbers();

            for (int i = 0; i <= 50; i++) {
                System.out.println("fib (" + i + ") = " + fn.fib(i));
            }
    }
}
