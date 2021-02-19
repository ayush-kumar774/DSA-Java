package LinkedList;

import java.util.Scanner;

import static LinkedList.CreatingLinkedList.createLinkedList;

public class SearchInLinkedList {

    public static boolean searchRecur(Node head, int data)
    {
        if(head == null)
        {
            return (false);
        }
        if(head.data == data)
        {
            return (true);
        }
        boolean res = searchRecur(head.next, data);
        return res;
    }

    public static int search(Node head, int data)
    {
        int index = -1;
        if(head == null)
        {
            return index;
        }
        else
        {
            int counter = 1;
            while (head != null)
            {
                if(data == head.data)
                {
                    return counter;
                }
                else
                {
                    head = head.next;
                    counter++ ;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int n ;
        System.out.print("Enter the number of elements in linked list ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the elements");
        Node head = createLinkedList(n);

        System.out.println("Enter the number which you want to search ");
        int target = sc.nextInt();
        int ans = search(head, target);
        boolean res = searchRecur(head, target);
        if(res){
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not found");
        }
        if (ans == -1)
        {
            System.out.println("Element is not found");
        }
        else
        {
            System.out.println("Element is found at " + (ans) + " th position.");
        }
    }
}
