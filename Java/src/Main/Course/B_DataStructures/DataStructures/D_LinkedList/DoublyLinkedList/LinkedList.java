package Course.B_DataStructures.DataStructures.D_LinkedList.DoublyLinkedList;

public class LinkedList {
    Node head, tail;

    protected boolean isEmpty() {
        return head == null;
    }

    // menambahkan data di awal linked list (add first)
    protected void addFirst(int data) {
        Node node = new Node(data); // buat objek baru

        if (isEmpty()) { // cek apakah head masih null
            tail = node; // jika iya, maka isi tail dengan data
        } else { // jika sudah ada isinya
            head.prev = node; // sambungkan head.prev ke node (baru)
        }

        node.next = head; // sambungkan node.next (baru) ke head
        head = node; // set node (baru) menjad head
    }

    protected void addLast(int data) {
        Node node = new Node(data); // membuat objek baru

        if (isEmpty()) {
            head = node; // isi head dengan inputan
        } else {
            tail.next = node; // Hubungkan node dengan tail.next
            node.prev = tail; // Hubungkan node.prev dengan tail
        }
        tail = node; // jadikan node sebagai tail
    }

    protected void add(int data, int index) {
        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
        } else {
            if (index == 1) {
                head.prev = node;
                node.next = head;
                head = node;
            } else {
                Node temp = head;
                int count = 1;

                while (count < index - 1) {
                    temp = temp.next;
                    count++;
                }

                // lakukan swipe linked list
                Node current = temp.next;
                temp.next = node;
                node.prev = temp;
                node.next = current;
                current.prev = node;
            }
        }
    }

    protected void deleteFirst() {
        if (isEmpty()) { // cek apakah linked list sudah kosong atau kosong
            System.out.println("------------------");
            System.out.println("Linked List Kosong");
            System.out.println("------------------");
        } else {
            Node temp = head; // buat variabel untuk menampung head

            if (head == tail) { // jika head sudah mencapai tail
                tail = null; // set tail ke null
            } else { // jika tidak
                head.next.prev = null; // putuskan jalur prev ke head
            }

            head = head.next; // pindah posisi head ke selanjutnya
            temp.next = null; // putuskan jalur temp selanjutnya
        }
    }

    protected void deleteLast() {
        if (isEmpty()) { // cek apakah head tidak ada isinya
            System.out.println("------------------");
            System.out.println("Linked List Kosong");
            System.out.println("------------------");
        } else { // jika tidak
            Node temp = tail; // buat variabel penampung head

            if (tail == head) { // jika tail sudah mencapai head
                head = null; // set head ke null
            } else { // jika tidak
                tail.prev.next = null; // putuskan jalur next ke tail
            }

            tail = tail.prev; // pindah tail ke sebelumnya
            temp.prev = null; // putuskan jalur temp sebelumnya
        }
    }

    protected void delete(int key) {
        Node current = head;
        Node temp = null;

        if (isEmpty()) {
            System.out.println("------------------");
            System.out.println("Linked List Kosong");
            System.out.println("------------------");
        } else {
            if (current.getData() == key) {
                head.next.prev = null;
                head = head.next;
                current.next = null;
            } else {
                while (current != tail && current.getData() != key) {
                    temp = current;
                    current = current.next;
                }

                temp.next = current.next;
                current.next.prev = temp;
            }
        }
    }

    protected void getMid() {
        Node slow = head;
        Node fast = head;

        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("---------------------------------");
        System.out.println("Nilai tengah adalah " + slow.getData());
        System.out.println("---------------------------------");
    }

    // print data forward (maju / next)
    protected void printForward() {
        Node temp = head;

        if (isEmpty()) {
            System.out.println("----------------");
            System.out.println("Linked List Null");
            System.out.println("----------------");
        } else {
            System.out.print("Forward: ");
            while (temp != null) {
                System.out.print(temp.getData() + " --> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // print data backward (mundur / previous)
    protected void printBackward() {
        Node temp = tail;

        if (isEmpty()) {
            System.out.println("----------------");
            System.out.println("Linked List Null");
            System.out.println("----------------");
        } else {
            System.out.print("Backward: ");
            while (temp != null) {
                System.out.print(temp.getData() + " --> ");
                temp = temp.prev;
            }
            System.out.println("null");
        }
    }
}