package Project.Project1_SystemAccount.Template;

abstract public class Account {
    
    private String fullName;
    private String password;
    private String noTelp;
    private String email;

    public Account() {}

    public Account(String fullName, String password, String noTelp, String email) {
        this.fullName = fullName;
        this.password = password;
        this.noTelp = noTelp;
        this.email = email;
    }

    public abstract void accountType();

    // ---------------- buat method geter dan seter
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getNoTelp() {
        return this.noTelp;
    }

    public String getEmail() {
        return this.email;
    }
}