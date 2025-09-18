package Course.D_ObjectOrientedProgramming.K_Interface.Single;

interface Interface {

    // secara eksplisit tipe variabel akan otomatis public, static atau final
    int kecepatan = 700;
    String model = "Lamborgini";

    // secara eksplisit di class interface adalah public dan abstract
    void mesin();
    void model();

    /*
        - interface merupakan class kontrak untuk turunannya
        - kontrak di sini disebut sebagai interface
        - di interface semua method akan otomatis menjadi abstract
        - dan semua field juga akan otomatis final (tidak bisa diubah / constant)
        - untuk memwariskan class interface menggunakan keyword implements

     */

}
