package QuestionToPractice;
import java.util.Scanner;
public class GainRainWater {

    public static int rainWater(int arr[], int n)
    {
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        int max = arr[0];
        for(int i = 0 ; i < n ; i++)
        {
            if (arr[i] > max)
            {
                leftMax[i] = arr[i] ;
                max = arr[i] ;
            }
            else
            {
                leftMax[i] = max ;
            }
        }
        max = arr[n -1];
        for(int i = n - 1 ; i >= 0 ; i--)
        {
            if (arr[i] > max)
            {
                rightMax[i] = arr[i] ;
                max = arr[i] ;
            }
            else
            {
                rightMax[i] = max ;
            }
        }
        int totalWater = 0 ;
        for(int i = 0 ; i < n ; i++)
        {
            totalWater += Math.min(leftMax[i], rightMax[i]) - arr[i] ;
        }
        return  totalWater ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n] ;
        for(int i = 0 ; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = rainWater(arr, n);
        System.out.println(ans);
    }
}
