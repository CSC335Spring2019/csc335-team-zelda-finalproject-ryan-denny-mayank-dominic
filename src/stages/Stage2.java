package stages;
/**
 * Class that represents stage 2 of the game
 */

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Stage2 {
	private ArrayList<Rectangle> obstalces = new ArrayList<Rectangle>() ;
	private ArrayList<Enemy> enemies = new ArrayList<Enemy>() ;
	private ArrayList<Item> items = new ArrayList<Item>() ;
	int[][] tileMap = {
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 1},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 1},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
	}; //tileMap - may move on to text reading method instead

	Image regTile = new Image("file:images/reg_tile_scaled.png");
	Image flowerTile = new Image("file:images/grass-tile2.png");
	Image rockTile = new Image("file:images/rock.png");
	Image Tree = new Image("file:images/tree1.png");


	int tileLength = 48;
	int tileWidth = 48;
	

	public void generateTiles(GraphicsContext gc) {

		int mapLength = tileMap.length;
		int mapWidth = tileMap[0].length;

		createEnemies();
		
		Item heart = new Item(3, 300, 300);
		items.add(heart);

		for (int i = 0; i < mapLength; i++) { 
			for (int j = 0; j < mapWidth; j++) {
				if (tileMap[i][j] == 0) {
					gc.drawImage(regTile, j * tileWidth, i * tileLength);
				}
				if (tileMap[i][j] == 1) {
					gc.drawImage(regTile, j * tileWidth, i * tileLength);
					gc.drawImage(rockTile, j * tileWidth, i * tileLength);
					obstalces.add( new Rectangle(j * tileLength, i * tileWidth, tileLength, tileWidth));
				}
				if (tileMap[i][j] == 7) {
					gc.drawImage(regTile, j * tileWidth, i * tileLength);
					gc.drawImage(Tree, j * tileWidth, i * tileLength);
					obstalces.add( new Rectangle(j * tileLength, i * tileWidth, tileLength, tileWidth));

				}
			}
		}
	}
	/**
	 * Populates the stage with obstacles that the player cannot move through
	 * @return  ArrayList of rectangle objects
	 */
	public ArrayList<Rectangle> getObstacles(){
		return obstalces;
	}
	/**
	 * returns the dungeons if the map contains one
	 * @return
	 */
	public ArrayList<Rectangle> getD() {
		return null;
	}
	/**
	 * returns ArrayList of enemy objects that populate the stage
	 * @return
	 */
	public ArrayList<Enemy> getEnemies() {
		return enemies;
	}
	/**
	 * returns ArrayList of item objects that occur on the stage
	 * @return
	 */
	public ArrayList<Item> getItems() {
		return items;
	}
	/**
	 * creates enemies that will populate the stage
	 */
	private void createEnemies() {
		Enemy boss = new Enemy(1,620,460);
		boss.direction = 1;
		boss.setVelocity(5);
		boss.hasProjectileDir = true;
		boss.projectileDir = 4;
		enemies.add(boss);
	}
}
