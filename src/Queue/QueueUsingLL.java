package Queue;

class Node<T> {
    Node<T> next ;
    T data ;

    Node(T data) {
        next = null ;
        this.data = data ;
    }
}

public class QueueUsingLL <T> {
    private Node<T> front ;
    private Node<T> rear ;
    private int size = 0 ;

    public int size() {
        return size ;
    }

    public boolean isEmpty() {
        return (size == 0) ;
    }

    public T front() {
        if (size == 0) {
            System.out.println("Can not fetch front because the queue is empty.");
            return null ;
        }
        return (T)front.data ;
    }
    public void enqueue(T data) {
        size++;
        Node<T> newNode = new Node<>(data) ;
        if (rear == null) {
            front = rear = newNode;
        }
        else {
            rear.next = newNode ;
            rear = newNode ;
        }
    }

    public T dequeue() {
        if (size == 0) {
            System.out.println("Can not dequeue because the queue is empty.");
            return null ;
        }

        size--;
        T temp = front.data ;
        front = front.next ;
        if (size == 0) {
            front = rear = null ;
        }
        return temp ;
    }

}

class QueueUsingLinkedList {
    public static void main(String[] args) {
        QueueUsingLL<Integer> queue = new QueueUsingLL() ;
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        System.out.println("Size of queue is " + queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(20);
        System.out.println("Front element of the queue is " + queue.front());
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
