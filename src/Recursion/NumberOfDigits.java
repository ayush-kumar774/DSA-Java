package Recursion;

import java.util.Scanner;

public class NumberOfDigits {

    private static int numberOfDigit(int n) {
        if (n == 0)
        {
            return 0 ;
        }
        return 1 + numberOfDigit(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(numberOfDigit(n));
    }

}
