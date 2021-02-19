package QuestionToPractice;
import java.util.Arrays;
import java.util.Scanner;

public class ChocolateCartonDistributionProblem {

    public  static int minDifference(int arr[], int n, int m)
    {
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int toCheck = n - m ;
        for (int i = 0 ; i <= toCheck ; i++)
        {
            min = Math.min(min, (arr[i + (m - 1)] - arr[i])) ;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int ans = minDifference(arr, n, m);
        System.out.println(ans);
    }
}
