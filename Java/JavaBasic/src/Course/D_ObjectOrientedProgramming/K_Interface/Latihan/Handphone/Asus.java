package Course.D_ObjectOrientedProgramming.K_Interface.Latihan.Handphone;

public class Asus implements Phone {

    private int volume;
    private boolean nyala;

    Asus() {
        this.volume = 50;
    }

    int getVolume() { return this.volume; }

    @Override
    public void powerOn() {
        nyala = true;
        System.out.println("ASUS....");
        System.out.println("In Search Of Incredible...");
        System.out.println("Selamat datang!");
    }

    public void powerOff() {
        nyala = false;
        System.out.println("Sedang mematikan handphone....");
        System.out.println("Berhasil!");
    }

    public void volumeUp() {
        if (nyala) {
            if (volume == MAX_VOLUME) {
                System.out.printf("\nVolume handphone sudah %d%%", MAX_VOLUME);
            } else {
                this.volume += 10;
                System.out.printf("\nTingkat volume saat ini %d\n", this.getVolume());
            }
        } else {
            System.out.println("Eitsss... Nyalakan dulu hapenya");
        }
    }

    public void volumeDown() {
        if (nyala) {
            if (volume == MIN_VOLUME) {
                System.out.printf("\nVolume handphone sudah %d%%", MIN_VOLUME);
            } else {
                this.volume -= 10;
                System.out.printf("\nTingkat volume saat ini %d\n", this.getVolume());
            }
        } else {
            System.out.println("Eitsss... Nyalakan dulu hapenya");
        }
    }


}
