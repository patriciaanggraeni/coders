package Course.D_ObjectOrientedProgramming.K_Interface.Latihan.Handphone;

public class PhoneUser {

    private final Phone phone;

    PhoneUser (Phone phone) {
        this.phone = phone;
    }

    void nyalakanHp() {
        this.phone.powerOn();
    }

    void matikanHp() {
        this.phone.powerOff();
    }

    void besarkanVolume() {
        this.phone.volumeUp();
    }

    void kecilkanVolume() {
        this.phone.volumeDown();
    }

}
