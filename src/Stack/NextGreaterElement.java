package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int arr1[] )
    {
        Stack<Integer> stack = new Stack<>() ;
        int nge[] = new int[arr1.length] ;
        for (int i = arr1.length - 1 ; i >= 0 ; i--)
        {
            if (!stack.empty())
            {
                while (!stack.empty() && stack.peek() <= arr1[i])
                {
                    stack.pop();
                }
            }
            nge[i] = stack.empty() ? -1 : stack.peek() ;
            stack.push(arr1[i]) ;
        }
        return nge ;
    }
    public static void main(String[] args) {
        int arr[] = {4, 1, 2} ;
        arr = nextGreaterElement(arr) ;
        for (var x : arr) {
            System.out.print(x + " ");
        }
    }
}
