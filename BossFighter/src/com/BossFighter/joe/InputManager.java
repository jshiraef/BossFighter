package com.BossFighter.joe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputManager implements KeyListener	{

	
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		switch(key) {
		
		
		
		case KeyEvent.VK_W:
			BossCore.player.isMoving = false;
			BossCore.player.up = false;
			break;
			
		case KeyEvent.VK_S:
			BossCore.player.isMoving = false;
			BossCore.player.down = false;
			break;	
		
		case KeyEvent.VK_A:
			BossCore.player.isMoving = false;
			BossCore.player.left = false;
			break;
		
		case KeyEvent.VK_D:
			BossCore.player.isMoving = false;
			BossCore.player.right = false;
			break;	
		}
		
	}

	
	public void keyReleased(KeyEvent e) {
		
		
	}

	
	public void keyTyped(KeyEvent e) {
		
		
	}

}
