package Recursion;

import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigits(String str, int index)
    {
        if (index == str.length() - 1)
        {
            return ((int)str.charAt(index) - 48 );
        }
        else {
            return ((int) str.charAt(index) - 48) + sumOfDigits(str, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int ans = sumOfDigits(num, 0);
        System.out.print(ans);
    }
}
