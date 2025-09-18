package Course.E_CollectionsFramework.A_JavaGeneric.B_Method;

public class Method {

    Method() {}

    /*
    * jika sebuah method dideklarisakan sebagai generic, maka hanya method
    * tersebut yang dapat digunakan sebagai generic, berbeda dengan mendeklarasikan
    * class sebagai egeneric type, maka semua bisa mengaksesnya.
    *
    * parameter method boleh lebih sari 1 dan tipenya terserah
    *
    * syntax : public void <type1, type2, ...> tipe_data nama_fungsi(parameter) {
    *               body
    *          }
    * */

    protected <T, U> int count(T[] array1, U[] array2) {
        return array1.length + array2.length;
    }


}
