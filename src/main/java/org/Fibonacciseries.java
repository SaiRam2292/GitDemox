package org;

public class Fibonacciseries {

    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: " + a + ", " + b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}
