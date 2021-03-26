package Queue

internal class QueueUsingArray {
    private var data: IntArray
    private var front // index at which front element is stored
            : Int
    private var rear // index at which rear element is stored
            : Int
    private var size: Int

    constructor() {
        data = IntArray(10)
        front = -1
        rear = -1
        size = 0
    }

    constructor(capacity: Int) {
        data = IntArray(capacity)
        front = -1
        rear = -1
        size = 0
    }

    fun size(): Int {
        return size
    }

    val isEmpty: Boolean
        get() = size == 0

    fun front(): Int {
        return if (size == 0) {
            println("Queue is empty")
            -1
        } else {
            data[front]
        }
    }

    fun enqueue(element: Int) {
        if (size == data.size) {
            doubleCapacity()
        }
        if (size == 0) {
            front = 0
        }
        size++
        rear = (rear + 1) % data.size
        //        rear++ ;
//        if (rear == data.length) {
//            rear = 0;
//        }
        data[rear] = element
    }

    private fun doubleCapacity() { //        System.out.println("Double Capacity Called");
        val temp = data
        data = IntArray(2 * temp.size)
        var index = 0
        for (i in front until temp.size) {
            data[index] = temp[i]
            index++
        }
        for (i in 0..front - 1) {
            data[index] = temp[i]
            index++
        }
        front = 0
        rear = temp.size - 1
    }

    fun dequeue(): Int {
        return if (size == 0) {
            println("Queue is empty.")
            -1
        } else {
            val temp = data[front]
            front = (front + 1) % data.size
            size--
            if (size == 0) {
                rear = -1
                front = rear
            }
            temp
        }
    }
}

object QueueImplementation {
    @JvmStatic
    fun main(args: Array<String>) {
        val queue = QueueUsingArray(1)
        queue.enqueue(5)
        queue.enqueue(10)
        queue.enqueue(15)
        println(queue.dequeue())
        println(queue.dequeue())
        queue.enqueue(20)
        println(queue.dequeue())
        println(queue.dequeue())
    }
}