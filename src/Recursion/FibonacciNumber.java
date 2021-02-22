package Recursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(fib(n));
    }

    private static long fib(long n) {
        if (n == 0)
        {
            return 0 ;
        } else if(n == 1)
        {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
