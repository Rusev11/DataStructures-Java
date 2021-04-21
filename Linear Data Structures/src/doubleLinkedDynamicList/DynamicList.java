package doubleLinkedDynamicList;

public class DynamicList<T> {
    private Node head;
    private Node tail;
    private int count;

    public DynamicList() {
        this.head = null;
        this.tail = null;
        count = 0;
    }

    private class Node {
        Object element;
        Node next;
        Node prev;

//        public Node(Object element, Node prevNode) {
//            this.element = element;
//            prevNode.next = this;
//        }

        public Node(Object element) {
            this.element = element;
            next = null;
            prev = null;
        }
    }

    public void add(T item) {
        if (head == null) {
            head = new Node(item);
            tail = head;
        } else {
            Node nextNode = new Node(item);
            this.tail.next = nextNode;
            nextNode.prev = tail;
            tail = nextNode;
        }
        count++;
    }

    public void remove() {
        if (head == null) {
            System.out.println("The list is empty. Nothing is removed.");
            return;
        }
        if (head.next == null) {
            head.element = null;
            System.out.println("The only element in the list was removed.");
            count--;
            return;
        }
        head = head.next;
        head.prev = null;
        count--;
        System.out.println("First element was deleted.");
    }

    public void remove(int index) {

        if (head == null) {
            System.out.println("The list is empty. Nothing is removed.");
            return;
        }

        if (index >= count) {
            System.out.println("Cannot remove element. Index is bigger than list size.");
            return;
        }

        Node currentNode = head;

        if (index == 0) {
            this.remove();
            return;
        }

        for (int i = 1; i <= index; i++) {
            currentNode = currentNode.next;
        }

        if (currentNode == tail) {
            tail = currentNode.prev;
            tail.next = null;
            count--;
            return;
        }

        currentNode.prev.next = currentNode.next;
        currentNode.next.prev = currentNode.prev;
        count--;

    }

    public void remove(T item) {
        if (head == null) {
            System.out.println("The list is empty. Nothing is removed.");
            return;
        }
        Node currentNode = head;
        if (currentNode.element.equals(item)) {
            this.remove();
        }

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            if (currentNode.element.equals(item)) {
                if (currentNode == tail) {
                    tail = currentNode.prev;
                    tail.next = null;
                    count--;
                    return;
                }

                currentNode.prev.next = currentNode.next;
                currentNode.next.prev = currentNode.prev;
                count--;
                return;
            }
        }
    }

    public boolean contains(T item) {
        if (head == null) {
            System.out.println("The list is empty.");
            return false;
        }

        Node currentNode = head;
        if (currentNode.element.equals(item)) {
            return true;
        }

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            if(currentNode.element.equals(item)){
                return true;
            }
        }
        return false;
    }

    public void printList() {
        Node currentNode = head;
        if (currentNode == null) {
            System.out.println("The list is empty");
            return;
        }
        while (currentNode.next != null) {
            System.out.println(currentNode.element);
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.element);
    }
}
