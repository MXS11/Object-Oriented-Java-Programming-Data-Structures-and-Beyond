package GUI_modual;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	public void setup() {
		size(400,400);
		background(50,50,50);	
	}
	
	
	public void draw() {
		fill(255,204,0);
		ellipse(200, 200, 390, 390);
		//background(255,204,0);
		
		
		fill(0,0,0);
		ellipse(125,125,75,75);
		
		fill(0,0,0);
		ellipse(260,125,75,75);
		noFill();
		arc(200, 280, 80, 80, 0, PI);
		
		
	}
}
