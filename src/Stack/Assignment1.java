package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s1 = new Stack<>() ;
        Stack<Integer> s2 = new Stack<>() ;
        int n = sc.nextInt() ;
        int x ;
        for(int i = 0 ; i < n ; i++) {
            x = sc.nextInt() ;
            s1.push(x) ;
        }
        while (!s1.empty()) {
            s2.push(s1.peek());
            s1.pop();
        }

        for (var y : s2) {
            System.out.print(y + " ") ;
        }
    }
}
