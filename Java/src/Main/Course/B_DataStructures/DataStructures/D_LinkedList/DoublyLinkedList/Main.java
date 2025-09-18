package Course.B_DataStructures.DataStructures.D_LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList dll = new LinkedList();

        dll.addLast(12);
        dll.addLast(13);
        dll.addLast(14);
        dll.addLast(15);
        dll.printForward();
        dll.printBackward();
        dll.deleteFirst();
        dll.printForward();
        dll.deleteFirst();
        dll.printBackward();

        dll.add(16, 2);
        dll.add(17,3);
        dll.add(19,4);
        dll.printForward();
        dll.delete(16);
        dll.delete(17);
        dll.delete(14);
        dll.printForward();

        dll.addFirst(20);
        dll.addFirst(21);
        dll.addFirst(25);
        dll.printForward();
        dll.getMid();

    }
}
