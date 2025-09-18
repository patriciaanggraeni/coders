package TugasKuliah.Semester3.Minggu7.Tugas.Nomor1;

public class Main {
    public static void main(String[] args) {

        // buat objek dari Class Mac, Windows dan Pc
        Pc pc = new Pc("Asus ROG", 3, 16, "Intel Core I5-7500H", 20);
        Mac mac = new Mac("Macbook Pro M1", 4, 8, "chip M1", "Li-Po", "Apple T2 Security");
        Windows windows = new Windows("Lenovo Thinkpad X260", 2, 8, "Intel Core I5-6000H", "Li-Po", "Cortana Assistant");

        // tampilkan data masing masing objek
        pc.tampilDataPc();
        mac.tampilDataMac();
        windows.tampilDataWindows();

    }
}
