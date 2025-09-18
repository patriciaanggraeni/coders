package Course.B_DataStructures.DataStructures.D_LinkedList.CircularLinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList cll = new LinkedList();
        cll.addFirst(12);
        cll.addFirst(13);
        cll.addFirst(14);
        cll.addFirst(15);
        cll.addLast(20);
        cll.addLast(35);
        cll.removeLast();
        cll.removeLast();
        cll.removeLast();
        cll.removeLast();
        cll.removeLast();
        cll.removeLast();

        cll.print();
        System.out.println("Jumlah data: " + cll.length());
    }
}