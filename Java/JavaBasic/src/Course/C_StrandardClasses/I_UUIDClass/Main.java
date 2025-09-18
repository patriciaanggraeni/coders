package Course.C_StrandardClasses.I_UUIDClass;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        /*
        *
        * UUID : Universally Uniqe Identifier
        * berguna untuk yang ingin membuat aplikasi dengan membutuhkan data primary key
        * UUID adalah format standard untuk membuat uniqe value dan sudah terjamin
        *
        * */

        // cara mengenerate UUID
        UUID id = UUID.randomUUID();
        String myId = id.toString();

        System.out.println("My ID is " + myId);

    }
}
