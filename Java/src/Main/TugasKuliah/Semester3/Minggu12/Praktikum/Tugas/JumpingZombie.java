package TugasKuliah.Semester3.Minggu12.Praktikum.Tugas;

public class JumpingZombie extends Zombie {

    JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (this.level == 1) {
            this.health += (this.health * 30/100);
        } else if (this.level == 2) {
            this.health += (this.health * 40/100);
        } else if (this.level == 3) {
            this.health += (this.health * 50/100);
        }
    }

    @Override
    public void destroyed() {
        this.health -= (this.health * 0.092f);
    }

    @Override
    public String getZombieInfo() {
        String info = "\nJumping Zombie Data = " + "\nHealth = " + this.health + "\nLevel = " + this.level;
        return info;
    }
}