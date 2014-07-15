package com.BossFighter.joe;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Tile {
	
	public static int[] blank = {-1, -1};
	
	//background
	public static int[] floor = {0, 0};
	public static int[] desk = {1, 0};
	public static int[] carpet = {2, 0};
	
	//collision
	
	
	//items
	
	
	//characters
	
	public static int size = 32;
	public static BufferedImage terrain;
	public static BufferedImage background;
	public static BufferedImage items;
	public static BufferedImage bosses;
	
	public Tile() {
		
		try {
			Tile.background = ImageIO.read(new File("res/background.png"));
			Tile.terrain = ImageIO.read(new File("res/terrain.png"));
			Tile.bosses = ImageIO.read(new File("res/bosses.png"));
			Tile.items = ImageIO.read(new File("res/items.png"));
		}catch (Exception e) {
			System.out.println("Image loading error, You fool!");
		}
		
	}

}
