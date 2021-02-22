package Recursion;

import java.util.Scanner;

public class MultiplicationOfTwoNumber {

    public static int multiplication(int m, int n)
    {
        if (m == 0 || n == 0)
        {
            return 0 ;
        }
        if (n == 1) {
            return  m ;
        }
        return m + multiplication(m, n - 1) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(multiplication(m, n));
    }
}
