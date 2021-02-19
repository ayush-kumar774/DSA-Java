package QuestionToPractice;

import java.util.Arrays;
import java.util.Scanner;

public class WarmReception {

    public static int numberOfChairs(int arr[], int dept[])
    {
        int n = arr.length;

        int counter = 0 ;

        Arrays.sort(arr);
        Arrays.sort(dept);

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0; j < n ; j++)
            {

                if(dept[i] < arr[j])
                {
                    arr[j] = Integer.MIN_VALUE;
                    counter++;
                    break;
                }
            }
        }

        return  (n - counter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int dept[] = new int[n];
        for(int i = 0 ; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n; i++)
        {
            dept[i] = sc.nextInt();
        }
        int ans = numberOfChairs(arr, dept);
        System.out.println(ans);
    }
}
