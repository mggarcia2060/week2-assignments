package week2;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;
import java.awt.event.*;



public class DrawingLines extends GraphicsProgram {
	/* class that allows users to drag lines on the canvas */
	public void run () {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		line = new GLine(x, y, x, y) ;
		add(line);
	}
	public void mouseDragged(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		line.setEndPoint(x, y);
	}
	
	/* when mouse pressed creates a new line*/
	
	private GLine line;
}
