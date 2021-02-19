package QuestionToPractice;

import java.util.Scanner;

public class MaximumSubarray {
    public static int maxSum(int arr[])
    {
        int max1 = Integer.MIN_VALUE , max2 = 0 ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            max2 += arr[i] ;

            if(max2 > max1)
            {
                max1 = max2 ;
            }

            if (max2 < 0)
            {
                max2 = 0 ;
            }

        }
        return max1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = maxSum(arr);
        System.out.println(ans);
    }
}
