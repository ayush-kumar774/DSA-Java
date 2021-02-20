package LinkedList;

import java.util.Scanner;

public class ReverseLinkedList
{
    public static Node reverse(Node head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }

        Node left = reverse(head.next);
        head.next.next = head;

        head.next = null;

        return left;
    }

    public static Node createLinkedList(int n)
    {
        Node head = null ;
        Node tail = null ;
        int data ;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < n ; i++)
        {
            data = sc.nextInt();
            Node newNode = new Node(data);
            if(head == null)
            {
                head = newNode ;
                tail = newNode ;
            }
            else
            {
                tail.next = newNode ;
                tail = newNode ;
            }
        }
        return head;
    }

    public static void printLinkedList(Node head)
    {
        if(head == null)
        {
            System.out.println("Linked List is empty");
            return;
        }
        else
        {
            while(head != null)
            {
                System.out.print(head.data + " -> ");
                head = head.next;
            }
            System.out.print("null") ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        Node head = createLinkedList(n);
        printLinkedList(head);
        System.out.println("");
        System.out.print("The reverse linked list is ");
        Node result = reverse(head);
        printLinkedList(result);
    }
}