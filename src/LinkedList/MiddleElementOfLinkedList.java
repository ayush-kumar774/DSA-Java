package LinkedList;

import java.util.Scanner;

import static LinkedList.Node.printLinkedList;

public class MiddleElementOfLinkedList {
    static Node createLinkedList()
    {
        Scanner sc = new Scanner(System.in);

        Node head = null;

        Node tail = null;

        int data  = sc.nextInt();

        while (data != -1)
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static int middleElement(Node head)
    {
        Node slow = head ;
        Node fast = head.next;
        while (fast != null || fast.next == null)
        {
            fast = fast.next;
            slow = slow.next;
            if (fast.next == null)
            {
                return (slow.data);
            }
            fast = fast.next;
            if(fast.next == null)
            {
                break;
            }
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node head = createLinkedList();
        printLinkedList(head);
        int ans = middleElement(head);
        System.out.println("Middle element is " + ans);
    }
}
