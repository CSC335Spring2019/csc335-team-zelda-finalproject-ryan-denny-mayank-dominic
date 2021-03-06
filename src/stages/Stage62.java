package stages;


import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

// Stage62 is the opened up Stage once we have the Key in our inventory

public class Stage62 {
	private ArrayList<Rectangle> obstalces = new ArrayList<Rectangle>() ;
	private ArrayList<Rectangle> duengon = new ArrayList<Rectangle>() ;
	private ArrayList<Enemy> enemies = new ArrayList<Enemy>() ;

	int[][] tileMap = {
			{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
			{2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
			{2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
			{2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
			{2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 2},
			{1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
	}; //tileMap - may move on to text reading method instead

	Image regTile = new Image("file:images/reg_tile_scaled.png");
	Image rockTile = new Image("file:images/rock.png");
	Image waterTile = new Image("file:images/water_tile.png");
	Image stairTile = new Image("file:images/stairs.png");

	int tileLength = 48;
	int tileWidth = 48;

	public void generateTiles(GraphicsContext gc) {

		int mapLength = tileMap.length;
		int mapWidth = tileMap[0].length;

		createEnemies();

		for (int i = 0; i < mapLength; i++) { 
			for (int j = 0; j < mapWidth; j++) {
				if (tileMap[i][j] == 0) {
					gc.drawImage(regTile, j * tileWidth, i * tileLength);
				}
				if (tileMap[i][j] == 1) {
					gc.drawImage(waterTile, j * tileWidth, i * tileLength);
					obstalces.add( new Rectangle(j * tileLength, i * tileWidth, tileLength, tileWidth));
				}
				if (tileMap[i][j] == 2) {
					gc.drawImage(regTile, j * tileWidth, i * tileLength);
					gc.drawImage(rockTile, j * tileWidth, i * tileLength);
					obstalces.add( new Rectangle(j * tileLength, i * tileWidth, tileLength, tileWidth));
				}
				if (tileMap[i][j] == 7) {
					gc.drawImage(stairTile, j * tileWidth, i * tileLength);
					duengon.add( new Rectangle(j * tileLength, i * tileWidth, tileLength, tileWidth));
			}
		}}
	}
	/**
	 * Gets the Obstacles on the Stage
	 * @return List of Rectangle Obstacles 
	 */
	public ArrayList<Rectangle> getObstacles(){
		return obstalces;
	}
	/**
	 * Gets the Duengon Entrences on the Stage 
	 * @return List of Rectangle Objects 
	 */
	public ArrayList<Rectangle> getD() {
		return duengon;
	}
	/**
	 * Gets the Enemies on the Stage 
	 * @return List of Enemy Objects 
	 */
	public ArrayList<Enemy> getEnemies() {
		return enemies;
	}
	/**
	 * CreateEnemies Spawns the Enemies on this specific Map
	 */
	private void createEnemies() {
		Enemy enemy = new Enemy(3, 285, 450);
		enemy.hollow = true;
		enemy.direction = 1;
		enemy.setVelocity(1);
		enemies.add( enemy );
		
		Enemy enemy2 = new Enemy(3, 330, 450);
		enemy2.hollow = true;
		enemy2.direction = 1;
		enemy2.setVelocity(1);
		enemies.add( enemy2 );

	}
}