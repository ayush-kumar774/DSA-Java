package Recursion;

import java.util.Scanner;

public class CheckString {

    public static boolean checkString(String str, int index)
    {
        if(index == str.length() - 1)
        {
            if( (str.charAt(index) == 'b' && str.charAt(index - 1) == 'b' && str.charAt(index - 2) == 'a')) {
                return true;
            }
            else if (str.charAt(index) == 'a') {
                return true;
            }
            else {
                return false;
            }
        }
        if (str.charAt(0) != 'a') {
            return  false;
        }
        if (str.charAt(index) == 'a')
        {
            if (str.charAt(index + 1) == 'a' || (str.charAt(index + 1) == 'b' && str.charAt(index + 2) == 'b') )
            {
                return true;
            }
            else {
                return false;
            }
        }
        if (str.charAt(index) == 'b' && str.charAt(index + 1) == 'b')
        {
            if (index + 1 == str.length() - 1 || str.charAt(index + 2) == 'a') {
                return true;
            }
            else
                return false ;
        }
        return checkString(str, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(checkString(str,0));
        //abbabbabbabbaaaabbb
    }
}
