package Course.D_ObjectOrientedProgramming.K_Interface.Single;

public class Main implements Interface {

    @Override
    public void mesin() {
        System.out.println("Kecepatan: " + kecepatan);
    }

    @Override
    public void model() {
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {

        Main mobil = new Main();
        mobil.mesin();
        mobil.model();
    }
}
