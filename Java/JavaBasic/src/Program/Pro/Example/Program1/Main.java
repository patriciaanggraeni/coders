package Program.Pro.Example.Program1;

public class Main {
    public static void main(String[] args) {

        LinkedList stack = new LinkedList();

        stack.addFirst(15);
        stack.addLast(30);
        stack.add(2, 54);
        stack.insertBefore(29, 30);
        stack.print();

        // input missing data
        stack.insertBefore(100, 99);
        stack.print();
    }
}
