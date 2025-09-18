package Course.D_ObjectOrientedProgramming.Other.RecordClass;


// class record tidak bisa diturunkan ke class lainnya
// secara default, class record sudah final
public record Akun(String username, String password) {

    public Akun {
        System.out.println("Ini adalah konstraktor class record");
    }

    public Akun(String username) {
        this(username, "hello world");
    }
    
    public Akun() {
        this("Susilo", "54321");
    }

}
