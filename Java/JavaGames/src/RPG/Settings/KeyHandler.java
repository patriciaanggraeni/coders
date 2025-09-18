package RPG.Settings;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// buat class KeyHandler dan implementasikan class ini ke class KeyListener
public class KeyHandler implements KeyListener {

    // buat variabel untuk mengecek tombol keyboard ditekan atau tidak
    private boolean keyUpPressed, keyLeftPressed, keyDownPressed, keyRightPressed;

    // Override 3 method dari class interface KeyListener
    @Override
    public void keyTyped(KeyEvent e) {}

    // gunakan method ini untuk melakukan sebuah aksi saat tombol keyboard ditekan
    @Override
    public void keyPressed(KeyEvent e) {
        
        // ambil kode kunci yang ditekan (kunci ini bertipe integer)
        int keyCode = e.getKeyCode();

        // buat kondisi jika tombol ditekan
        if (keyCode == KeyEvent.VK_W) {
            this.keyUpPressed = true;
        } else if (keyCode == KeyEvent.VK_A) {
            this.keyLeftPressed = true;
        } else if (keyCode == KeyEvent.VK_S) {
            this.keyDownPressed = true;
        } else if (keyCode == KeyEvent.VK_D) {
            this.keyRightPressed = true;
        }
    }

    // gunakan method ini untuk melakukan aksi jika tombol dilepas (tidak ditekan)
    @Override
    public void keyReleased(KeyEvent e) {
        // ambil kode kunci yang ditekan (kunci ini bertipe integer)
        int keyCode = e.getKeyCode();

        // buat kondisi jika tombol tidak ditekan
        if (keyCode == KeyEvent.VK_W) {
            this.keyUpPressed = false;
        } else if (keyCode == KeyEvent.VK_A) {
            this.keyLeftPressed = false;
        } else if (keyCode == KeyEvent.VK_S) {
            this.keyDownPressed = false;
        } else if (keyCode == KeyEvent.VK_D) {
            this.keyRightPressed = false;
        }
    }

    // buat kustom method untuk mengambil nilai dari variabel di class ini
    public boolean getKeyUpPressed() {
        return this.keyUpPressed;
    }

    public boolean getKeyLeftPressed() {
        return this.keyLeftPressed;
    }

    public boolean getKeyDownPressed() {
        return this.keyDownPressed;
    }

    public boolean getKeyRightPressed() {
        return this.keyRightPressed;
    }
}
