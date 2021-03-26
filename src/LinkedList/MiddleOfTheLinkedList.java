package LinkedList;

import java.util.ListIterator;

class ListNode {
    int val ;
    ListNode next ;
    ListNode () {}
    ListNode (int val) {
        this.val = val ;
    }
    ListNode (int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class MiddleOfTheLinkedList {
    public static void printListNode(ListNode head)
    {
        if (head == null) {
            System.out.print("Linked List is empty.");
            return;
        }
        else {
            while (head != null) {
                System.out.print(head.val + " -> ");
                head = head.next;
            }
            System.out.println("null.");
        }
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l2 ;
        l2.next = l3 ;
        l3.next = l4 ;
        l4.next = l5 ;
//        l5.next = l6 ;
        printListNode(l1);
        ListNode mid = middleListNode(l1);
        printListNode(mid);
    }

    private static ListNode middleListNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast != null)
        {
            fast = fast.next ;
            if(fast.next == null ) {
                return slow.next;
            }
            slow = slow.next ;
            fast = fast.next ;
        }
        return slow;
    }
}
