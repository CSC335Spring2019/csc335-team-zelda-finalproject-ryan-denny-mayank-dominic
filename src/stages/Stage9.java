package stages;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * FINAL BOSS ROOM
 * @author DennyHo
 *
 */
public class Stage9 {
	private ArrayList<Rectangle> obstalces = new ArrayList<Rectangle>() ;
	private ArrayList<Enemy> enemies = new ArrayList<Enemy>() ;
	
	int[][] tileMap = {
			{1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
	}; //tileMap - may move on to text reading method instead

	Image regTile = new Image("file:images/reg_tile_scaled.png");
	Image torchTile = new Image("file:images/torch.png");
	Image flowerTile = new Image("file:images/grass-tile2.png");

	int tileLength = 48;
	int tileWidth = 48;

	public void generateTiles(GraphicsContext gc) {

		int mapLength = tileMap.length;
		int mapWidth = tileMap[0].length;

		//createEnemies();
		Enemy boss = new Enemy(4,0,0);
		boss.direction = 1;
		boss.setVelocity(3);
		boss.hollow = true;
		boss.hasProjectileDir = true;
		enemies.add( boss );

		for (int i = 0; i < mapLength; i++) { 
			for (int j = 0; j < mapWidth; j++) {
				if (tileMap[i][j] == 0) {
					gc.setFill(Color.BLACK);
					gc.fillRect(j * tileLength, i * tileWidth, tileLength, tileWidth);
				}
				if (tileMap[i][j] == 1) {
					gc.setFill(Color.BLACK);
					gc.fillRect(j * tileLength, i * tileWidth, tileLength, tileWidth);
					gc.drawImage(torchTile, j * tileWidth, i * tileLength);
					obstalces.add( new Rectangle(j * tileLength, i * tileWidth, tileLength, tileWidth));
				}
			}
		}
	}

	/**
	 * get Obstacles 
	 * @return List of Obstacles 
	 */
	public ArrayList<Rectangle> getObstacles(){
		return obstalces;
	}
	/**
	 * get D Entrences 
	 * @return List of Rectangle Duengeon 
	 */
	public ArrayList<Rectangle> getD() {
		return null;
	}
	/**
	 * Gets Enemies 
	 * @return List of Enemies 
	 */
	public ArrayList<Enemy> getEnemies() {
		return enemies;
	}
	/**
	 * Create Enemies on Stage 
	 */
	private void createEnemies() {
		Enemy enemy = new Enemy(4, 300, 300);
		enemy.direction = 1;
		enemy.setVelocity(1);
		enemies.add( enemy );
	}
}