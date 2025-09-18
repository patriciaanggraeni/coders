package Course.D_ObjectOrientedProgramming.K_Interface.Multiple;

public class Child implements Parent2 {

    // jika inherit semasama kelas interface, maka menggunakan keyword extends
    // jika dengan kelas turunannya, menggunakan keyword implements
    // default keyword di interface adalah public, abstract (method)
    // default member class di interface adalah public, static, final (property)

    // ya analogikan aja, class interface itu seperti kontrak, kita hanya membuat asli hanya blue printnya saja, jadi tidak bisa di intansiasi menjadi objek
    // tidak sama dengan class abstrak yang mana di dalamnya ada method concrete, di interface semua method bersifat tidak concrete

    @Override
    public String getNama() {
        return Parent2.nama;
    }

    @Override
    public byte getUmur() {
        return Parent2.umur;
    }

    public static void main(String[] args) {

        Child child = new Child();
        System.out.println("Nama: " + child.getNama());
        System.out.println("Umur: " + child.getUmur());

    }

    /*
     * tips menggunakan class interface
     * 
     * - gunakan jika objek yang ingin dibuat memiliki perilaku yang sama
     * - gunakan jika hanya ingin membuat asli sebuah blue print
     * - gunakan jika memang diperlukan
     * 
     */
}
