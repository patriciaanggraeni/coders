package RPG.Settings;

import java.awt.*;
import javax.swing.*;

import RPG.Entity.Player;
import RPG.Tile.TileManager;

public class GamePanel extends JPanel implements Runnable {

    // membuat ukuran tile / ubin (16x16) dan ukuran skalanya
    private final int TILE = 16; // ini untuk ukuran tunggalnya
    private final int SCALE = 3; // dan ini untuk skala per ubinnya

    // kalikan dengan ukuran tile dan skala agar ukuran objek tidak terlalu kecil
    // ini akan menjadi ukuran layar game yang akan ditampilkan
    private final int TILE_SIZE = TILE * SCALE;

    // atur jumlah ubin yang akan ditampilkan dalam layar secara vertikal dan horizonta
    // bearapa banyak ubin yang akan ditampilkan dalam garis horzontal atau
    // vertikal
    // buat 16 untuk horizontal dan 12 untuk vertikal (4:3) -> jika dibagi 4
    private final int MAX_SCREEN_ROW = 12; // ukuran vertikal
    private final int MAX_SCREEN_COL = 16; // ukuran horizontal

    // lalu atur lebar dan tinggi layar dengan mengalikan ukuran ubin dengan ukuran maks dari baris dan kolom
    // lalu buat ukuran layar yang sebenarnya disini memakai ukuran 768px x 576px
    private final int SCREEN_WIDTH = TILE_SIZE * MAX_SCREEN_COL; // 768px (lebar)
    private final int SCREEN_HEIGHT = TILE_SIZE * MAX_SCREEN_ROW; // 576px (tinggi)

    // buat variabel untuk fps-nya
    private final int FPS = 60;

    // buat intansiasi objek dari class KeyHander
    public KeyHandler keyHandler = new KeyHandler();

    // buat intansiasi objek player
    Player player = new Player(this, keyHandler);

    // buat intansiasi objek tileManager
    TileManager tileManager = new RPG.Tile.TileManager(this); 

    // untuk memberikan waktu dalam game, mmebutuhkan class Thread, sangat berguna
    // untuk pergerakan objeknya nanti
    // dan untuk memulai dan memberhentikan game
    // selengkapnya lihat di catatan
    // buat variabel untuk trhead
    public Thread gameThread;

    public GamePanel() {

        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        
        // gunakan fungsi ini untuk meningkatkan performa render
        this.setDoubleBuffered(true);
        
        // tambahkan objek keyHandler di dalam panel ini dan set focusable menjadi true
        this.addKeyListener(keyHandler);
        this.setFocusable(true);
    }

    // buat method kustom untuk mengambil nilai dari TILE_SIZE, MAX_SCREEN_COL, dan MAX_SCREEN_ROW
    public int getTileSize() {
        return this.TILE_SIZE;
    }
    
    public int getMaxScreenCol() {
        return this.MAX_SCREEN_COL;
    }

    public int getMaxScreenRow() {
        return this.MAX_SCREEN_ROW;
    }

    // buat methi untuk memulai thread
    public void startGameThread() {
        // buat objek dari class Thread, lalu isi parameter kontruktor dengan class ini
        gameThread = new Thread(this);
        gameThread.start();
    }

    // override method tun untuk memulai thread dan membuat sebuah game loop
    @Override
    public void run() {

        // di dalam method ini akan membuat sebuah game loop
        // di sini menggunakan metode delta untuk menggerakkan objek / palyer

        // pertama set nilai interval dan delta
        double interval = 1_000_000_000 / FPS;
        double delta = 0;

        // buat variabel untuk mengampung wwaktu terakhir dan saat ini
        long lastTime = System.nanoTime();
        long currentTime;

        // lalu buat variabel untuk menampung hasil fps dan menampilkannya
        int count = 0;
        int timer = 0;

        // mulai buat looping, menggunakan while loop
        while (gameThread != null) {

            currentTime = System.nanoTime();
            timer += (currentTime - lastTime);
            delta += (currentTime - lastTime) / interval;
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                repaint();
                delta--;
                count++;
            }

            if (timer >= 1_000_000_000) {
                System.out.println("FPS: " + count);
                count = 0;
                timer = 0;
            }
        }
    }

    // buat 2 buah method, yaitu update dan paintComponent
    private void update() {
        player.update();
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        tileManager.draw(g2);
        player.draw(g2);

        // buang resourse jika sudah melakukan update dan repaint
        g2.dispose();
    }







}
