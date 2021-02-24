package Recursion;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int index = 0 ;
        System.out.println(firstIndex(arr, index, x));
    }

    private static int firstIndex(int[] arr, int index, int x) {
        if (index == arr.length - 1) {
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
        return firstIndex(arr , index + 1 , x);
    }
}
