package Assignment_More_On_Loops;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int ans = 0 , pow = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = str.length() - 1 ; i >= 0 ; i--)
        {
            if(str.charAt(i) == '1')
            {
                ans += Math.pow(2, pow);
            }
            pow++;
        }
        System.out.println(ans);
    }
}
