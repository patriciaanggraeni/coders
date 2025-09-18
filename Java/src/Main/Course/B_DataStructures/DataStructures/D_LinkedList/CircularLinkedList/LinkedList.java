package Course.B_DataStructures.DataStructures.D_LinkedList.CircularLinkedList;

public class LinkedList {

    Node last;
    private int length;

    LinkedList() {
        this.last = null;
        this.length = 0;
    }

    protected boolean isEmpty() {
        return last == null && length == 0;
    }

    protected int length() {
        return this.length;
    }

//    protected void createLinkedList() {
//       Node satu = new Node(5);
//       Node dua = new Node(10);
//       Node tiga = new Node(15);
//       Node empat = new Node(20);
//
//       satu.next = dua;
//       dua.next = tiga;
//       tiga.next = empat;
//       empat.next = satu;
//
//       last = empat;
//    }

    protected void addFirst(int data) {
        Node node = new Node(data); // buat objek baru

        if (isEmpty()) { // cek jika kosong
            last = node; // tambahkan node
        } else { // jika tidak, maka
            node.next = last.next; // hubungkan next dari node ke last.next (ke data itu sendiri)
        }
        last.next = node; // hubungkan node dengan node itu sendiri
        length++; // tambahkan jumlah data
    }

    protected void addLast(int data) {
        Node node = new Node(data); // buat objek baru

        if (isEmpty()) { // jika kosong
            last = node; // isi last dengan node (data)
            last.next = last; // hubungkan node dengan dirinya sendiri (circular)
        } else { // jika tidak
            node.next = last.next; // hubungkan node.next ke last.next
            last.next = node; // hubungkan last.next ke node
            last = node; // ubah posisi last ke node
        }
        length++; // tambahkan jumlah data
    }

    protected void removeFirst() {
        if (isEmpty()) { // cek jika list kosong
            System.out.println("-----------------");
            System.out.println("Linked List Kosong");
            System.out.println("-----------------");
        } else { // jika tidak, maka
            Node temp = last.next; // buat variabel untuk menampung nilai dari last.next (nilai pertama)

            if (last == last.next) { // jika last merujuk pada dirinya sendiri, maka
                last = null; // set last menjadi null
            } else { // jika tidak, maka
                last.next = temp.next; // hubungkan last.next ke temp.next
            }
            temp.next = null; // set temp.next menjadi null
            length--; // kurangi jumlah data
        }
    }

    protected void removeLast() {
        if (isEmpty()) { // cek apakah list kosong
            System.out.println("------------------");
            System.out.println("Linked List Kosong");
            System.out.println("------------------");
        } else { // jika tidak

            // buat variabel penampung (temp dan first)
            Node temp = last.next;
            Node first = last.next;

            if (last == last.next) { // jika sudah mencapai last, maka
                last = null; // set last ke null
            } else { // jika tidak

                while (temp.next != last) { // lakukan kunjungan data
                    temp = temp.next; // ubah posisi temp
                }

                // jika kondisi while false, maka
                temp.next = first; // hubungkan temp.next ke first
                last.next = null;  // set last.next ke null
                last = temp; // ubah posisi last ke temp
            }
            length--; // kurangi jumlah data
        }
    }

    protected void print() {
        if(isEmpty()) { // cek apakah linked list kosong
            System.out.println("-----------------");
            System.out.println("Linked List Kosong");
            System.out.println("-----------------");
        } else { // jika tidak, maka
            Node first = last.next; // buat variabel untuk menampung nilai dari last.next

            while (first != last) { // ketika first != last, maka
                System.out.print(first.getData() + " --> "); // print data
                first = first.next; // lakukan kunjungan data
            }
            System.out.print(first.getData() + "\n"); // jika first mencapai last, print first
        }
    }
}