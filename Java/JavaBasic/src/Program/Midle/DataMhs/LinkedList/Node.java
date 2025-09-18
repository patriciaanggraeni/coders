package Program.Midle.DataMhs.LinkedList;

public class Node {

    private String nama, nim, status;
    private float ipk;
    Node next;

    Node() {}

    Node(String nama, String nim, float ipk, String status) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.status = status;
        this.next = null;
    }

    String getNama() {
        return this.nama;
    }

    String getNim() {
        return this.nim;
    }

    float getIpk() {
        return this.ipk;
    }

    String getStatus() {
        return this.status;
    }
}
