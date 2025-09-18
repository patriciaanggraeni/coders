package Course.C_StrandardClasses.A_StringClass;

import java.lang.StringBuffer;

public class MainBF {
    public static void main(String[] args) {

        // 1. menambahkan string dengan method append
        StringBuffer sbOne = new StringBuffer("Hello ");
        sbOne.append("Java"); // now original string is changed
        System.out.println("Append: " + sbOne);

        // 2. memasukkan string dengan method insert
        StringBuffer sbThree = new StringBuffer("Hello ");
        sbThree.insert(1, "Java"); // Now original string is changed
        System.out.println("Insert: " + sbThree);

        // 3. menimpa string dengan method replace
        StringBuffer sbTwo = new StringBuffer("Hello");
        sbTwo.replace(1,3,"Java");
        System.out.println("Replace: " + sbTwo);

        // 4. menghapus string dengan method delete
        StringBuffer sbFour = new StringBuffer("Hello");
        sbFour.delete(1,3);
        System.out.println("Delete: " + sbFour);

        // 5. membalikkan string dengan method reverse
        StringBuffer sbFive = new StringBuffer("Kasur Rusak");
        sbFive.reverse();
        System.out.println("Reverse: " + sbFive);

        // 6. menghitung kapasitas string dengan method capacity
        // increases from its current capacity, it increases the capacity by (oldcapacity*2)+2.
        // For example if your current capacity is 16, it will be (16*2)+2=34.
        StringBuffer sbSix = new StringBuffer();
        System.out.println(sbSix.capacity()); // default 16
        sbSix.append("Hello");
        System.out.println(sbSix.capacity()); // now 16
        sbSix.append("java is my favourite language");
        System.out.println(sbSix.capacity());
        sbSix.append("java is my favourite language in the world");
        System.out.println(sbSix.capacity());

    }
}
