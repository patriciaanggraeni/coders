package Program.Midle.Queues.Program1;

public class Queue {

    private int size;
    Mahasiswa[] mahasiswa;
    private int front, rear;
    private final int length;

    Queue(int n) {
        this.size = 0;
        this.length = n;
        this.front = this.rear = 1;
        mahasiswa = new Mahasiswa[length];
    }

    private int getSize() {
        return this.size;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == length;
    }

    protected void getFront() {
        if (isEmpty()) {
            System.out.println("\n---------------");
            System.out.println("Antrian kosong!");
            System.out.println("---------------");
        } else {
            System.out.println("\n----- Peek Data Antrian Mahasiswa -----");
            System.out.println("Nama : " + mahasiswa[front].getNama());
            System.out.println("Nim  : " + mahasiswa[front].getNim());
            System.out.println("Absen: " + mahasiswa[front].getAbsen());
            System.out.println("Ipk  : " + mahasiswa[front].getIpk());
            System.out.println("---------------------------------------");
        }
    }

    protected void getRear() {
        if (isEmpty()) {
            System.out.println("\n---------------");
            System.out.println("Antrian kosong!");
            System.out.println("---------------");
        } else {
            System.out.println("\n----- Peek Rear Data Antrian Mahasiswa -----");
            System.out.println("Nama : " + mahasiswa[rear].getNama());
            System.out.println("Nim  : " + mahasiswa[rear].getNim());
            System.out.println("Absen: " + mahasiswa[rear].getAbsen());
            System.out.println("Ipk  : " + mahasiswa[rear].getIpk());
            System.out.println("--------------------------------------------");
        }
    }

    protected void peekPosistion(String nim) {

        if (isEmpty()) {
            System.out.println("\nAntrian kosong!");
        } else {

            for (int i = 0; i <= rear; i++) {
                if (mahasiswa[i].getNim().equals(nim)) {
                    System.out.print("\nNim: " + mahasiswa[i].getNim());
                    System.out.println(" " + "berada di antrian ke-" + (i+1));
                    return;
                }
            }

            System.out.println("Data Nim tidak ditemukan");
        }
    }

    protected void enqueue(Mahasiswa data) {
        if (isFull()) {
            System.out.println("\n--------------------");
            System.out.println("Antrian sudah penuh!");
            System.out.println("--------------------\n");
        } else {

            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == length - 1) {
                    rear = 0;
                } else {
                    ++rear;
                }
            }
            mahasiswa[rear] = data;
            ++size;

            System.out.println("\n----------------------------------------");
            System.out.println("Antrian mahasiswa berhasil ditambahkan!");
            System.out.println("----------------------------------------\n");
        }
    }

    protected Mahasiswa dequeue() {
        Mahasiswa temp = new Mahasiswa();

        if (isEmpty()) {
            System.out.println("\n---------------");
            System.out.println("Antrian kosong!");
            System.out.println("---------------");
        } else {
            temp = mahasiswa[front];
            --size;

            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == length - 1) {
                    front = 0;
                } else {
                    ++front;
                }
            }
            System.out.println("\n-----------------------------------");
            System.out.println("Antrian mahasiswa berhasil dihapus!");
            System.out.println("-----------------------------------");
        }
        return temp;
    }

    protected void printMahasiswa(int index) {
        if (isEmpty()) {
            System.out.println("\nAntrian kosong!");
        } else {
            for (int i = 0; i <= rear; i++) {
                if ((i+1) == index) {
                    System.out.println(" ");
                    System.out.println("Nama : " + mahasiswa[i].getNama());
                    System.out.println("Nim  : " + mahasiswa[i].getNim());
                    System.out.println("Absen: " + mahasiswa[i].getAbsen());
                    System.out.println("Ipk  : " + mahasiswa[i].getIpk());
                    return;
                }
            }
            System.out.println("\n-------------------------");
            System.out.println("Daftar antrian tidak ada!");
            System.out.println("-------------------------\n");
        }
    }

    protected void print() {
        if (isEmpty()) {
            System.out.println("\n---------------");
            System.out.println("Antrian kosong!");
            System.out.println("---------------\n");
        } else {

            int i = 0;
            System.out.println("\n----- Daftar antrian mahasiswa -----");
            while (i <= rear) {
               System.out.println("Nama : " + mahasiswa[i].getNama());
               System.out.println("Nim  : " + mahasiswa[i].getNim());
               System.out.println("Absen: " + mahasiswa[i].getAbsen());
               System.out.println("Ipk  : " + mahasiswa[i].getIpk());
               System.out.println(" ");
                i++;
            }
        }
        System.out.println("Jumlah antrian: " + getSize());
        System.out.println("----------------------------------");
    }
}
