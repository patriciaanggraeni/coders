package RPG;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import RPG.Settings.GamePanel;

public class Main {

    // buat dulu variabel untuk frame dan panelnya
    JFrame window;
    GamePanel gamePanel;

    public Main() {

        // lalu buat objeknya
        window = new JFrame();
        gamePanel = new GamePanel();

        window.setTitle("Adventure Game");
        window.setResizable(false);

        // tambahkan panel ke dalam frame
        window.add(gamePanel);
        window.pack(); // berfungsi agar ukuran frame mengikuti ukuran panelnya

        window.setVisible(true); // agar window terlihat
        window.setLocationRelativeTo(null); // agar posisi window pas di tengah
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // agar dapat di close

        // mulai threadnya
        gamePanel.startGameThread();
    }

    public static void main(String[] args) {

        // panggil dan jalankan objek Main
        Runnable run = Main::new;
        SwingUtilities.invokeLater(run);

    }
}
