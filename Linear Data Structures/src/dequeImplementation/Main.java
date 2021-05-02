package dequeImplementation;

public class Main {
    public static void main(String[] args) {
        DequeImplementation<Integer> deque = new DequeImplementation();
        deque.addLast(5);
        deque.addLast(4);
        deque.addLast(3);
        deque.removeLast();
//        deque.addFirst(3);
//        deque.addFirst(4);
//        deque.addFirst(1);

        deque.printList();
    }
}
