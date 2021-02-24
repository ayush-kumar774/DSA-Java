package LinkedList;

import java.util.Scanner;

import static LinkedList.CreatingLinkedList.createLinkedList;
import static LinkedList.Node.printLinkedList;

public class DeletionInLinkedList {

    public static Node deleteNode(Node head, int target)
    {
        Node temp = head;
        Node temp2 = head;
        if (temp == null)
        {
            System.out.println("Linked list is empty.");
            return null;
        }
        while (temp2 != null)
        {
            if(temp2.data == target) {
                temp = temp2.next;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = createLinkedList(n);
        printLinkedList(head);

        System.out.println("Enter the number you want to delete:- ");
        int target = sc.nextInt();
        Node res = deleteNode(head, target);
        System.out.println("After deletion of " + target + ".");
        printLinkedList(res);
    }
}
