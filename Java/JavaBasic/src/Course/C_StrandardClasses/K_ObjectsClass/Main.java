package Course.C_StrandardClasses.K_ObjectsClass;

public class Main {
    public static void main(String[] args) {

        /*
        *
        * Class Objects, class yang memiliki utility yang berisikan banyak class method
        * yang bisa digunakan untuk operasi object atau melakukan pengecekan sebelum operasi
        * dilakukan
        *
        * */

        Test test = new Test();
        Test obj1 = new Test("Hello World");
        Test obj2 = new Test("Hello World");


        test.result(obj1, obj2);


    }
}
