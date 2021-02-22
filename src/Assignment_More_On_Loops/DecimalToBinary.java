package Assignment_More_On_Loops;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("0");
        }
        else
        {
            String ans = "" ;
            while (n > 0)
            {
                if(n % 2 == 0) {
                    ans += '0';
                }
                else {
                    ans += '1';
                }
                n /= 2 ;
            }
            for(int j = ans.length() - 1 ; j >= 0 ; j--)
            {
                System.out.print(ans.charAt(j));
            }
        }
    }
}
