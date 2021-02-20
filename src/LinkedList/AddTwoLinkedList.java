package LinkedList;

import java.util.Scanner;

public class AddTwoLinkedList {
    public static Node addLinkedList(Node first, Node second)
    {
        Node result = null;
        Node prev = null;
        Node temp = null;
        int carry = 0, sum = 0 ;

        while (first != null || second != null)
        {
            sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);

            carry = (sum >= 10) ? 1 : 0 ;

            sum %= 10 ;

            temp = new Node(sum);

            if (result == null)
            {
                result = temp ;
            }
            else
            {
                prev.next = temp ;
            }

            prev = temp ;

            if(first != null)
            {
                first = first.next;
            }
            if(second != null)
            {
                second = second.next;
            }
        }
        if(carry > 0)
        {
            temp.next = new Node(carry);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of digits in first linked list ");
        int n = sc.nextInt();
        int first[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("Enter " + (i +1) + " digit of the first number ");
            first[i] = sc.nextInt();
        }
        System.out.print("Enter the number of digits in second linked list ");
        int m = sc.nextInt();
        int second[] = new int[m];
        for(int i = 0 ; i < m ; i++)
        {
            System.out.print("Enter " + (i +1) + " digit of the second number ");
            second[i] = sc.nextInt();
        }

        Node head1 = generateLinkedList(first);
        Node head2 = generateLinkedList(second);

        Node result = addLinkedList(head1, head2);


        printLinkedList(result);
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


    public static Node generateLinkedList(int[] first) {
        Node head = null;
        Node tail = null;
        for(int i = 0 ; i < first.length; i++)
        {
            Node newNode = new Node(first[i]);
            if (head == null)
            {
                head = newNode;
                tail = newNode;
            }
            else
            {
                tail.next = newNode;
                tail = newNode ;
            }
        }
        return head ;
    }
}
