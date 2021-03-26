package Stack;

import java.util.Stack;

public  class RemoveAllAdjacentDuplicatesInString {
    public static String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        stack.push(S.charAt(0));
        for(int i = 1 ; i < S.length() ; i++) {
            if (stack.size() > 0) {
                if (stack.peek() != S.charAt(i)) {
                    stack.push(S.charAt(i)) ;
                }
                else {
                    stack.pop() ;
                }
            }
            else {
                stack.push(S.charAt(i));
            }

        }
        String ans = "" ;
        for (var x : stack) {
            ans += x ;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str =  "abbaca";
        System.out.println(removeDuplicates(str));
    }
}
