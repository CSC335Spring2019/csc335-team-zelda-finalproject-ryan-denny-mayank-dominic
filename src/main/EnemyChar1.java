package main;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image;

public class EnemyChar1 extends Movement{
	private List<Bullet> firedBullets = new ArrayList<Bullet>();
	Direction DOWN = Direction.DOWN;
	Image emerald_down_rest;
	Image emerald_down_1;
	Image emerald_down_2;
	Image emerald_left_rest;
	Image emerald_left_1;
	Image emerald_left_2;
	Image emerald_right_rest;
	Image emerald_right_1;
	Image emerald_right_2;
	Image emerald_up_rest;
	Image emerald_up_1;
	Image emerald_up_2;


	public EnemyChar1() {
		super();
		emerald_down_rest = new Image("file:images/emerald_down_rest.png");
		emerald_down_1 = new Image("file:images/emerald_down_1.png");
		emerald_down_2 = new Image("file:images/emerald_down_2.png");
		emerald_left_rest = new Image("file:images/emerald_left_rest.png");
		emerald_left_1 = new Image("file:images/emerald_left_1.png");
		emerald_left_2 = new Image("file:images/emerald_left_2.png");
		emerald_right_rest = new Image("file:images/emerald_right_rest.png");
		emerald_right_1 = new Image("file:images/emerald_right_1.png");
		emerald_right_2 = new Image("file:images/emerald_right_2.png");
		emerald_up_rest = new Image("file:images/emerald_up_rest.png");
		emerald_up_1 = new Image("file:images/emerald_up_1.png");
		emerald_up_2 = new Image("file:images/emerald_up_2.png");

	}

	public EnemyChar1(int inPosX, int inPosY, int speed, double whMult) {
		super(inPosX, inPosY, speed, whMult);
		emerald_down_rest = new Image("file:images/emerald_down_rest.png");
		emerald_down_1 = new Image("file:images/emerald_down_1.png");
		emerald_down_2 = new Image("file:images/emerald_down_2.png");
		emerald_left_rest = new Image("file:images/emerald_left_rest.png");
		emerald_left_1 = new Image("file:images/emerald_left_1.png");
		emerald_left_2 = new Image("file:images/emerald_left_2.png");
		emerald_right_rest = new Image("file:images/emerald_right_rest.png");
		emerald_right_1 = new Image("file:images/emerald_right_1.png");
		emerald_right_2 = new Image("file:images/emerald_right_2.png");
		emerald_up_rest = new Image("file:images/emerald_up_rest.png");
		emerald_up_1 = new Image("file:images/emerald_up_1.png");
		emerald_up_2 = new Image("file:images/emerald_up_2.png");

	}
}