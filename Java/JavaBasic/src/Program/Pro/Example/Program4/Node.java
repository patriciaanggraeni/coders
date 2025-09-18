package Program.Pro.Example.Program4;

public class Node {

    private final String nama, nim;
    private final int absen;
    private final double ipk;
    Node next;

    Node(String nama, String nim, int absen, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.absen = absen;
        this.ipk = ipk;
        this.next = null;
    }

    protected String getNama() {
        return this.nama;
    }

    protected String getNim() {
        return this.nim;
    }

    protected int getAbsen() {
        return this.absen;
    }

    protected double getIpk() {
        return this.ipk;
    }
}
