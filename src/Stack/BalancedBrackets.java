package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('(', 1);
        mp.put(')', 1);
        mp.put('{', 2);
        mp.put('}', 2);
        mp.put('[', 3);
        mp.put(']', 3);
        for (int j = 0 ; j < n ; j++)
        {
            Stack<Integer> stack = new Stack<>();
            String str = sc.next();
            boolean ans = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                    stack.push(mp.get(str.charAt(i)));
                } else {
                    if (stack.size() == 0 || (stack.pop() != mp.get(str.charAt(i)))) {
                        ans = false;
                        break;
                    }
                }
            }
            if (ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
