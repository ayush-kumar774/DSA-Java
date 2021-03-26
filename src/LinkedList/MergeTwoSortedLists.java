package LinkedList;
import static LinkedList.MiddleOfTheLinkedList.printListNode;
import static LinkedList.PalindromeLinkedList.takeInput2;

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode finalHead = null ;
        ListNode finalTail = null ;

        while (true) {
            if (l1 == null || l2 == null) {
                break ;
            }
            if (l1.val < l2.val) {
                if (finalHead == null) {
                    finalHead = l1 ;
                }
                else {
                    finalTail.next = l1;
                }
                finalTail = l1 ;
                l1 = l1.next;
            }
            else  {
                if (finalHead == null) {
                    finalHead = l2 ;
                }
                else {
                    finalTail.next = l2;
                }
                finalTail = l2 ;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            while (l1 != null) {
                if (finalHead == null) {
                    finalHead = l1 ;
                }
                else {
                    finalTail.next = l1;
                }
                finalTail = l1 ;
                l1 = l1.next;
            }
        }
        if (l2 != null) {
            while (l2 != null) {
                if (finalHead == null) {
                    finalHead = l2 ;
                }
                else {
                    finalTail.next = l2;
                }
                finalTail = l2 ;
                l2 = l2.next;
            }
        }
        return finalHead ;
    }

    public static void main(String[] args) {
        ListNode l1 = takeInput2() ;
        ListNode l2 = takeInput2() ;
        ListNode res = mergeTwoLists(l1, l2);
        printListNode(res);
    }
}
