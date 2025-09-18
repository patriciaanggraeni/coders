package Project.Project1_SystemAccount.Admin;

import Project.Project1_SystemAccount.Template.Account;

public abstract class Admin extends Account {
    
    private String adminName;
    private String verifyAdminPass;
    private final String accountType = "ADMIN";
    public Admin next, prev;

    public Admin() {}

    public Admin(String fullName, String adminName, String adminPass, String verifyAdminPass, String noTelp, String email) {
        super(fullName, adminPass, noTelp, email);
        this.adminName = adminName;
        this.verifyAdminPass = verifyAdminPass;
        this.next = null;
        this.prev = null;
    }

    public void accountType() {
        System.out.println("Tipe akun: " + this.accountType);
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAccountType() { return this.accountType; }

    public String getAdminName() {
        return this.adminName;
    }

    @Override
    public String getPassword() {
        return this.verifyAdminPass;
    }

}
