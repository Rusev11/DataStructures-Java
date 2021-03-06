package dynamicStack;

public class DynamicStack<T> {
    private Node head;
    private Node tail;
    private int count;

    public DynamicStack() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    private class Node {
        private T element;
        private Node next;
        private Node prev;


        public Node(T element) {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
    }

    public void push(T item) {
        Node currentNode = new Node(item);
        count++;
        if (head == null) {
            head = currentNode;
            tail = currentNode;
            return;
        }
        currentNode.prev = tail;
        tail.next = currentNode;
        tail = currentNode;
    }

    public T pop() {
        Node topNode = tail;
        if (topNode.prev == null) {
            tail = null;
            return topNode.element;
        }
        tail = topNode.prev;
        tail.next = null;
        count--;
        return topNode.element;
    }

    public T peek() {
        return tail.element;
    }

    public int size() {
        return count;
    }

    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

    public void print() {
        Node currentNode = tail;
        if (currentNode == null) {
            System.out.println("The stack is empty");
            return;
        }
        while (currentNode.prev != null) {
            System.out.println(currentNode.element);
            currentNode = currentNode.prev;
        }

        System.out.println(currentNode.element);
    }
}
