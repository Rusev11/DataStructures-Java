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
        private boolean addOrder;


        public Node(T element) {
            this.element = element;
            this.next = null;
            this.prev = null;
            this.addOrder = false;
        }
    }

    public void addFirst(T object) {
        Node currentNode = new Node(object);
        currentNode.addOrder = true;
        if (head == null) {
            head = currentNode;
            tail = head;
            return;
        }
        currentNode.next = head;
        head = currentNode;
    }

    public void removeFirst(T object) {
        if (head == null) {
            System.out.println("The list is empty. Nothing to remove.");
            return;
        }

        if (!head.addOrder) {
            System.out.println("This node was added last. Cannot be removed using removeFirst method.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    public void addLast(T object) {
        Node currentNode = new Node(object);
        currentNode.addOrder = false;
        if (head == null) {
            head = currentNode;
            tail = currentNode
            return;
        }
        currentNode.prev = tail;
        tail = currentNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node currentNode = head;
        System.out.println(currentNode.element);
        while(currentNode.next!=null){
            currentNode = currentNode.next;
            System.out.println(currentNode.element);
        }
        System.out.println(currentNode.element);
    }

}
