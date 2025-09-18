package Course.B_DataStructures.DataStructures.D_LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList sll = new LinkedList();

        sll.addFirst(4);
        sll.addFirst(3);
        sll.addFirst(3);
        sll.addFirst(2);
        sll.addFirst(2);
        sll.addLast(10);
        sll.add(5, 6);
        sll.add(5, 7);
        sll.add(7, 9);
        sll.print();

        sll.removeFirst();
        sll.print();
        sll.removeLast();
        sll.print();
        sll.removeKey(10);
        sll.print();
        System.out.println("Jumlah elemen: " + sll.getLenght());

        sll.getMid();
        sll.findNth(4);
        sll.print();
    }
}
