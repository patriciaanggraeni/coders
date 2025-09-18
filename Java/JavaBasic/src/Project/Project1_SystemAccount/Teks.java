package Project.Project1_SystemAccount;

public class Teks {
    
    public Teks() {}

    // -------------------------------------------------------------- pembuka program
    public static void homeMenu() {

            System.out.println("""
                
                -------------------------------------------------------
                --- Sistem Akun menggunakan Bahasa Pemrograman Java ---
                ----------------------- Projek 1 ----------------------
                -------------------------------------------------------

                Silahkan Memilih Menu:
                    1. Login / Register sebagai Admin
                    2. Login / Register sebagai User
                    3. Keluar dari Program

                -------------------------------------------------------""");
    }

    public static void adminMenu() {
        System.out.println("""
            
            -----------------------------
            ------ Menu Akun Admin ------
            -----------------------------
            
                1. Register Akun
                2. Login Akun
                3. Pengaturan
                4. Kembali
                
            -----------------------------""");
    }

    public static void logoutAccountAdminSuccessfuly() {
        System.out.println("\n--------------------------------------------");
        System.out.println("--- Anda berhasil logout dari Akun Admin ---");
        System.out.println("--------------------------------------------");
    }

    public static void isLoginedAsAdmin() {
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("--- Anda sudah Login sebelumnya, harap Logout terlebih dahulu ---");
        System.out.println("-----------------------------------------------------------------");
    }

    public static void isLogoutedAsAdmin() {
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("--- Anda belum Login sebelumnya, harap Login terlebih dahulu ---");
        System.out.println("-----------------------------------------------------------------");
    }

    // -------------------------------------------------------------- buat admin
    public static void adminNameIsEmpty() {
        System.out.println("\n--------------------------------------");
        System.out.println("--- Nama Admin tidak boleh kosong! ---");
        System.out.println("---------------------------------------\n");
    }

    public static void checkDataLoginValidation() {
        System.out.println("\n-------------------------------------");
        System.out.println("--- Username atau Password salah! ---");
        System.out.println("-------------------------------------");
    }

    public static void loginSuccessfuly(String myAdmin) {
        System.out.println("\n----------------------------------");
        System.out.println("--- Login Akun Admin Berhasil! ---");
        System.out.println("----------------------------------\n");
        System.out.printf("Selamat datang %s\n", myAdmin);
        System.out.println("----------------------------------");
    }

    public static void formLoginAdmin() {
        System.out.println("\n---------------------------------------------");
        System.out.println("----------- FORM LOGIN AKUN ADMIN -----------");
        System.out.println("---------------------------------------------\n");
    }

    public static void textRegAdmin() {
        System.out.println("-----------------------------------------------");
        System.out.println("---------- FORM REGISTER AKUN ADMIN -----------");
        System.out.println("-----------------------------------------------");
    }

    public static void textEmptyAdminAccount() {
        System.out.println("\n--------------------------------------------------");
        System.out.println("--------- Daftar Akun Admin masih kosong ---------");
        System.out.println("--------------------------------------------------");
    }

    public static void listAdminAccount() {
        System.out.println("----------------------------------------------------");
        System.out.println("----- DAFTAR AKUN ADMIN YANG TELAH REGISTRASI ------");
        System.out.println("----------------------------------------------------");
    }

    public static void adminNameNotFound() {
        System.out.println("\n------------------------------------------------------------");
        System.out.println("--- Mohon maaf, Nama Admin yang anda cari tidak tersedia ---");
        System.out.println("------------------------------------------------------------\n");
    }

    // -------------------------------------------------------------- buat user
    public static void userNameisEmpty() {
        System.out.println("\n-------------------------------------");
        System.out.println("--- Nama User tidak boleh kosong! ---");
        System.out.println("-------------------------------------\n");
    }

    public static void formLoginterUser() {
        System.out.println("--------------------------------------------");
        System.out.println("----------- FORM LOGIN AKUN USER -----------");
        System.out.println("--------------------------------------------");
    }

    public static void textEmptyUserAccount() {
        System.out.println("-------------------------------------------------");
        System.out.println("--------- Daftar Akun User masih kosong ---------");
        System.out.println("-------------------------------------------------");
    }

    public static void formRegisterUser() {
        System.out.println("-------------------------------------------------");
        System.out.println("----------- FORM REGISTRASI AKUN USER -----------");
        System.out.println("-------------------------------------------------");
    }

    public static void listUserAccount() {
        System.out.println("----------------------------------------------------");
        System.out.println("----- DAFTAR AKUN USER YANG TELAH REGISTRASI -------");
        System.out.println("----------------------------------------------------");
    }

    public static void userNameNotFound() {
        System.out.println("\n----------------------------------------------------------");
        System.out.println("--- Mohon maaf, username yang anda cari tidak tersedia ---");
        System.out.println("----------------------------------------------------------\n");
    }


    // -------------------------------------------------------------- buat umum
    public static void accessVisibility() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("---- Akun Bertipe USER tidak bisa mengakses daftar akun! ----");
        System.out.println("-------------------------------------------------------------");
    }

    public static void noData() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("--- Maaf untuk saat ini tidak bisa menampilkan list akun yang terdaftar ---");
        System.out.println("------------------ Silahkan daftar akun terlebih dahulu! ------------------");
        System.out.println("---------------------------------------------------------------------------");
    }


    // -------------------------------------------------------------- validasi akun
    public static void usernameLebihDari15Karakter() {
        System.out.println("\n------------------------------------------------");
        System.out.println("Untuk username tidak bisa lebih dari 16 karakter");
        System.out.println("-------------------------------------------------\n");
    }

    public static void fullNameIsEmpty() {
        System.out.println("\n----------------------------------------");
        System.out.println("--- Nama Lengkap tidak boleh kosong! ---");
        System.out.println("----------------------------------------\n");
    }

    public static void passVeryShort() {
        System.out.println("\n----------------------------------------------------");
        System.out.println("--- Password minimal harus mempunyai 8 karakter! ---");
        System.out.println("-----------------------------------------------------\n");
    }

    public static void passwordIsEmpty() {
        System.out.println("\n------------------------------------");
        System.out.println("--- Password tidak boleh kosong! ---");
        System.out.println("------------------------------------\n");
    }

    public static void passwordNotMatch() {
        System.out.println("\n----------------------------------------------");
        System.out.println("--- Password yang kamu masukkan tidak sama ---");
        System.out.println("----------------------------------------------\n");
    }

    public static void noValidTelph() {
        System.out.println("\n------------------------------------------------------");
        System.out.println("--- Nomor telephone yang Anda masukkan tidak valid ---");
        System.out.println("------------------------------------------------------\n");
    }

    public static void noTelphIsEmpty() {
        System.out.println("\n-------------------------------------------");
        System.out.println("--- Nomor telephone tidak boleh kosong! ---");
        System.out.println("-------------------------------------------\n");
    }

    public static void noValidEmail() {
        System.out.println("\n---------------------------------------------");
        System.out.println("--- Email yang Anda masukkan tidak valid! ---");
        System.out.println("---------------------------------------------\n");
    }

    public static void emailIsEmpty() {
        System.out.println("\n---------------------------------");
        System.out.println("--- Email tidak boleh kosong! ---");
        System.out.println("---------------------------------\n");
    }
}
            