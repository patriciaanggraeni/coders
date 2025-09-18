package Course.D_ObjectOrientedProgramming.B_Constructor;

public class Main {
    public static void main(String[] args) {

        // instansiasi objek baru
        // jadi bisa membuat objek baru sebayak apapun dengan data yang sama
        // dianalogikan dengan tindakan menyontek
        Constructor mahasiswa1 = new Constructor("Angga","2141720058","TI");
        Constructor mahasiswa2 = new Constructor("Anggi","2141720059","MI");
        Constructor mahasiswa3 = new Constructor();

        // set data mahasiswa
        mahasiswa3.setNama("Putri Erika");
        mahasiswa3.setNim("102574839");
        mahasiswa3.setJurusan("TI");

        // agar bisa digunakan
        mahasiswa1.print();
        mahasiswa2.print();
        mahasiswa3.print();
    }
}