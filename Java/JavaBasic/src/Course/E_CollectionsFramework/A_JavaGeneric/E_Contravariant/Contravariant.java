package Course.E_CollectionsFramework.A_JavaGeneric.E_Contravariant;

public class Contravariant <T> {

    /*
    * - Contravariant kebalikan dari Covariant, jadi bisa melakukan subtitusi ke class supertype
    *   dengan subtype
    * - dengan menggunakan keyword ? (tanda tanya) dan super
    * - Covariant ini bersifat aman untuk diubah dan kurang aman untuk dibaca,
    *   jadi data yang ada di dalamnya tidak aman dibaca
    *
    * - tidak boleh mengambil fungsi dengan nilai return generic type
    * - dan boleh mengambil fungsi yang mempunyai parameter tipe data generic
    * */

    private T data;

    Contravariant(T data) { this.data = data; }

    protected T getData() { return this.data; }

    protected void setData(T data) { this.data = data; }
}