package ConditionalsAndLoops;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        long ans = 1 ;
        for (int i = 0 ; i < y; i++)
        {
            ans *= x;
        }
        System.out.println(ans);
    }
}
