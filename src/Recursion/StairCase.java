package Recursion;

import java.util.Scanner;

public class StairCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberOfSteps(n));
    }

    private static int numberOfSteps(int n) {
        if (n == 1 || n == 0)
        {
            return 1 ;
        }
        else if (n == 2) {
            return 2;
        }
        else return numberOfSteps(n - 3) + numberOfSteps(n - 2) + numberOfSteps(n - 1);
    }
}
