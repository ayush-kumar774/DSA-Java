package Stack;

import java.util.Stack;

public class BaseballGame {
    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>() ;
        for (int i = 0 ; i < ops.length ; i++)
        {
            if (ops[i] != "C" && ops[i] != "D" && ops[i] != "+")
            {
                int a = Integer.parseInt(ops[i]);
                stack.push(a) ;
            }
            else if (ops[i] == "C")
            {
                if (!stack.empty())
                {
                    stack.pop();
                }
            }
            else if (ops[i] == "D")
            {
                int d = stack.pop() * 2 ;
                stack.push(d/2) ;
                stack.push(d) ;
            }
            else if (ops[i] == "+")
            {
                int a = stack.pop() ;
                int b = stack.pop() ;
                stack.push(b) ;
                stack.push(a) ;
                stack.push(a + b) ;
            }
        }
        int res = 0 ;
        for (var x: stack) {
            res += x ;
        }
        return res ;
    }
    public static void main(String[] args) {
        String ops[] = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
    }
}
