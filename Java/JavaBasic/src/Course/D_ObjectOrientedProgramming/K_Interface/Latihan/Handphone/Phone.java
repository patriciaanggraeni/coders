package Course.D_ObjectOrientedProgramming.K_Interface.Latihan.Handphone;

public interface Phone {

    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}
