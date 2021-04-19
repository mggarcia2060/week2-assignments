package week2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
/*  
* File: RandomCircles.java  
* ------------------------  
* This program draws a set of 10 circles with different sizes,
* positions, and colors.  
* Each circle has a randomly chosen  color, 
* a randomly chosen radius between 5 and 50 pixels,  
* and a randomly chosen position on the canvas
 */ 

public class RandomCircles extends GraphicsProgram {
	private static final int NumberCIRCLES = 10; 
	
	private static final double MIN_RADIUS = 5; 
	
	private static final double MAX_RADIUS = 50;    
	
	
	public void run() {       
		for (int i = 0; i < NumberCIRCLES; i++) {          
			double radius = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);          
			double x = rgen.nextDouble(0, getWidth() - 2 * radius - WIDTH);          
			double y = rgen.nextDouble(0, getHeight() - 2 * radius - WIDTH);         
			
			GOval circle = new GOval(x, y, 2 * radius, 2 * radius);          
			circle.setFilled(true);     
			circle.setColor(rgen.nextColor());          
			add(circle);       
			}    
		}
	/* Private instance variable */   
	
	private RandomGenerator rgen = RandomGenerator.getInstance(); 
}
	

	