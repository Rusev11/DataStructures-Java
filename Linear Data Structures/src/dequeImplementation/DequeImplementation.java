package dequeImplementation;

import dynamicStack.DynamicStack;

public class DequeImplementation<T> extends DynamicStack {
    private Node head;
    private Node tail;
    private int count;

    public DequeImplementation() {
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

    public void addFirst(T object){
        Node currentNode = new Node(object);
        currentNode.next = head;
        head = currentNode;

    }

}
