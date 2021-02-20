package Assignment_More_On_Loops;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int choice = sc.nextInt();
        if(choice == 1)
        {
            long ans = 0;
            ans = ( (num * (num + 1)) / 2 ) ;
            System.out.println("Sum of first " + num + " natural number is " + ans);
        }
        else if (choice == 2)
        {
            long ans = 1;
            for(long i = 1; i < num ; i++)
            {
                ans *= i ;
            }
            System.out.println("Factorial of " + num + " is " + ans);
        }
        else
        {
            System.out.println("-1");
        }
    }
}
