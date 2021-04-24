package dynamicStack;

public class Main {
    public static void main(String[] args) {
        DynamicStack<Integer> stack = new DynamicStack<>();
        stack.push(5);
        stack.push(2);
        stack.push(1);

//        System.out.println(stack.pop());
//        stack.print();
//        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}
