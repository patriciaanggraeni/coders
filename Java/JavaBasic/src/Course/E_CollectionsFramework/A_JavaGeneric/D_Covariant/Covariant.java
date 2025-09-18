package Course.E_CollectionsFramework.A_JavaGeneric.D_Covariant;

public class Covariant<T> {

    /*
    * - Covariant kebalikan dari Invariant, jadi bisa melakukan subtitusi ke class subtype
    *   dengan supertypenya
    * - dengan menggunakan keyword ? (tanda tanya) dan extends
    * - Covariant ini bersifat read-only, jadi data yang ada di dalamnya tidak bisa dirubah
    *
    * - boleh menambil fungsi dengan nilai return generic type
    * - dan tidak boleh mengambil fungsi yang mempunyai parameter tipe data generic
    * */

    private T data;

    Covariant(T data) { this.data = data; }

    protected T getData() { return this.data; }

    protected void setData(T data) { this.data = data; }



}
