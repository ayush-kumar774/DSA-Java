package Stack;

class StackEmptyException extends Exception
{
    private static final long serialVersionUID = 1L ;
}
class StackUsingArrays
{
    private int data[] ;

    private int top ;

    public StackUsingArrays() {
        data = new int[10] ;
        top = -1 ;
    }

    public StackUsingArrays(int capacity) {
        data = new int[capacity] ;
        top = -1 ;
    }

    public boolean isEmpty() {
        return (top == -1) ;
    }

    public int size() {
        return (top + 1) ;
    }

    public int top() throws StackEmptyException {
        if (size() == 0) {
            System.out.println("Stack is empty.");
            StackEmptyException e = new StackEmptyException();
            throw e ;
        }
        return data[top] ;
    }

    public void push(int val){
        if (size() == data.length) {
            doubleCapacity();
        }
        top++ ;
        data[top] = val ;
    }

    private void doubleCapacity() {
        int temp[] = data ;
        data = new int [2 * temp.length];
        for (int i = 0 ; i <= top ; i++) {
            data[i] = temp[i] ;
        }
    }

    public int pop() throws StackEmptyException {
        if (size() == 0) {
            System.out.println("Stack Underflow");
            StackEmptyException e = new StackEmptyException() ;
            throw e ;
        }
        int ans = data[top] ;
        top-- ;
        return ans;
    }

}

public class StackUsingArray {
    public static void main(String[] args) throws StackEmptyException {
        StackUsingArrays stack = new StackUsingArrays(1) ;
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int a = stack.top();
        for (int i = 1 ; i <= 5 ; i++) {
            try {
                System.out.println(stack.pop());
            }
            catch (StackEmptyException e) {

            }
        }
    }
}
