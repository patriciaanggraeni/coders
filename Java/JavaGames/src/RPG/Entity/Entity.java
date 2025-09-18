package RPG.Entity;

import java.awt.image.BufferedImage;

public class Entity {
    
    // buat variabel untuk menampung posisi player dan juga kecepatan player
    public int posPlayerX;
    public int posPlayerY;
    public int playerSpeed;

    // buat variabel untuk menampung gambar (buffered image) dan variabel arah
    protected BufferedImage upOne, upTwo, leftOne, leftTwo, downOne, downTwo, rightOne, rightTwo; 
    protected String direction;

    // buat variabel counter dan angka, untuk memberikan animasi jalan pada player
    public int spriteCounter = 0;
    public int spriteNumbers = 1;
}
