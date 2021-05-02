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
        if(head.next == null){
            tail = head;
            tail.prev = currentNode;
            head = currentNode;
            currentNode.next = tail;
            return;
        }
        currentNode.next = head;
        head.prev = currentNode;
        head = currentNode;
    }

    public void removeFirst() {
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
        head.next.prev = null;
        head = head.next;
    }

    public void addLast(T object) {
        Node currentNode = new Node(object);
        currentNode.addOrder = false;
        if (head == null) {
            head = currentNode;
            tail = currentNode;
            return;
        }
        if(head.next == null){
            head.next = currentNode;
            tail = currentNode;
            return;
        }
        currentNode.prev = tail;
        tail.next = currentNode;
        tail = currentNode;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("The list is empty. Nothing to remove.");
            return;
        }

        if (tail.addOrder) {
            System.out.println("This node was added first. Cannot be removed using removeLast method.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        tail.prev.next = null;
        tail = tail.prev;
    }

    public void printList() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node currentNode = head;
        System.out.println(currentNode.element);
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.element);
        }
    }

}
