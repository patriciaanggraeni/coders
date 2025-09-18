package Project.Project3_Inventory.Template;

public abstract class Akun {

    private String namaLengkap;
    private String admin;
    private String password;
    private String nomorTelephone;
    private String alamatEmail;

    public Akun() {}

    public Akun(String namaLengkap, String admin, String password, String nomorTelephone, String alamatEmail) {
        this.namaLengkap = namaLengkap;
        this.admin = admin;
        this.password = password;
        this.nomorTelephone = nomorTelephone;
        this.alamatEmail = alamatEmail;
    }

    public abstract void fungsi();

    public String getNamaLengkap() {
        return this.namaLengkap;
    }

    public String getAdmin() {
        return this.admin;
    }

    public String getPassword() {
        return this.password;
    }

    public String getNomorTelephone() { return this.nomorTelephone; }

    public String getAlamatEmail() {
        return this.alamatEmail;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNomorTelephone(String nomorTelephone) {
        this.nomorTelephone = nomorTelephone;
    }

    public void setAlamatEmail(String alamatEmail) {
        this.alamatEmail = alamatEmail;
    }
}
