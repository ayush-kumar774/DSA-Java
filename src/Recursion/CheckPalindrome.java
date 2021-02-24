package Recursion;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean isPalindrome(String str, int index1, int index2)
    {
        if(index1 > index2 || index1 == index2)
        {
            if(str.charAt(index1) != str.charAt(index2)){
                return false;
            }
            return true;
        }
        return isPalindrome(str, index1 + 1, index2 - 1) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindrome(str, 0, str.length() - 1));
    }
}
