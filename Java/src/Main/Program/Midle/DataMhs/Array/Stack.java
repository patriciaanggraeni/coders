package Program.Midle.DataMhs.Array;

public class Stack extends Struk {

    private Struk[] struk;
    private int top, size;

    Stack() {}

    Stack(int n) {
        this.top = -1;
        this.size = n;
        struk = new Struk[size];
    }

    Stack(String no, String tgl, int jumlah, double total) {
       super(no, tgl, jumlah, total);
    }

    public void methodAbstrak() {}

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == size - 1;
    }

    // membuat method push
    protected void push(Struk data) {

        if (isFull()) {
            System.out.println("\n-----------------");
            System.out.println("Stack sudah penuh");
            System.out.println("-----------------\n");
        } else {
            struk[++top] = data;
            System.out.println("\n---------------------------------");
            System.out.println("Data struk berhasil ditambahkan");
            System.out.println("---------------------------------\n");
        }
        size++;
    }

    protected void pop() {
        Struk data;

        if (isEmpty()) {
            System.out.println("------------------");
            System.out.println("Stack sudah kosong");
            System.out.println("------------------");
        } else {
            data = struk[top];
            top--;

            System.out.println("-----------------------------");
            System.out.println("No. Transaksi: " + data.getNoTransaksi());
            System.out.println("Tanggal Transaksi: " + data.getTanggalPembelian());
            System.out.println("Jumlah pembelian: " + data.getJumlahPembelian());
            System.out.println("Harga: " + data.getHarga());
            System.out.println("Total bayar: " + data.getTotal());

            System.out.println("\nData berhasil dihapus!");
            System.out.println("----------------------------\n");
        }
    }

    protected Struk peek() {
        return struk[top];
    }

    protected void printPeek() {
        System.out.println("-------- Data Peek --------");
        System.out.println("No. Trans: " + peek().getNoTransaksi());
        System.out.println("Tanggal: " + peek().getTanggalPembelian());
        System.out.println("Jumlah: " + peek().getJumlahPembelian());
        System.out.println("Harga: " + peek().getHarga());
        System.out.println("Total Bayar: " + peek().getTotal());
        System.out.println("---------------------------\n");
    }

    protected void print() {
        if (isEmpty()) {
            System.out.println("--------------------");
            System.out.println("Data Struk tidak ada");
            System.out.println("--------------------");
        } else {

            System.out.println("--------------------------\n");
            for (int i = top; i >= 0; i--) {
                System.out.println("No. Trans: " + struk[i].getNoTransaksi());
                System.out.println("Tanggal: " + struk[i].getTanggalPembelian());
                System.out.println("Jumlah: " + struk[i].getJumlahPembelian());
                System.out.println("Harga: " + struk[i].getHarga());
                System.out.println("Total bayar: " + struk[i].getTotal());
                System.out.println(" ");
            }
            System.out.println("--------------------------\n");
        }
    }
}