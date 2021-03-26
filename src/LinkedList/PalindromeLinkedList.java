package LinkedList;

import java.util.ArrayList;
import java.util.*;

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head)
    {
        ArrayList<Integer> data = new ArrayList<>() ;
        while (head != null) {
            data.add(head.val) ;
            head = head.next ;
        }
        int n = data.size();
        boolean flag = true ;
        for (int i = 0 ; i < n / 2 && n != 0 ; i++) {
            if (data.get(i) != data.get(n - i - 1)) {
                flag = false ;
                break ;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        ListNode head = takeInput2() ;
        System.out.println(isPalindrome(head));
    }

    public static ListNode takeInput2()
    {
        ListNode head = null;
        ListNode tail = null;

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data  != -1)
        {
            ListNode newNode = new ListNode(data);
            if(head == null) {
                head = newNode ;
            }
            else {
                tail.next = newNode ;
            }
            tail = newNode ;
            data = sc.nextInt();
        }

        return head;
    }

}
