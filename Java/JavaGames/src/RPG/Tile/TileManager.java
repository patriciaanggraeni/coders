package RPG.Tile;

import RPG.Settings.GamePanel;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TileManager {
    
    GamePanel gamePanel;
    Tile[] tiles;
    int maps[][];

    public TileManager(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
        tiles = new Tile[10];
        maps = new int[gamePanel.getMaxScreenCol()][gamePanel.getMaxScreenRow()];
    
        getTileImage();
        loadMap("../res/maps/mymap.txt");
    }

    public void getTileImage() {

        try {

            tiles[0] = new Tile();
            tiles[1] = new Tile();
            tiles[2] = new Tile();
            tiles[3] = new Tile();
            tiles[4] = new Tile();

            tiles[0].image = ImageIO.read(getClass().getResource("../res/tiles/grass.png"));
            tiles[1].image = ImageIO.read(getClass().getResource("../res/tiles/wall.png"));
            tiles[2].image = ImageIO.read(getClass().getResource("../res/tiles/water.png"));
            tiles[3].image = ImageIO.read(getClass().getResource("../res/tiles/tree.png"));
            tiles[4].image = ImageIO.read(getClass().getResource("../res/tiles/sand.png"));

        } catch ( Exception e) { e.printStackTrace(); }
    }

    public void loadMap(String mapPath) {

        try {
            InputStream input = getClass().getResourceAsStream(mapPath);
            BufferedReader readInput = new BufferedReader(new InputStreamReader(input));

            int cols = 0;
            int rows = 0;

            while (cols < gamePanel.getMaxScreenCol() && rows < gamePanel.getMaxScreenRow()) {

                String line = readInput.readLine();

                while (cols < gamePanel.getMaxScreenCol()) {
                    String numbers[] = line.split(" ");
                    int dataNum = Integer.parseInt(numbers[cols]);  

                    maps[cols][rows] = dataNum;
                    cols++;
                }

                if (cols == gamePanel.getMaxScreenCol()) {
                    cols = 0;
                    rows++;
                }
            }

            input.close();
        } catch(Exception e) { e.printStackTrace(); }
    }

    public void draw(Graphics2D g2) {
        
        int cols = 0;
        int rows = 0;
        int x = 0;
        int y = 0;

        while (cols < gamePanel.getMaxScreenCol() && rows < gamePanel.getMaxScreenRow()) {

            int tileNum = maps[cols][rows];

            g2.drawImage(tiles[tileNum].image, x, y,gamePanel.getTileSize(), gamePanel.getTileSize(),null);
            cols++;
            x += gamePanel.getTileSize();

            if (cols == gamePanel.getMaxScreenCol()) {
                cols = 0;
                x = 0;

                rows++;
                y += gamePanel.getTileSize();
            }
        }
    }
}