package TugasKuliah.Semester3.Minggu4.Percobaan3;

public class MainPertanyaan {
    public static void main(String[] args) {

        Pegawai asisten = new Pegawai("4567", "Patrick Star");
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");

        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}


