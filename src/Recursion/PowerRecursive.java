package Recursion;

import java.util.Scanner;

public class PowerRecursive {

    public static long power(long x, long y)
    {
        if(y == 0) {
            return 1 ;
        }
        if (y == 1) {
            return x ;
        }
        return x* power(x, y -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        System.out.println(power(x, y));
    }
}
