package Course.D_ObjectOrientedProgramming.I_Polymorphism;

public class Singa extends Binatang {

    Singa() {}

    @Override
    protected void suaraHewan() {
        super.suaraHewan();
        System.out.println("Suara Singa: Roarrrr roaar");
    }
}