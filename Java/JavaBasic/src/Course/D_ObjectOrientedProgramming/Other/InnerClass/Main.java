package Course.D_ObjectOrientedProgramming.Other.InnerClass;

class Outer {

    Outer() {}

    private final int x = 10;

    protected int getX() {
        return this.x;
    }

    static class Inner {

        Inner() {}

        private final int y = 15;

        protected int getY() {
            return this.y;
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner();

        int hasil = outer.getX() + inner.getY();
        System.out.printf("Hasil dari %d + %d = %d", outer.getX(), inner.getY(), hasil);
        System.out.println(" ");

    }
}
