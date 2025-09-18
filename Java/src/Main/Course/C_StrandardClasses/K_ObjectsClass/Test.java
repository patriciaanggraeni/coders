package Course.C_StrandardClasses.K_ObjectsClass;

import java.util.Objects;

public class Test {

    private String data;

    Test() {}

    Test(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void result(Test input1, Test input2) {

        System.out.println(Objects.toString(input1));
        System.out.println(Objects.equals(input1, input2));
        System.out.println(Objects.hashCode(input1));
    }
}
