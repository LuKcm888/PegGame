package com.lukcm888.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import java.util.logging.Logger;

import javax.swing.JPanel;

/**
 * 
 * @author maxwellmackoul
 * 
 *	This class contains all logic that is relative to the GameBoard.  The logic consists of 
 *	two major parts:	
 *	
 *	The first part is actually rendering the board to the JFrame.  
 *
 *
 *	The second part is logic for moving the pieces around the board.
 *
 *
 *	all elements in the game code work to deliver a wonderous experience.
 *
 */

public class GameBoard extends JPanel {
	
	private static String staticClassName = GameBoard.class.getName();
	private static Logger logger = Logger.getLogger(staticClassName);

	private static final int RGB1 = 223;
	private static final int RGB2 = 191;
	private static final int RGB3 = 159;
	private static final int WIDTH = 800;
	private static final int HEIGHT = WIDTH;
	private Path2D path = new Path2D.Double();
	private static Color boardColor = new Color(RGB1, RGB2, RGB3);
	
	private int [] adjacentHoles1;
	private int [] adjacentHoles2;
	private int [] adjacentHoles3;
	private int [] adjacentHoles4;
	private int [] adjacentHoles5;
	private int [] adjacentHoles6;
	private int [] adjacentHoles7;
	private int [] adjacentHoles8;
	private int [] adjacentHoles9;
	private int [] adjacentHoles10;
	private int [] adjacentHoles11;
	private int [] adjacentHoles12;
	private int [] adjacentHoles13;
	private int [] adjacentHoles14;
	private int [] adjacentHoles15;
	
	
		
	public GameBoard () {
		
		logger.info(staticClassName +".Constructor: Constructing GameBoard"); 
		
		double firstX = (WIDTH / 2.0) * (1 - 1 / Math.sqrt(3));
		double firstY = 3.0 * HEIGHT / 4.0;
			
		path.moveTo(firstX, firstY);
		path.lineTo(WIDTH - firstX, firstY);
		path.lineTo(WIDTH / 2.0, HEIGHT / 4.0);
		path.closePath();
		
		logger.info(staticClassName +".Constructor: GameBoard constructed"); 
			
	}
		
	@Override 
	protected void paintComponent(Graphics g) {
		
		logger.info(staticClassName +".paintComponent(): Entering method"); 
		
		
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setPaint(boardColor);
		g2.fill(path);
		
		int xPos = 390;
		int yPos = 310;
		
		
		
		//TODO: rewrite into more efficient algorithm
		for (int i = 0; i < 15; i ++ ) {
		
			if (i == 0) {
				Hole hole = new Hole(i, xPos, yPos, adjacentHoles1);
				hole.paintComponent(g2);
				yPos += 50;
			}
			//  row 2
			
			else if ( i == 1) {
				xPos -= 20;
				Hole hole = new Hole(i, xPos, yPos, adjacentHoles2);
				hole.paintComponent(g2);
			}
			else if (i== 2) {
				xPos += 40;
				Hole hole = new Hole(i, xPos, yPos, adjacentHoles3);
				hole.paintComponent(g2);
				xPos -= 20;
				yPos += 50;
				
			}
			
			//  row 3
			else if (i == 3) {
				xPos -= 40;
				Hole hole = new Hole(i, xPos, yPos, adjacentHoles4);
				hole.paintComponent(g2);
				xPos += 40;
			}
			
			else if (i == 4) {
				Hole hole = new Hole(i, xPos, yPos, adjacentHoles5);
				hole.paintComponent(g2);
				xPos += 40;
			}
			
			
			else if (i == 5) {
				Hole hole = new Hole(i, xPos, yPos, adjacentHoles6);
				hole.paintComponent(g2);
				xPos -= 40;
				yPos += 50;
			}
			
			
			//  row 4
			else if (i == 6) {
				
				xPos -= 80;
				Hole hole = new Hole(i, xPos, yPos, adjacentHoles7);
				hole.paintComponent(g2);
				xPos += 50;
			}
			
			
			else if (i == 7) {
				Hole hole = new Hole(i, xPos, yPos, adjacentHoles8);
				hole.paintComponent(g2);
				xPos += 50;
			}
			
			
			else if (i == 8) {
				Hole hole = new Hole(i, xPos, yPos, adjacentHoles9);
				hole.paintComponent(g2);
				xPos += 50;
			}
			
			else if (i == 9) {
				Hole hole = new Hole(i, xPos, yPos, adjacentHoles10);
				hole.paintComponent(g2);
				xPos -= 120;
				yPos += 50;
			}
			
			
			//  row 5
			
			else if (i == 10) {
				
				xPos -= 55;
				Hole hole = new Hole(i, xPos, yPos, adjacentHoles11);
				hole.paintComponent(g2);
				xPos += 50;
			}
			
			
			else if (i == 11) {
				Hole hole = new Hole(i, xPos, yPos, adjacentHoles12);
				hole.paintComponent(g2);
				xPos += 50;
			}
			
			
			else if (i == 12) {
				Hole hole = new Hole(i, xPos, yPos, adjacentHoles13);
				hole.paintComponent(g2);
				xPos += 50;
			}
			
			else if (i == 13) {
				Hole hole = new Hole(i, xPos, yPos, adjacentHoles14);
				hole.paintComponent(g2);
				xPos += 50;
			}
			
			else if (i == 14) {
				Hole hole = new Hole(i, xPos, yPos, adjacentHoles15);
				hole.paintComponent(g2);
				xPos += 50;
			}
			
			else {
				continue;
			}
		
		}
		
	
		
		logger.info(staticClassName +".paintComponent(): Exiting method"); 
			
	}
		
	@Override
	public Dimension getPreferredSize() {
		
		logger.info(staticClassName +".getPreferredSize(): Entering method"); 
		if (isPreferredSizeSet()) {
			logger.info(staticClassName +".getPreferredSize(): isPreferredSizeSet() == true. Exiting method"); 
			return super.getPreferredSize();
		}
		logger.info(staticClassName +".getPreferredSize(): isPreferredSizeSet() == false.  Exiting method"); 
			return new Dimension(WIDTH, HEIGHT);
	}
	
}
