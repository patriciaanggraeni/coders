package Course.D_ObjectOrientedProgramming.K_Interface;

public class Main implements Orang {

    private byte umur;
    private String nama, hobi, alamat;
    
    @Override
    public String nama(String nama) {
        this.nama = nama;
        return this.nama;
    }

    @Override
    public byte umur(byte umur) {
        this.umur = umur;
        return this.umur;
    }

    @Override
    public String hobi(String hobi) {
        this.hobi = hobi;
        return this.hobi;
    }

    @Override
    public String alamat(String alamat) {
        this.alamat = alamat;
        return this.alamat;
    }

    public static void main(String[] args) {
        
        Main main = new Main();

    }
}
