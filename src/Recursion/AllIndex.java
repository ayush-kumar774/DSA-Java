package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class AllIndex {
    static ArrayList<Integer> ans = new ArrayList<>();

    public static void allIndex(int arr[], int index, int x)
    {
        if (index == arr.length - 1) {
            if (arr[index] == x ) {
                ans.add(index) ;
                return;
            }
            else {
                return ;
            }
        }
        if (arr[index] == x)
        {
            ans.add(index) ;
        }
        allIndex(arr , index + 1 , x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        allIndex(arr, 0, x);
        for(int res : ans)
        {
            System.out.print(res + " ");
        }
    }
}
