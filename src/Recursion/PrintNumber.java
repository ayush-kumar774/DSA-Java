package Recursion;

import java.util.Scanner;

public class PrintNumber {
    public static void printNumberReverse(int n)
    {
        if(n <= 0)
        {
            return;
        }
        System.out.print(n + " ");
        printNumberReverse(n - 1);

    }
    public static void printNumber(int n)
    {
        if(n <= 0)
        {
            return;
        }
        printNumber(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumber(n);
        System.out.println();
        printNumberReverse(n);
    }
}
