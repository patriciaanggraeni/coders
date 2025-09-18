package Course.D_ObjectOrientedProgramming.H_Abstract;

public abstract class Abstract {

    // belum bisa dikatakan abstract class jika tidak memiliki setidaknya satu abstak method
    // class ini hanya sebagai template jadi jika di main class dijadikan sebuah objek
    // maka akan muncul pesan error bahwa class ini adalah class abstract
    Abstract() {
        System.out.println("Ini adalah konstruktor class abstract");
    }

    // method abstract tidak memiliki badan / body
    // yang memiliki body nantinya adalah class yang diturunkan (childnya)
    // method ini akan diturunkan secara paksa ke penerusnya
    protected abstract void print();

    protected void hello() {
        System.out.println("Hello World");
    }
}