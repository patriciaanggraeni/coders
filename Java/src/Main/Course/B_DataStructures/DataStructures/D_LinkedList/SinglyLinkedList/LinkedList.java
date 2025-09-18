package Course.B_DataStructures.DataStructures.D_LinkedList.SinglyLinkedList;

public class LinkedList {

    Node head, tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    private boolean isEmpty() {
        return head == null && tail == null;
    }

    // ----- Menambahkan node di awal linked list
    protected void addFirst(int data) {
        if (isEmpty()) {

            head = new Node(data); // isi head dengan data yang dimasukkan
        } else {
            Node node = new Node(data);  // buat object baru

            node.next = head; // hubungkan nextnya dengan head
            head = node; // ganti data yang input menjadi head
        }
    }

    // algoritma satu
    protected void addLast(int data) {
        if (isEmpty()) {
            head = new Node(data); // isi head dengan data yang diinput
        } else {
            Node node = new Node(data); // buat objek baru (jika kondisi if salah)
            Node current = head; // buat variabel yang menampung head

            // lakukan kunjungan data
            while (current.next != null) { // selama nextnya tidak null
                current = current.next; // lakukan kunjungan data disetiap node
            }

            // jika nextnya sudah null (mencapai akhir linked list)
            current.next = node; // hubungkan next dengan node
        }
    }

    // algortima dua
    protected void addLastV2(int data) {
        if (isEmpty()) {
            head = new Node(data);
            tail = head;
        } else {
            Node node = new Node(data);

            tail.next = node;
            tail = node;
        }
    }

    protected void add(int data, int index) {
        if (isEmpty()) {
            head = new Node(data); // jika head masih kosong, tambahkan node baru
        } else {
            Node node = new Node(data); // buat objek baru

            if (index == 1) { // buat kondisi jika mengisi pada index satu
                node.next = head; // sambungkan next dengan head
                head = node; // jadikan node sebagai head
            } else { // jika menginputkan index selain 1
                Node prev = head; // buat variabel prev yang menampung head
                int count = 1; // buat variabel count dimulai dari satu

                while (count < index - 1) { // selama count lebih kecil dari index - 1
                    prev = prev.next; // lakukan kunjungan data
                    count++; // tambahkan nilai count
                }

                // jika kondisi while sudah tidak terpenuhi
                Node current = prev.next; // buat variabel untuk menampung nilai next dari prev
                prev.next = node; // sambungkan next dari prev ke node (data yang masuk)
                node.next = current; // hubungkan next dengan current (yang didalamnya ada prev.next)
            }
        }
    }

    protected void removeFirst() {
        if (isEmpty()) { // jika kosong, tampilkan pesan bahwa linked masih kosong
            System.out.println(" ");
            System.out.println("------------------");
            System.out.println("Linked list Kosong");
            System.out.println("------------------");
        } else {
            Node current = head; // buat variabel untuk menampung head (current sekarang ada di head)

            head = head.next; // ganti posisi head ke nextnya
            current.next = null; // putus jalur node (current) yang mengarah ke head (baru)
            System.out.println(" ");
            System.out.println("---------------------");
            System.out.println("Data berhasil dihapus");
            System.out.println("---------------------");
        }
    }

    protected void removeLast() {
        if (isEmpty()) { // jika kosong, tampilkan pesan bahwa linked masih kosong
            System.out.println(" ");
            System.out.println("------------------");
            System.out.println("Linked list Kosong");
            System.out.println("------------------");
        } else { // jika tidak kosong
            Node current = head; // tampung head di variabel
            Node temp = null; // buat variabel dengan nilai null

            while (current.next != null) { // lakukan kunjungan data nextnya
                temp = current; // taruh data current ke temp
                current = current.next; // lanjutkan kunjungan data
            }

            // jika konsdisi while false (next == null)
            temp.next = null; // hapus link (temp.next) yang mengarah ke current
            System.out.println(" ");
            System.out.println("---------------------");
            System.out.println("Data berhasil dihapus");
            System.out.println("---------------------");
        }
    }

    protected void removeKey(int key) {
         if (isEmpty()) { // jika kosong, tampilkan pesan bahwa linked masih kosong
            System.out.println(" ");
            System.out.println("------------------");
            System.out.println("Linked list Kosong");
            System.out.println("------------------");
        } else {
             Node current = head; // tampung head di variabel
             Node temp = null; // buat variabel dengan nilai null

             if (current.getData() == key) { // jika data head sama dengan key
                 current = current.next; // ganti posisi current ke next
                 head = current; // ubah current menjadi head
             } else { // jika tidak
                 while (current != null && (current.getData() != key)) { // selama current tidak null dan data tidak sama dengan key
                     temp = current; // isi variabel temp dengan current
                     current = current.next; // lakukan kunjungan data
                 }

                 // jika kondisi while false
                 temp.next = current.next; // hubungkan temp.next dengan current.nextnya
                 System.out.println(" ");
                 System.out.println("---------------------");
                 System.out.println("Data berhasil dihapus");
                 System.out.println("---------------------");
             }
        }
    }

    public void reverse() {
        if (isEmpty()) { // jika kosong, tampilkan pesan bahwa linked masih kosong
            System.out.println(" ");
            System.out.println("------------------");
            System.out.println("Linked list Kosong");
            System.out.println("------------------");
        } else {
            Node current = head; // set current di head
            Node prev = null; // isi prev dengan null
            Node next = null; // dan next juga

            while (current != null) { // selama data tidak null
                next = current.next; // pindah next ke current.next
                current.next = prev; // putus link dengan mengset current.next dengan prev (null)
                prev = current; // pindah prev ke current
                current = next; // pindah current ke next
            }
        }
    }

    public void getMid() {
         if (isEmpty()) { // jika kosong, tampilkan pesan bahwa linked masih kosong
            System.out.println(" ");
            System.out.println("------------------");
            System.out.println("Linked list Kosong");
            System.out.println("------------------");
        } else {

             // buat dua variabel yang menampung nilai head
             Node lowPtr = head;
             Node fastPtr = head;

             // fast != null dan fast.next != null
             while (fastPtr != null && fastPtr.next != null) {
                 lowPtr = lowPtr.next; // kunjungi data low
                 fastPtr = fastPtr.next.next; // loncati satu data di fast
             }

             System.out.println("---------------------------------");
             System.out.println("Nilai tengah: " + lowPtr.getData());
             System.out.println("---------------------------------");
         }
    }

    public void findNth(int n) {

        if (n <= 0) {
            System.out.println("-------------");
            System.out.println("Nilai invalid");
            System.out.println("-------------");
        } else {
            if (isEmpty()) { // jika kosong, tampilkan pesan bahwa linked masih kosong
                System.out.println(" ");
                System.out.println("------------------");
                System.out.println("Linked list Kosong");
                System.out.println("------------------");
            } else {

                // buat dua variabel menampung nilai head
                Node ref = head;
                Node main = head;
                int count = 0; // buat variabel count

                while (count < n) { // while pertama dengan kondisi count < n
                    if (ref.next == null) { // jika ref.nextnya null, maka nilai n di luar batas linked list
                        System.out.println("-------------------------");
                        System.out.println("di luar batas linked list");
                        System.out.println("-------------------------");
                    } else { // jika tidak
                        ref = ref.next; // lakukan kunjungan ref
                        count++; // tambah nilai count
                    }
                }

                while (ref != null) { // lakukan kunjungan data jika ref != null
                    ref = ref.next; // lakukan kunjungan data
                    main = main.next; // beserta mainnya
                }

                // tampilkan hasil yang didapat
                System.out.println("------------------------------------------------------");
                System.out.printf("Data %d urutan ke %d dari belakang\n", main.getData(), n);
                System.out.println("------------------------------------------------------");
            }
        }
    }

    public int getLenght() {
        Node temp = head; // buat variabel penampung head
        int count = 0; // buat variabel count (dimulai dari nol)

        if (isEmpty()) {
            return count; // return nol
        } else {
            while (temp != null) { // lakukan kunjungan data
                temp = temp.next; // lanjut dari head sampai akhir node
                count++; // tambahkan nilai count
            }
        }
        return count; // return nilai count
    }

    protected void print() {
        if (isEmpty()) { // cek apakah nilai head == null
            System.out.println(" ");
            System.out.println("------------------");
            System.out.println("Linked list Kosong");
            System.out.println("------------------");
        } else { // jika tidak
            Node temp = head; // buat variabel penampung nilai head

            while (temp != null) { // lakukan kunjungan data
                System.out.print(temp.getData() + " --> ");  // tampilkan data
                temp = temp.next; // lanjut ke data setelahnya
            }

            System.out.print("null");
            System.out.println(" ");
        }
    }
}

