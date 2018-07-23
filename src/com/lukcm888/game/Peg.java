package com.lukcm888.game;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Peg implements MouseListener{
	
	private int pegNumber;
	private Color pegColor;
	private int currentHoleNumber;

	public Peg(int pegNumber, Color pegColor, int currentHoleNumber) {
		
		this.pegNumber = pegNumber;
		this.pegColor = pegColor;
		this.currentHoleNumber = currentHoleNumber;
	}
	
	

	public int getPegNumber() {
		return pegNumber;
	}



	public void setPegNumber(int pegNumber) {
		this.pegNumber = pegNumber;
	}



	public Color getPegColor() {
		return pegColor;
	}



	public void setPegColor(Color pegColor) {
		this.pegColor = pegColor;
	}



	public int getCurrentHoleNumber() {
		return currentHoleNumber;
	}



	public void setCurrentHoleNumber(int currentHoleNumber) {
		this.currentHoleNumber = currentHoleNumber;
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
