package Recursion;

import java.util.Scanner;

public class CheckNumberInArray {
    private static boolean checkNumber(int[] arr, int index, int target) {
        if (index == arr.length - 1) {
            if (arr[index] == target ) {
                return true ;
            }
            else {
                return false ;
            }
        }
        if (arr[index] == target)
        {
            return true;
        }
        return checkNumber(arr , index + 1 , target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int index = 0 ;
        System.out.println(checkNumber(arr, index, target));
    }

}
