package Project.Project3_Inventory.Product;

import Project.Project3_Inventory.Template.Mainan;
import java.util.Scanner;

public class Products extends Mainan {

    Products next, prev;

    Products() {}

    Products(String nama, String warna, String kondisi, int stok, int harga) {
        super(nama, warna, kondisi, stok, harga);
    }

    @Override
    public void informasiBarang() {}

    public void tambahProduk() {
        Scanner inputNama = new Scanner(System.in);
    }
}
