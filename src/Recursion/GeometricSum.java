package Recursion;

import java.util.Scanner;

public class GeometricSum {

    public static double geometricSum(int num)
    {
        if(num == 1)
        {
            return 1.5 ;
        }
        return (1.0/Math.pow(2,num) + geometricSum(num - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double ans = geometricSum(num);
        System.out.println(ans);
    }
}
