package Course.A_Basic.String_16;

public class Format {
    public static void main(String[] args) {

        // String format
        // Jenis : %d, %f, %c, %s, %b
        int umur = 19;
        System.out.printf("\nUmur ku %d, umur mu berapa? apa sama %d?\n", umur, umur);

        // [index_argumen]$
        System.out.printf("Umur ku %1$d, umur mu berapa? apa sama %1$d?\n", umur);

        String nama = "Angga";
        char abjad = 'A';
        System.out.printf("\nNama ku %s, diawali huruf abjad %c dan %s untuk nama %cnak Laki laki", nama, abjad, nama, abjad);
        System.out.printf("\nNama ku %1$s, diawali huruf abjad %2$c dan %1$s untuk nama %2$cnak Laki laki", nama, abjad);
    }
}
