package RPG.Entity;

import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import RPG.Settings.GamePanel;
import RPG.Settings.KeyHandler;
import java.awt.image.BufferedImage;

public class Player extends Entity {
    
    // deklarasi variabel GamePanel dan KeyHandler
    GamePanel gamePanel;
    KeyHandler keyHandler;

    public Player(GamePanel gamePanel, KeyHandler keyHandler) {
        this.gamePanel = gamePanel;
        this.keyHandler = keyHandler;

        setDefaultSettingPlayer();
        getPlayerImage();
    }

    // buat method untuk setting default dri player
    private void setDefaultSettingPlayer() {
        posPlayerX = 50;
        posPlayerY = 50;
        playerSpeed = 4;

        super.direction = "Down";
    }

    // buat method untuk mengload gambarnya
    public void getPlayerImage() {

        // String upOne = "../res/player/boy_up_1.png";
        // String upTwo = "../res/player/boy_up_2.png";
        // String downOne = "../res/player/boy_down_1.png";
        // String downTwo = "../res/player/boy_down_2.png";
        // String leftOne = "../res/player/boy_left_1.png";
        // String leftTwo = "../res/player/boy_left_2.png";
        // String rightOne = "../res/player/boy_right_1.png";
        // String rightTwo = "../res/player/boy_right_2.png";

        try {
            super.upOne = ImageIO.read(getClass().getResource("../res/player/boy_up_1.png"));
            super.upTwo = ImageIO.read(getClass().getResource("../res/player/boy_up_2.png"));
            super.downOne = ImageIO.read(getClass().getResource("../res/player/boy_down_1.png"));
            super.downTwo = ImageIO.read(getClass().getResource("../res/player/boy_down_2.png"));
            super.leftOne = ImageIO.read(getClass().getResource("../res/player/boy_left_1.png"));
            super.leftTwo = ImageIO.read(getClass().getResource("../res/player/boy_left_2.png"));
            super.rightOne = ImageIO.read(getClass().getResource("../res/player/boy_right_1.png"));
            super.rightTwo = ImageIO.read(getClass().getResource("../res/player/boy_right_2.png"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        // untuk mengubah posisi player, bisa dioperasikan di sini
        // jika ke kanan, maka nilai x bertambah
        // jika ke bawah, maka nilai y bertambah
        // tambahkan atau kurangkan dengan kecepatan players

        if (keyHandler.getKeyUpPressed()) {
            super.direction = "Up";
            this.posPlayerY -= this.playerSpeed;
        } else if (keyHandler.getKeyLeftPressed()) {
            super.direction = "Left";
            this.posPlayerX -= this.playerSpeed;
        } else if (keyHandler.getKeyDownPressed()) {
            super.direction = "Down";
            this.posPlayerY += this.playerSpeed;
        } else if (keyHandler.getKeyRightPressed()) {
            super.direction = "Right";
            this.posPlayerX += this.playerSpeed;
        }

        super.spriteCounter++;

        if (super.spriteCounter > 12) {
            if (super.spriteNumbers == 1) {
                super.spriteNumbers = 2;
            } else if (super.spriteNumbers == 2) {
                super.spriteNumbers = 1;
            }

            spriteCounter = 0;
        }
    }

    public void draw(Graphics2D g2) {

        BufferedImage image = null;

        switch (super.direction) {
            case "Up" -> {
                if (super.spriteNumbers == 1) {
                    image = upOne;
                } else if (super.spriteNumbers == 2) {
                    image = upTwo;
                }
                break;
            }
            case "Left" -> {
                if (super.spriteNumbers == 1) {
                    image = leftOne;
                } else if (super.spriteNumbers == 2) {
                    image = leftTwo;
                }
                break;
            }
            case "Down" -> {
                if (super.spriteNumbers == 1) {
                    image = downOne;
                } else if (super.spriteNumbers == 2) {
                    image = downTwo;
                }
                break;
            }
            case "Right" -> {
                if (super.spriteNumbers == 1) {
                    image = rightOne;
                } else if (super.spriteNumbers == 2) {
                    image = rightTwo;
                }
                break;
            }
        }

        g2.drawImage(image, posPlayerX, posPlayerY, gamePanel.getTileSize(), gamePanel.getTileSize(), null);
    }
}
