package TugasKuliah.Semester3.Minggu11.Percobaan2;

public class Sarjana extends Mahasiswa implements IBerprestasi {
    
    public Sarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        // throw new UnsupportedOperationException("Not Supported yet.");
    }

    @Override
    public void meraihIpkTertinggi() {
        // throw new UnsupportedOperationException("Not Suppoted yet.");
    }

    // mengoverride method menjuaraiKompetisi dan membuatPulbikasiIlmiah, dan rubah isinya
    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }

}
