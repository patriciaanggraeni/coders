package Course.B_DataStructures.DataStructures.B_Stack.WithArray;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(5);
        stack.push(12);
        stack.push(32);
        stack.push(14);
        stack.push(65);
        stack.print();
        System.out.println("pop: " + stack.pop());
        stack.print();

    }
}