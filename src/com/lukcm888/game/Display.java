package com.lukcm888.game;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.logging.*;


public class Display extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static String staticClassName = Display.class.getName();
	private static Logger logger = Logger.getLogger(staticClassName);
	private static String title;
	private static int width;

	private static int height;
	private Container container;
	private Graphics g;
	private BufferedImage image;
	private JPanel background;
	
	public Display(String title, int width, int height){
		
		logger.info(staticClassName +".Constructor: Constructing Display"); 
		this.title = title;
		this.width = width;
		this.height = height;
		
		logger.info(staticClassName +".Constructor: Display constructed."); 
		 initDisplay();
	}
	
	
	private static void initDisplay() {
		
		logger.info(staticClassName +".initDisplay(): Entering method"); 	
		try {		
			
			logger.info(staticClassName +".initDisplay(): About to create GameBoard object"); 
			GameBoard gameBoard = new GameBoard();
			
			logger.info(staticClassName +".initDisplay(): About to create JFrame"); 
			JFrame frame = new JFrame(title);
			
			frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
			JLabel emptyLabel = new JLabel("");
			emptyLabel.setPreferredSize(new Dimension(width, height));
			frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
			frame.getContentPane().add(gameBoard);
			frame.pack();
			frame.setLocationByPlatform(true);
			frame.setVisible(true);
			
		} catch (Exception e) {
			
			logger.info(staticClassName +".initDisplay(): Failed to render display: " + e); 
		}
		
		logger.info(staticClassName +".initDisplay(): Exiting Method"); 
	}
	


}
