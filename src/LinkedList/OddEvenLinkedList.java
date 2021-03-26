package LinkedList;

import java.util.ArrayList;

import static LinkedList.LinkedList.printLinkedList;
import static LinkedList.LinkedList.takeInput;

public class OddEvenLinkedList {

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return  null ;
        ListNode odd = head ;
        ListNode even = head.next ;
        ListNode evenHead = even ;

        while(even != null && even.next != null) {
            odd.next = even.next ;
            odd = odd.next ;
            even.next = odd.next ;
            even = even.next ;
        }
        odd.next = evenHead ;
        return  head ;
    }

    public static Node oddEvenList(Node head) {
        Node number = head ;
        ArrayList<Integer> odd = new ArrayList<>() ;
        ArrayList<Integer> even = new ArrayList<>() ;
        int counter = 1 ;
        while (number != null) {
            if (counter % 2 == 0) {
                even.add(number.data);
            }
            else {
                odd.add(number.data);
            }
            number = number.next ;
            counter++ ;
        }
        Node finalHead = null , tail = null ;
        for (int i = 0; i < odd.size() ; i++) {
            Node newNode = new Node(odd.get(i)) ;
            if (finalHead == null) {
                finalHead = newNode ;
            }
            else {
                tail.next = newNode ;
            }
            tail = newNode ;
        }
        for (int i = 0; i < even.size() ; i++) {
            Node newNode = new Node(even.get(i)) ;
            if (finalHead == null) {
                finalHead = newNode ;
            }
            else {
                tail.next = newNode ;
            }
            tail = newNode ;
        }
        return finalHead;
    }

    public static void main(String[] args) {
        Node head = takeInput();
        Node res = oddEvenList(head);
        printLinkedList(res);
    }
}
