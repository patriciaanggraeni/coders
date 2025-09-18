package Program.Pro.Example.Program2;

public class Main {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addLast('e');
        ll.addFirst('d');
        ll.add('a', 1);
        ll.add('b', 2);
        ll.insertBefore('c', 'd');
        ll.print();
        System.out.println("Kepala: " + ll.getHead());


    }
}
