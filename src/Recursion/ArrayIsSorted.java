package Recursion;

import java.util.Scanner;

public class ArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = checkArray(arr, n, index);
        System.out.println(ans);
    }

    private static boolean checkArray(int[] arr, int n, int index) {
        if (n == 0 || n == 1) {
            return true;
        }
        if (index == n - 2) {
            return (arr[index] <= arr[index + 1]);
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        boolean smallOutput = checkArray(arr, n, index + 1);
        if (smallOutput) {
            return true;
        } else {
            return false;
        }
    }
}
