package LinkedList;

public class Node {
    public int data ;
    public Node next ;
    public Node(int  data)
    {
        this.data = data ;
        next = null;
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
}
