package TugasKuliah.Semester3.Minggu12.Praktikum.Tugas;

public class Barrier implements Destroyable {

    private int strength;

    Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
        this.strength -= (this.strength * 0.10f);
    }

    public String getBarrierInfo() {
        String info = "\nBarrier Strength = " + this.getStrength();
        return info;
    }
}