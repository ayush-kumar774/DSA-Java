package Recursion;

import java.util.Scanner;

public class BinarySearch {

    public static int search(int arr[], int start, int end, int x) {
        if (end >= start) {

            int mid = start + (end - start) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return search(arr, start, mid - 1, x);

            return search(arr, mid + 1, end, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(search(arr, 0, arr.length - 1, target));
    }
}
