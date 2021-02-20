package ConditionalsAndLoops;
import java.util.Scanner;

public class SumOfEvenOdd
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int odd = 0 ;
        int even = 0 ;
        for(int i = 0; i < number.length(); i++)
        {
            if((number.charAt(i) - 48 ) % 2 == 0) {
                even += (number.charAt(i) - 48);
            }
            else
            {
                odd += (number.charAt(i) - 48);
            }
        }
        System.out.println("Odd sum is "  + odd);
        System.out.println("Even sum is "  + even);
    }
}