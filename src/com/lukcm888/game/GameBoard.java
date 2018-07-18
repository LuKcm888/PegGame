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
	private static final int WIDTH = 600;
	private static final int HEIGHT = WIDTH;
	private Path2D path = new Path2D.Double();
	private static Color boardColor = new Color(RGB1, RGB2, RGB3);
		
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
