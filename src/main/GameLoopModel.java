package main;

import java.io.Serializable;
import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Rectangle;
import stages.Enemy;
import stages.Sprite;

public class GameLoopModel implements Serializable
{
	public long t1 = System.nanoTime(); // Gets total time elapsed in nanoseconds, so early value
	public long t2 = System.nanoTime(); // to be initialized as later value to compare (t2-t1)
	public long diff;
	public long interval = 200000000;
	public int bufferX = 720;
	public int bufferY = 480;
	public int bufferScalarX = 1;
	public int bufferScalarY = 1;
	public boolean isBattle = false;
	public int PlayerCharHealth;
	public ArrayList<String> input;
	public ArrayList<Rectangle> obstacles;
	public ArrayList<Enemy> enemies;
	public boolean gotItem = true;
	public boolean gotItem2 = true;
	long start = System.nanoTime();
	long start2 = System.nanoTime();
	public int posX, posY;
	public int totalPosX, totalPosY;
	
	public GameLoopModel()
	{
		t1 = System.nanoTime();
		t2 = System.nanoTime();
		input = new ArrayList<>(); 
		PlayerCharHealth=3;
		obstacles = new ArrayList<Rectangle>();
		start = System.nanoTime();
		start2 = System.nanoTime(); 
		enemies = new ArrayList<Enemy>();
		diff=0;
		interval = 200000000;
		bufferX = 720;
		bufferY = 480;
		bufferScalarX = 1;
		bufferScalarY = 1;
		isBattle = false;
		input = new ArrayList<String>();
		gotItem = true;
		gotItem2 = true;
		posX = 50;
		posY = 50;
		totalPosX = 50;
		totalPosY = 50;
	}
	public GameLoopModel(PlayerChar p)
	{
		t1 = System.nanoTime();
		t2 = System.nanoTime();
		input = new ArrayList<>(); 
		PlayerCharHealth=3;
		obstacles = new ArrayList<Rectangle>();
//		playerItems = new ArrayList<Sprite>();
		start = System.nanoTime();
		start2 = System.nanoTime(); 
//		items = new ArrayList<Sprite>();
		enemies = new ArrayList<Enemy>();
//		projectilesP = new ArrayList<Sprite>();
//		projectilesE = new ArrayList<Sprite>();
		diff=0;
		interval = 200000000;
		bufferX = 720;
		bufferY = 480;
		bufferScalarX = 1;
		bufferScalarY = 1;
		isBattle = false;
		input = new ArrayList<String>();
		gotItem = true;
		gotItem2 = true;
		posX = p.posX;
		posY = p.posY;
		totalPosX = p.totalPosX;
		totalPosY = p.totalPosY;
	}
}

