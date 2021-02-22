package Recursion;

import java.util.Scanner;

public class CountZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int index = 0 ;
        System.out.println(countZeroes(str, str.length(), index));
    }

    private static long countZeroes(String str, int n, int index) {
        if(index == n - 1)
        {
            if(str.charAt(index) != '0') {
                return 0 ;
            }
            else
            {
                return 1 ;
            }
        }
        if (str.charAt(index) == '0')
        {
            return  1 + countZeroes(str, n, index + 1);
        }
        else
        {
            return 0 + countZeroes(str, n, index + 1);
        }
    }
}
