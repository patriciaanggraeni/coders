package Course.C_StrandardClasses.A_StringClass;

public class MainBD {
    public static void main(MainSTR[] args) {

        // 1. StringBuilder append(boolean)
        System.out.println("----- StringBuilder : Appending Boolean");
        StringBuilder sb = new StringBuilder("Halo kamu,");
        System.out.println("Output: " + sb);

        // append string sebelumnya dengan tipe data lainnya (tidak hanya string)
        sb.append(" Apa kabar?");
        System.out.println("Output: " + sb);

        sb.append(true);
        System.out.println("Output: " + sb);


        // 2. StringBuilder append(char[] astr)
        System.out.println("\n----- StringBuilder : Appending char astr");

        StringBuilder nama = new StringBuilder();
        char[] astr = new char[] {'A', 'N', 'G', 'G', 'A'};

        nama.append("Nama saya adalah ");
        nama.append(astr);
        System.out.println("Output : " + nama);


        /*
        3. StringBuilder append(char[] cstr, int iset, int ilength)

              - char[] cstr adalah urutan dari char
              - int iset adalah awal dari index yang ingin diappend
              - int ilength adalah panjang dari string yang ingin di append
        */
        System.out.println("\nStringBuilder : Appending (char cstr, iset, ilength)");
        StringBuilder newData = new StringBuilder();
        char[] cstr = new char[] {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

        newData.append(cstr, 0, 5);
        System.out.println("Output: " + newData);


        // 4. StringBuilder append Double and Float value
        System.out.println("\n----- StringBuilder : Appending Double and Float");
        StringBuilder jarak = new StringBuilder();
        Double db = (4.5);
        Float fl = (5.5F);

        jarak.append("Jarak dari rumah ke sekolah adalah ");
        jarak.append(db);
        jarak.append(", \nSedangkan jarak dari rumah ke supermarket adalah ");
        jarak.append(fl);

        System.out.println("Output: " + jarak);

        // 5. Stringbuilder append CharSequence
        System.out.println("\n----- StringBuilder : Appending CharSequence");
        StringBuilder textOne = new StringBuilder();
        CharSequence myName = "Angga";

        textOne.append(myName);
        System.out.println("Output: " + textOne);


        // 6. StringBuilder append (CharSequence, int start, int end)
        System.out.println("\n----- StringBuilder : Appending (CharSeq, start, end");
        byte start = 1;
        byte end = 13;

        StringBuilder myStrBuild = new StringBuilder();
        CharSequence myCharSeq = "Hello World, Apa kabarnya?";

        myStrBuild.append(myCharSeq, start, end);
        System.out.println("Output: " + myStrBuild);


        // 7. StringBuilder append the Object
        System.out.println("\n----- StringBuilder : Appending Object");

        StringBuilder myStrBuild2 = new StringBuilder();
        Object myObj = "Halloo Guyss";

        myStrBuild2.append(myObj);
        System.out.println("Output: " + myStrBuild2);

        // 8. StringBuilder append StringBuilder
        System.out.println("\n----- StringBuilder : Appending StringBuilder");
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        str1.append("Beliau ini ");
        str2.append("Ancrit bet");
        str1.append(str2);
        System.out.println("Output: " + str1);

    }
}
