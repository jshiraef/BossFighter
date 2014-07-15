package com.BossFighter.joe;

import java.awt.Graphics;
import java.awt.Rectangle;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class Office {
	
	public int width = 100;
	public int height = 100;
	
	public BossBackground[][] bg = new BossBackground[width][height];
	
	public final String Dpath= "res/world/room_";
	
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
	
	loadWorld();
	
   }
	
	public void loadWorld() {
		int background = map.getLayerIndex("background");
		int solids = map.getLayerIndex("collision");
		int item = map.getLayerIndex("object");
		
		for(int x = 0; x < bg.length; x++) {
			for (int y = 0; y < bg[0].length; y++){
				
				
				//background
				if(map.getTileId(x, y, background) == 1){
					bg[x][y].id = Tile.floor;
				}
				if(map.getTileId(x, y, item) == 2){
					bg[x][y].id = Tile.desk;
				}
				if(map.getTileId(x, y, solids) == 3){
					bg[x][y].id = Tile.carpet;
				}
				
				//items
			
			}
		}
			
	}
	
	public void update() {
		
	}
	
	public void render(Graphics g, int camX, int camY, int renderX, int renderY	) {
		
		for (int x = (camX/Tile.size); x < (camX/Tile.size) + renderX; x++) {
			for (int y = (camY/Tile.size); y < (camY/Tile.size) + renderY; y++) {
				if (x >= 0 && y <=0 && x < width && y < height) {
					bg[x][y].render(g);
				}
			}
		}
		
	}

}
