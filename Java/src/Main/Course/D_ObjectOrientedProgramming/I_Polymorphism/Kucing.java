package Course.D_ObjectOrientedProgramming.I_Polymorphism;

public class Kucing extends Binatang {

    Kucing() {
    }

    @Override
    protected void suaraHewan() {
        super.suaraHewan();
        System.out.println("Suara Kucing: Meow meow");
    }
}