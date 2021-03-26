package LinkedList;

import java.util.Scanner;

import static LinkedList.MiddleOfTheLinkedList.printListNode;
import static LinkedList.PalindromeLinkedList.takeInput2;

public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode finalHead = null ;
        ListNode finalTail = null ;
        while (head != null) {
            if (head.val != val) {
                ListNode newNode = new ListNode(head.val) ;
                if (finalHead == null) {
                    finalHead = newNode ;
                }
                else {
                    finalTail.next = newNode ;
                }
                finalTail = newNode ;
            }
            head = head.next;
        }
        return finalHead;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode head = takeInput2() ;
        printListNode(head);
        int val = sc.nextInt() ;
        ListNode res = removeElements(head, val) ;
        printListNode(res) ;
    }
}
