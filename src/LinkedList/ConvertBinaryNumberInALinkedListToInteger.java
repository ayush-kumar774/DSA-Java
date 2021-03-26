package LinkedList;

import java.util.ArrayList;

import static LinkedList.LinkedList.takeInput;

public class ConvertBinaryNumberInALinkedListToInteger {
    public static int getDecimalValue(Node head) {
        int ans = 0 ;
        ArrayList<Integer> arr = new ArrayList<>() ;
        while (head != null) {
            arr.add(head.data);
            head = head.next;
        }
        int power = 0 ;
        for (int i = arr.size() - 1 ; i >= 0 ; i--) {
            if (arr.get(i) == 1) {
                ans += Math.pow(2, power);
            }
            power++ ;
        }
        return ans;
    }
    public static void main(String[] args) {
        Node head = takeInput();
        int ans = getDecimalValue(head) ;
        System.out.println(ans);
    }
}
