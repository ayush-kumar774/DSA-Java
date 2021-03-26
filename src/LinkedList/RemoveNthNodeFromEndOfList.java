package LinkedList;

import java.util.Scanner;

import static LinkedList.MiddleOfTheLinkedList.printListNode;
import static LinkedList.PalindromeLinkedList.takeInput2;

public class RemoveNthNodeFromEndOfList {
    public static int getLength(ListNode head) {
        int counter = 0 ;
        while (head != null) {
            counter++ ;
            head = head.next ;
        }
        return counter ;
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int d = getLength(head) + 1 - (n) ;
        if (d == 1) {
            return  head.next ;
        }
        int pos = 2 ;
        ListNode temp = head.next ;
        ListNode res = head;
        while (temp != null) {
            if(pos == n - 1) {
                res.next = temp.next;
            }
            res.next = temp ;
            temp = temp.next ;
            pos++ ;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        ListNode head = takeInput2() ;
        int n = sc.nextInt() ;
        ListNode head2 = removeNthFromEnd(head, n);
        printListNode(head2) ;
    }
}
