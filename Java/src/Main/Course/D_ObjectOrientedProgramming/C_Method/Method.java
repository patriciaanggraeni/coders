package Course.D_ObjectOrientedProgramming.C_Method;

public class Method {
    public String nama;
    private String password;

    Method(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }

    // 1. Method void tanpa parameter
    // 2. Method void dengan parameter
    // 3. Method return tanpa parameter
    // 4. Method return dengan parameter
    void setPassword(String password) {
        this.password = password;
        System.out.println("Password berhasil dirubah!");
    }

    String getPaswword() {
        return this.password;
    }

    void print() {
        System.out.println("Nama: " + nama);
        System.out.println("Password: " + password);
    }
}