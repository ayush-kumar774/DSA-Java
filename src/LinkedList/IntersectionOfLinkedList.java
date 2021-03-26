package LinkedList;
import java.util.HashSet;
import java.util.Set;

import static LinkedList.LinkedList.*;

public class IntersectionOfLinkedList {
    public static void main(String[] args) {
        Node head1 = takeInput();
        Node head2 = takeInput();
        printLinkedList(head1);
        printLinkedList(head2);

        int intersection = intersectionNumber(head1, head2);
        if (intersection != -1) {
            System.out.println("Intersecting at " + intersection );
            Node intersecting = intersectionNode(head1, head2);
            printLinkedList(intersecting);
        }
        else {
            System.out.println("Got -1");
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Time complexity - O(M + N)
        // Space complexity - O(1)
        ListNode A = headA ;
        ListNode B = headB ;
        while (A != B) {
            A = A == null ? headB : A.next ;
            B = B == null ? headA : B.next ;
        }
        return A ;
    }

    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        // Time complexity - O(M + N)
        // Space complexity - O(M)

        Set<ListNode> nodesInB = new HashSet<ListNode>();

        while (headB != null) {
            nodesInB.add(headB);
            headB = headB.next;
        }

        while (headA != null) {
            // if we find the node pointed to by headA,
            // in our set containing nodes of B, then return the node
            if (nodesInB.contains(headA)) {
                return headA;
            }
            headA = headA.next;
        }

        return null;
    }

    public ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
        // Time complexity - O(M * N)
        // Space complexity - O(1)
        while (headA != null) {
            ListNode pB = headB;
            while (pB != null) {
                if (headA == pB) return headA;
                pB = pB.next;
            }
            headA = headA.next;
        }
        return null;
    }

    public static Node intersectionNode(Node head1, Node head2) {
        int l1= lengthOfLinkedList(head1);
        int l2= lengthOfLinkedList(head2);
        int d = Math.abs(l1 - l2);
        while (d > 0)
        {
            if (l1 > l2) {
                head1 = head1.next ;
                if (head1 == null) {
                    return null ;
                }
            }
            else  {
                head2 = head2.next ;
                if (head2 == null) {
                    return null ;
                }
            }
            d-- ;
        }
        while (head1 != null && head2 != null) {
            if (head1.data == head2.data) {
                return head1.next;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }

    public static int intersectionNumber(Node head1, Node head2) {
        int l1= lengthOfLinkedList(head1);
        int l2= lengthOfLinkedList(head2);
        int d = Math.abs(l1 - l2);
        while (d > 0)
        {
            if (l1 > l2) {
                head1 = head1.next ;
                if (head1 == null) {
                    return -1;
                }
            }
            else  {
                head2 = head2.next ;
                if (head2 == null) {
                    return -1;
                }
            }
            d--;
        }
        while (head1 != null && head2 != null)  {
            if (head1.data == head2.data) {
                return head1.data ;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return -1;
    }
}
