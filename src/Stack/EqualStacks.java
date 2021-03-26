package Stack;

import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n1 = sc.nextInt() ;
        int n2 = sc.nextInt() ;
        int n3 = sc.nextInt() ;
        int arr1 [] = new int[n1] ;
        int arr2 [] = new int[n2] ;
        int arr3 [] = new int[n3] ;
        for (int i = 0 ; i < n1 ; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n2 ; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n3 ; i++) {
            arr3[i] = sc.nextInt();
        }
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        int sum1 = 0 , sum2 = 0 , sum3 = 0 ;
        for (int i = n1 - 1 ; i >= 0 ; i--) {
            sum1 += arr1[i] ;
            s1.push(arr1[i]) ;
        }
        for (int i = n2 - 1 ; i >= 0 ; i--) {
            sum2 += arr2[i] ;
            s2.push(arr2[i]) ;
        }
        for (int i = n3 - 1 ; i >= 0 ; i--) {
            sum3 += arr3[i] ;
            s3.push(arr3[i]) ;
        }
        if (sum1 == sum2 && sum2 == sum3) {
            System.out.println(sum1);
        }
        else {
            while(!(s1.empty() && s2.empty() && s3.empty())) {
                if (sum1 <= sum2 && sum2 <= sum3) {
                    while (sum2 > sum1) {
                        sum2 -= s2.pop();
                        if (sum1 == sum2 && sum2 == sum3) {
                            System.out.println(sum1);
                            return;
                        }
                    }
                    while (sum3 > sum1) {
                        sum3 -= s3.pop();
                        if (sum1 == sum2 && sum2 == sum3) {
                            System.out.println(sum1);
                            return;
                        }
                    }
                }
                if (sum2 <= sum3 && sum1 <= sum3) {
                    while (sum1 > sum2) {
                        sum1 -= s1.pop();
                        if (sum1 == sum2 && sum2 == sum3) {
                            System.out.println(sum1);
                            return;
                        }
                    }
                    while (sum3 > sum1) {
                        sum3 -= s3.pop();
                        if (sum1 == sum2 && sum2 == sum3) {
                            System.out.println(sum1);
                            return;
                        }
                    }
                }
                if (sum3 <= sum2 && sum3 <= sum1) {
                    while (sum1 > sum3) {
                        sum1 -= s1.pop();
                        if (sum1 == sum2 && sum2 == sum3) {
                            System.out.println(sum1);
                            return;
                        }
                    }
                    while (sum2 > sum3) {
                        sum2 -= s2.pop();
                        if (sum1 == sum2 && sum2 == sum3) {
                            System.out.println(sum1);
                            return;
                        }
                    }
                }
            }
            System.out.println("0");
        }
    }
}

