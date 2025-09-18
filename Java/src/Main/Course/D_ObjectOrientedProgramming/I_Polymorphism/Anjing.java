package Course.D_ObjectOrientedProgramming.I_Polymorphism;

public class Anjing extends Binatang {

    Anjing() {}

    @Override
    protected void suaraHewan() {
        super.suaraHewan();
        System.out.println("Suara Anjing: Guk guk");
    }
}