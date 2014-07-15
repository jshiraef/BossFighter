package com.BossFighter.joe;

import java.applet.Applet;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;


public class BossCore extends Applet implements Runnable{
	
	private static final long serialVersionID = 1L;
	
	private static JFrame frame;
	
	public static final int res = 1;
	
	public static float Y = 0;
	public static float X = 0;
	
	public static int dir = 0;
	
	public static boolean moving = false;
	public static boolean run = false;
	
	private Image screen;
	
	public static Dimension screenSize = new Dimension (640, 480);
	public static Dimension pixel = new Dimension (screenSize.width, screenSize.height);
	public static Dimension size;
	
	public static String name = "Boss Fighter";
	
	public BossCore() {
		
		setPreferredSize(screenSize);
		
	}
	
	
	public static void main(String[] args){
		BossCore core = new BossCore();
		
		frame = new JFrame();
		frame.add(core);
		frame.pack();
		
		size = new Dimension(frame.getWidth(), frame.getHeight());
		
		frame.setTitle(name);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		core.start();
	}
	



	public void stop() {
	
		run = false;
	
				}
	
	public void tick() {
	
	
			}
	
	public void render() {
		
		Graphics g = screen.getGraphics();
		
		g = this.getGraphics();
		g.drawImage(screen, 0, 0, screenSize.width, screenSize.height, 0, 0, pixel.width, pixel.height, null);
		g.dispose();
	
		}
	
	
	
	public void run() {
		
		screen = createVolatileImage(pixel.width, pixel.height);
		
		while(run) {
			tick();
			render();
			
			try {
				Thread.sleep(5);
			}
			catch (Exception e) {
				System.out.println("sleeping thread screwed up");
			}
			}
		}
		
	
	
	public void init() {
		requestFocus();
		
		run = true;
		
		new Thread(this).start();
	}

}
