package LinkedList;

import java.util.Scanner;

import static LinkedList.Node.printLinkedList;

public class CreatingLinkedList {

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


    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Node head = createLinkedList(n);
        printLinkedList(head);
    }
}
