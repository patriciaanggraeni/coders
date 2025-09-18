package Course.C_StrandardClasses.M_PropertiesClass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
        *
        * kebanyakan, di Java meyimpan file dalam bentuk properties file
        * properties file adalah dile yang berisi key value yang dipisahkan dengan tanda =
        * properties file bisa menyimpan data konfirgurasi
        *
        * gunakan properties class untuk mengamil atau meyimpan file properties
        *
        * beberapa method properties:
        * - properties.load : unutk mengload file properties
        * - getProperties() : untuk mengambil data dari file properties
        *
        *
        *
        * */

        Properties properties = new Properties();
        properties.load(new FileInputStream("app.properties"));


        // ambil data dari file properties
        String nama = properties.getProperty("data.nama");
        String umur = properties.getProperty("data.umur");
        String hobi = properties.getProperty("data.hobi");
        String alamat = properties.getProperty("data.alamat");

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Hobi: " + hobi);
        System.out.println("Alamat: " + alamat);


        // menambahkan data ke dalam file properties
        properties.put("nama.depan", "Patria");
        properties.put("nama.belakang", "Putra");

        properties.store(new FileOutputStream("app.properties"), " ");
    }
}
