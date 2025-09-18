package Program.Pro.Example.Program4;

public class Queue {

    private Node front, rear;
    private int length;

    Queue() {
        this.front = this.rear = null;
        this.length = 0;
    }

    private boolean isEmpty() {
        return length == 0;
    }

    protected int getLength() {
        return this.length;
    }

    protected void getFront() {
        if (isEmpty()) {
            System.out.println("\n---------------------");
            System.out.println("Antrian masih kosong!");
            System.out.println("---------------------\n");
        } else {
            System.out.println("------- Data Antrian Teratas -------\n");
            System.out.println("Nama  : " + front.getNama());
            System.out.println("Nim   : " + front.getNim());
            System.out.println("Absen : " + front.getAbsen());
            System.out.println("Ipk   : " + front.getIpk());
            System.out.println("------------------------------------\n");
        }
    }

     protected void getRear() {
        if (isEmpty()) {
            System.out.println("\n---------------------");
            System.out.println("Antrian masih kosong!");
            System.out.println("---------------------\n");
        } else {
            System.out.println("------- Data Antrian Terbawah -------\n");
            System.out.println("Nama  : " + rear.getNama());
            System.out.println("Nim   : " + rear.getNim());
            System.out.println("Absen : " + rear.getAbsen());
            System.out.println("Ipk   : " + rear.getIpk());
            System.out.println("-------------------------------------\n");
        }
    }

    protected void getPosition(String nim) {

        if (isEmpty()) {
            System.out.println("\n------------------------------------------");
            System.out.println("Tidak ada antrian, antrian tidak ditemukan");
            System.out.println("------------------------------------------\n");
        } else {
            Node temp = front;
            int count = 0;

            while (temp != null) {
                if (temp.getNim().equals(nim)) {
                    System.out.println("\n------------------------------------------------");
                    System.out.println("Nim berhasil ditemukan!\n");
                    System.out.printf("\nNim %s berada di antrian ke-%d\n", temp.getNim(), (++count + 1));
                    System.out.println("------------------------------------------------\n");
                    break;
                }
                temp = temp.next;

                if (temp == null) {
                    System.out.println("\n------------------------------");
                    System.out.println("Nim tidak ditemukan di antrian");
                    System.out.println("------------------------------\n");
                    break;
                }
            }
        }
    }

    protected void printMahasiswa(int index) {
        if (isEmpty()) {
            System.out.println("\n------------------------------------------");
            System.out.println("Tidak ada antrian, antrian tidak ditemukan");
            System.out.println("------------------------------------------\n");
        } else {

            if (index > getLength()) {
                System.out.println("\n------------------------------");
                System.out.println("Index melebihi panjang antrian");
                System.out.println("------------------------------\n");
            } else {
                Node temp = front;
                int count = 0;

                while (count <= index) {
                    count++;

                    if (count == index) {
                        System.out.println("\n----- Data Antrian Mahasiswa -----\n");
                        System.out.println("Nama  : " + temp.getNama());
                        System.out.println("Nim   : " + temp.getNim());
                        System.out.println("Absen : " + temp.getAbsen());
                        System.out.println("Ipk   : " + temp.getIpk());
                        System.out.println("Antrian ke-" + index);
                        System.out.println("----------------------------------\n");
                        break;
                    }
                    temp = temp.next;
                }
            }
        }
    }

    protected void enqueue(Node data) {

        if (isEmpty()) {
            front = data;
        } else {
            rear = data;

            while (front.next != null) {
                front = front.next;
            }
            front.next = rear;
        }

        System.out.println("\n----------------------------------");
        System.out.println("Data antrian berhasil ditambahkan!");
        System.out.println("----------------------------------\n");
        length++;
    }

    protected void dequeue() {

        if (isEmpty()) {
            System.out.println("\n---------------------");
            System.out.println("Antrian masih kosong!");
            System.out.println("---------------------\n");
        } else {
            if (front == null) {
                rear = null;
            } else {
                Node temp = front;

                System.out.println("\n------------------------------------");
                System.out.println("Nama  : " + temp.getNama());
                System.out.println("Nim   : " + temp.getNim());
                System.out.println("Absen : " + temp.getAbsen());
                System.out.println("Ipk   : " + temp.getIpk());
                System.out.println("\nData antrian berhasil dihapus!");
                System.out.println("------------------------------------\n");
                front = front.next;
            }
            length--;
        }
    }

    protected void print() {
        if (isEmpty()) {
            System.out.println("\n---------------------");
            System.out.println("Antrian masih kosong!");
            System.out.println("---------------------\n");
        } else {
            Node temp = front;

            System.out.println("\n----------------------------");
            System.out.println("Daftar antrian KRS Mahasiswa");
            System.out.println("----------------------------");
            while (temp != null) {
                System.out.println("Nama  : " + temp.getNama());
                System.out.println("Nim   : " + temp.getNim());
                System.out.println("Absen : " + temp.getAbsen());
                System.out.println("Ipk   : " +temp.getIpk());
                System.out.println(" ");
                temp = temp.next;
            }
            System.out.println("----------------------------\n");
        }
    }
}
