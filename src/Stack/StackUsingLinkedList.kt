package Stack

internal class Node<T> {
    var data: T? = null
    var next: Node<T>? = null

    constructor(data: T) {
        this.data = data
        next = null
    }

    constructor() {}
}

internal class StackUsingLL<T> {
    private var head: Node<T?>? = null
    private var size = 0
    fun size(): Int {
        return size
    }

    fun top(): T? {
        return head!!.data as T?
    }

    val isEmpty: Boolean
        get() = size == 0

    fun push(data: T) {
        size++
        val temp: Node<T?> = Node<T?>(data)
        temp.next = head
        head = temp
    }

    fun pop(): T? {
        return if (size == 0) {
            println("Stack is empty.")
            null
        } else {
            val data = head!!.data as T?
            size--
            head = head!!.next
            data
        }
    }

}

object StackUsingLinkedList {
    @JvmStatic
    fun main(args: Array<String>) {
        val stack = StackUsingLL<Int>()
        stack.push(4)
        stack.push(5)
        stack.push(6)
        stack.push(7)
        while (!stack.isEmpty) {
            println("Poped element is " + stack.pop())
            println("Size of stack is " + stack.size())
        }
    }
}