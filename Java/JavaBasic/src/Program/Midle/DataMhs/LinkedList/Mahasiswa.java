package Program.Midle.DataMhs.LinkedList;

public class Mahasiswa extends Node {

    Node head;

    Mahasiswa() {}

    private boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addFirst(Node data) {
        if (isEmpty()) {
            head = data;
        } else {
            data.next = head;
            head = data;
        }
    }

    public void addLast(Node data) {
        if (isEmpty()) {
            head = data;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = data;
        }
    }

    public void add(Node data, int index) {
        if (index == 1) {
            data.next = head;
            head = data;
        } else {
            Node prev = head;
            int count = 1;

            while (count < index - 1) {
                prev = prev.next;
                count++;
            }

            Node current = prev.next;
            prev.next = data;
            data.next = current;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked is was empty");
        } else {
            Node temp = head;

            head = head.next;
            temp.next = null;
            System.out.println("Data berhasil dihapus");
        }
    }

    public int length() {
        int count = 0;
        if (isEmpty()) {
            return 0;
        } else {
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
        }
        return count;
    }

    public void printData() {
        Node temp = head;
        System.out.println("Nama\tNim\tIpk\tStatus");
        while (temp != null) {
            System.out.print(temp.getNama() + "\t\t" + temp.getNim() + "\t\t" + temp.getIpk() + "\t\t" + temp.getStatus() + "\n");
            temp = temp.next;
        }
    }
}
