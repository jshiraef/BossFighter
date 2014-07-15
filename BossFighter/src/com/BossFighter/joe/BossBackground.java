package com.BossFighter.joe;

import java.awt.Rectangle;

import java.awt.Graphics;

public class BossBackground extends Rectangle {
	
	public int[] id = {-1, -1};
	
	public BossBackground(Rectangle rect, int id[]) {
		
		setBounds(rect);
		this.id = id;
	}

	public void render(Graphics g){
		
		g.drawImage(Tile.background, x - (int)BossCore.X, y - (int)BossCore.Y, x + width - (int)BossCore.X, y + height - (int)BossCore.Y,  id[0] * Tile.size, id[1] * Tile.size, id[0] * Tile.size + Tile.size, id[1] * Tile.size + Tile.size, null);
		
		
	}
	
}
