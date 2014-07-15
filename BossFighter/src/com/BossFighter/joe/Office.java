package com.BossFighter.joe;

import java.awt.Rectangle;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class Office {
	
	public int width = 100;
	public int height = 100;
	
	public BossBackground[][] bg = new BossBackground[width][height];
	
	public final String Dpath= "res/World/room_";
	
	public String path = Dpath;
	
	public TiledMap map = null;
	
	public Office(int id) {
		path = Dpath + Integer.toString(id) + ".tmx";
		System.out.println(path);
	
	
	try{
		map = new TiledMap(path, false);
	}catch (SlickException e) {
		System.out.println(" Error loading map!");
	}
	
	for(int x = 0; x < bg.length; x++) {
		for (int y = 0; y < bg[0].length; y++){
			bg[x][y] = new BossBackground(new Rectangle(x * Tile.size, y * Tile.size, Tile.size, Tile.size), Tile.blank);
		}
	}
	
   }

}
