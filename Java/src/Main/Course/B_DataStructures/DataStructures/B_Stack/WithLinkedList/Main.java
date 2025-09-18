package Course.B_DataStructures.DataStructures.B_Stack.WithLinkedList;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.print();
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        stack.print();
    }
}
