package Project.Project3_Inventory.Message;

public class Message {

    public Message() {}

    public void menuAwal() {
        System.out.println("""
            
            ==============================================
            ===== PROJECT AKHIR SEMESTER 1 - REMAKE ======
            ========== PROGRAM INVENTORY - 2022 ==========
            ==============================================
            
            Login atau Daftar Akun terlebih dahulu!
                1. Login Akun
                2. Register Akun
                3. Pengaturan Akun
                4. Ke Database Produk
                5. Keluar
                
            ==============================================""");
    }

    public void menuPengaturan() {
        System.out.println("""
            
            ======================================
            ===== Menu Pengaturan Akun Admin =====
            ======================================
            
            Mau ngapain?
                1. Ganti Nama Admin
                2. Ganti Nomor Telephone
                3. Ganti Alamat Email
                4. Lihat Daftar Akun Admin
                5. Hapus Akun
                6. Logout
                7. Kembali
            
            ======================================""");
    }

    public void menuDataBase() {

        System.out.println("""
        
        >>>>>>>>>> SELAMAT DATANG <<<<<<<<<<
        ====================================
        ===== GUDANG SUMBER JAYA ABADI =====
        ====================================
        
        Harap Pilih Sesuai Pilihan!
            1. Data Barang
            2. Barang Masuk
            3. Barang Keluar
            4. Barang Rusak
            5. Pencarian Barang
            6. Laporan
            7. Beranda
        
        ====================================""");
    }


    public void daftarAkunAdmin() {
        System.out.println("""
            
            ======================================================
            ===== Daftar Akun Admin yang telah Teregistrasi ======
            ======================================================""");
    }

    public void jumlahAkunAdmin(int jumlah) {
        System.out.println("\nJumlah Akun Teregistrasi : " + jumlah);
        System.out.println("======================================================");
    }

    public void formRegistrasiAkun() {
        System.out.println("""
            
            ==========================================
            ===== Formulir Registrasi Akun Admin =====
            ==========================================
            """);
    }

    public void formLoginAkun() {
        System.out.println("""
            
            =====================================
            ===== Formulir Masuk Akun Admin =====
            =====================================
            """);
    }

    public void daftarAkunBerhasil() {
        System.out.println("""
            
            Registrasi Akun Admin Berhasil!
            ========================================""");
    }

    public void masukAkunGagal() {
        System.out.println("""
            
            ============================================================
            === tidak dapat Masuk ke Akun. Nama atau Password Salah! ===
            ============================================================""");
    }

    public void belumAdaData() {
        System.out.println("""
            
            ===============================================================================
            === Belum ada Data Akun Admin Sebelumnya, Silahkan Register terlebih dahulu ===
            ===============================================================================""");
    }

    public void masukAkunBerhasil() {
        System.out.println("""
            
            Masuk Akun Admin Berhasil!
            =====================================
            """);
    }

    public void konfirmasiKeluarAkun() {
        System.out.println("""
            
            =======================================
            ===== Konfirmasi Keluar dari Akun =====
            =======================================
            """);
    }

    public void berhasilKeluarAkun() {
        System.out.println("""
            
            =================================
            ===== Berhasil keluar Akun! =====
            =================================
            """);
    }

    public void sudahMasukAkun() {
        System.out.println("""
            
            =========================================================================
            === Anda sudah masuk Akun sebelumnya, silahkan Keluar terlebih dahulu ===
            =========================================================================""");
    }

    public void belumMasukAkun() {
        System.out.println("""
            
            ==========================================================================
            ===== Anda belum masuk sebelumnya, harap masuk akun terlebih dahulu! =====
            ==========================================================================
            """);
    }

    public void namaLengkapKosong() {
        System.out.println("""
            
            ============================================
            ===== Nama Lengkap tidak boleh kosong! =====
            ============================================
            """);
    }

    public void idAdminKosong() {
        System.out.println("""
            
            ========================================
            ===== ID Admin tidak boleh kosong! =====
            ========================================
            """);
    }

    public void adminKosong() {
        System.out.println("""
            
            ===========================================
            ===== Kolom Admin tidak boleh kosong! =====
            ===========================================
            """);
    }

    public void passwordKosong() {
        System.out.println("""
            
            ========================================
            ===== Password tidak boleh kosong! =====
            ========================================
            """);
    }

    public void passwordKurangKuat() {
        System.out.println("""
            
            =======================================================
            ===== Password minimal harus mempunyai 8 karakter =====
            =======================================================
            """);
    }

    public void nomorTelpTidakValid() {
        System.out.println("""
            
            ========================================
            ===== Nomor Telephone tidak valid! =====
            ========================================
            """);
    }

    public void nomorTelpKosong() {
        System.out.println("""
            
            ===============================================
            ===== Nomor Telephone tidak boleh kosong! =====
            ===============================================
            """);
    }

    public void alamatEmailKosong() {
        System.out.println("""
            
            ============================================
            ===== Alamat Email tidak boleh kosong! =====
            ============================================
            """);
    }

    public void alamatEmailTidakValid() {
        System.out.println("""
            
            ====================================
            ===== Alamat email tidak valid =====
            ====================================
            """);
    }

    public void gantiAdmin() {
        System.out.println("""
            
            =====================================
            ======= Ganti Nama Admin Baru =======
            =====================================
            """);
    }

    public void gantiNomor() {
        System.out.println("""
            
            =====================================
            ===== Ganti Nomor Telepone Baru =====
            =====================================
            """);
    }

    public void gantiAlamatEmail() {
        System.out.println("""
            
            =====================================
            ====== Ganti Alamat Email Baru ======
            =====================================
            """);
    }

    public void berhasilGantiAdmin() {
        System.out.println("""
            
            Nama Admin berhasil diganti!
            =====================================
            """);
    }

    public void berhasilGantiNomor() {
        System.out.println("""
            
            Nomor Telephone berhasil diganti!
            =====================================
            """);
    }

    public void berhasilGantiEmail() {
        System.out.println("""
            
            Alamat Email berhasil diganti!
            =====================================
            """);
    }

    public void nomorTidakDitemukan() {
        System.out.println("""
            
            ======================================================
            ===== Mohon Maaf. Nomor yang Anda cari tidak ada =====
            ======================================================
            """);
    }

    public void adminTidakDitemukan() {
        System.out.println("""
            
            ======================================================
            ===== Mohon Maaf. Admin yang Anda cari tidak ada =====
            ======================================================
            """);
    }

    public void alamatEmailTidakDitemukan() {
        System.out.println("""
            
            ======================================================
            ===== Mohon Maaf. Email yang Anda cari tidak ada =====
            ======================================================
            """);
    }

    public void hapusAkunAdmin() {
        System.out.println("""
            
            =====================================
            ===== Hapus Permanen Akun Admin =====
            =====================================
            """);
    }


    public void akunBerhasilDiHapus() {
        System.out.println("""
            
            Akun berhasil dihapus!
            Silahkan untuk Keluar dari Akun!
            =====================================
            """);
    }

    public void hapusAkunDiBatalkan() {
        System.out.println("""
            
            ========================================
            ===== Penghapusan Akun dibatalkan! =====
            ========================================
            """);
    }


    public void pilihanSalah() {
        System.out.println("""
            
            ===============================
            ===== Pilihan Anda salah! =====
            ===============================
            """);
    }
}
