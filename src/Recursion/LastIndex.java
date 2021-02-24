package Recursion;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(lastIndex(arr, arr.length - 1, x));
    }

    private static int lastIndex(int[] arr, int index, int x) {
        if (index == 0) {
            if (arr[index] == x ) {
                return index ;
            }
            else {
                return -1 ;
            }
        }
        if (arr[index] == x)
        {
            return index;
        }
        return lastIndex(arr , index - 1 , x);
    }
}
