package LinkedList;
import java.util.Scanner;

public class LinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = takeInput();

        printLinkedList(head);


//        System.out.print("Enter the element which you want to insert at last index of linked list ");
//
//        int value = sc.nextInt();
//
//        Node newHead = insertAtLast(head, value);
//        System.out.println("After inserting the element at last ");
//        printLinkedList(newHead);
//
//        System.out.println("Enter the element which you want to add");
//        int val2 = sc.nextInt();
//        System.out.println("Enter the position where you want to insert a new element ");
//        int pos = sc.nextInt();
//        Node newHead2 = insertAtGivenPosition(head, val2, pos);
//        printLinkedList(newHead2);

        System.out.println("Length of the linked list " + lengthOfLinkedList(head));


//        System.out.println("Enter the element you want to search ");
//        int element = sc.nextInt();
//        int index = searchInLinkedList(head, element) ;
//        if (index == -1) {
//            System.out.println("Not found");
//        }
//        else {
//            System.out.println("Element is found at " + index );
//        }

        System.out.println("Enter the element you want to delete ");
        int element = sc.nextInt();
        Node newHead3 = deleteNodeOfLinkedList(head, element);
        printLinkedList(newHead3);

    }

    public static Node deleteNodeOfLinkedList(Node head, int element) {
//        int pos = searchInLinkedList(head, element);
        Node temp = head ;
        Node temp2 = null;
//        if (pos == -1) {
//            System.out.println("This element can not be deleted because it does not exist.");
//        }
//        if (pos == 1) {
//            return temp.next;
//        }
        if (temp.data == element) {
            return temp.next ;
        }
        while (temp != null ) {
            if (temp.next == null) {
                break ;
            }
            if (temp.next.data == element) {
                break;
            }
            temp = temp.next ;
        }

        if (temp.next == null) {
            System.out.println("This element can not be deleted because it does not exist.");
            return head;
        }
        else {
            temp2 = temp.next ;
            temp.next = temp2.next ;
            return head ;
        }
    }

    public static int searchInLinkedList(Node head, int element) {
        Node temp = head ;
        int counter = 1 ;
        while (temp != null) {
            if (temp.data == element) {
                return  counter;
            }
            counter++ ;
            temp = temp.next;
        }
        return -1;
    }

    public static int lengthOfLinkedList(Node head) {
        int counter = 0;
        while (head != null) {
            head = head.next ;
            counter++ ;
        }
        return counter;
    }

    public static Node insertAtGivenPosition(Node head, int value, int pos) {
        Node temp = head ;
        Node temp2 = null ;
        Node newNode = new Node(value);
        if(temp == null) {
            System.out.println("Linked list is empty adding as last element");
            return newNode;
        }

        if (pos > lengthOfLinkedList(head)) {
            System.out.println("Invalid index number");
            return null;
        }

        if (pos == 1) {
            newNode.next = temp ;
            return  newNode ;
        }

        else  if (pos == lengthOfLinkedList(head)) {
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            return head ;
        }

        else {
            int counter = 2 ;
            while (temp != null && counter < pos) {
                temp = temp.next ;
                counter++ ;
            }
            temp2 = temp.next;
            temp.next = newNode ;
            newNode.next = temp2;
            return head;
        }

    }

    public static Node insertAtLast(Node head, int value) {
        Node temp = head;
        Node newNode = new Node(value);
        if (temp == null) {
            return newNode;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        temp.next.next = null;
        return head;
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.print("Linked List is empty.");
            return;
        }
        else {
            while (head != null) {
                System.out.print(head.data + " -> ");
                head = head.next;
            }
            System.out.println("null.");
        }
    }

    public static Node takeInput() {
        Node head = null;
        Node tail = null;

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data  != -1)
        {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode ;
                tail = newNode ;
            }
            else {
                tail.next = newNode ;
                tail = newNode ;
            }
            data = sc.nextInt();
        }

        return head;
    }
    public static ListNode deleteNode(ListNode head, int position) {
        if (position == 0) {
            return head.next ;
        }
        else {
            ListNode temp = head ;
            ListNode temp2 ;
            int counter = 0 ;
            while(counter < position - 1 && temp != null) {
                temp = temp.next ;
                counter++;
            }
            temp2 = temp.next.next ;
            temp.next = temp2;
            return head ;
        }
    }

}
