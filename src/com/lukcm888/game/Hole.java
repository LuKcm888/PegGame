package com.lukcm888.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Logger;

import javax.swing.JPanel;

public class Hole extends JPanel  {
	
	private static String staticClassName = Hole.class.getName();
	private static Logger logger = Logger.getLogger(staticClassName);
	
	private int holeNumber;
	private int xPos, yPos;
	private final int HOLEWIDTH = 20;
	private final int HOLEHEIGHT = HOLEWIDTH;
	private static final int RGB1 = 0;
	private static final int RGB2 = 0;
	private static final int RGB3 = 0;
	private static Color circleColor = new Color(RGB1, RGB2, RGB3);
	
	private int [] adjacentHoles;
	
	public Hole (int holeNumber, int xPos, int yPos, int [] adjacentHoles) {
		
		logger.info(staticClassName +".Constructor: Constructing Hole"); 
		
		this.holeNumber = holeNumber;
		this.xPos = xPos;
		this.yPos = yPos;
		this.adjacentHoles = adjacentHoles;
		
		logger.info(staticClassName +".Constructor: GameBoard Hole"); 
			
	}
		
	public int getHoleNumber() {
		return holeNumber;
	}

	public void setHoleNumber(int holeNumber) {
		this.holeNumber = holeNumber;
	}
	
	public int[] getAdjacentHoles() {
		return adjacentHoles;
	}

	public void setAdjacentHoles(int[] adjacentHoles) {
		this.adjacentHoles = adjacentHoles;
	}

	@Override 
	protected void paintComponent(Graphics g) {
		
		logger.info(staticClassName +".paintComponent(): Entering method"); 
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setPaint(circleColor);
        //g2d.drawOval(10,10,100,100);//I like fill :P
        g2.fillOval(xPos,yPos,HOLEWIDTH,HOLEHEIGHT);
		
		logger.info(staticClassName +".paintComponent(): Exiting method"); 
			
	}
		
	@Override
	public Dimension getPreferredSize() {
		
		 return new Dimension(600, 150);
	}


}
