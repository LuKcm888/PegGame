package com.lukcm888.game;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Driver {
	
	private static String staticClassName = Driver.class.getName();
	private final static Logger LOGGER = Logger.getLogger(staticClassName);
	

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGGER.setLevel(Level.INFO);
					Display d = new Display("Peg Game", 500, 500);
				} catch (Exception e) {
					
				}
			}
		});
		// TODO Auto-generated method stub
		
		// Draw board with 25 holes
		
		// have class for peg 
		// have class for player
		// have class for move
		

	}

}
