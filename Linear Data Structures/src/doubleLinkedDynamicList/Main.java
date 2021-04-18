package doubleLinkedDynamicList;

public class Main {
    public static void main(String[] args) {
        DynamicList list = new DynamicList();


        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(6);

        list.printList();
    }
}
