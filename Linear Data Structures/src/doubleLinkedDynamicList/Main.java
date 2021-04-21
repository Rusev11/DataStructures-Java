package doubleLinkedDynamicList;

public class Main {
    public static void main(String[] args) {
        DynamicList<TestClass> list = new DynamicList();


//        list.add(1);
//        list.add(2);
//        list.add(3);
        TestClass a = new TestClass("aaa");
        TestClass b = new TestClass("bbb");
        TestClass c = new TestClass("ccc");

        list.add(a);
        list.add(b);
        list.add(c);

//        list.remove();
        list.remove(b);
        list.printList();
        System.out.println(list.contains(b));
    }
}
