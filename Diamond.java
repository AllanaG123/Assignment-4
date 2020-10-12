


import java.awt.Color;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

	public class Diamond extends GraphicsProgram {

	    public void run() {
			GPolygon diamond = createDiamond (100,75);
			diamond.setFilled (true);
			diamond.setFillColor(Color.MAGENTA);
			add(diamond,getWidth() /2,getHeight() / 2);		
	    }
	    
			
		private GPolygon createDiamond(double width,double height) {
			GPolygon diamond = new GPolygon();
			diamond.addVertex (-100/ 2, 0);
			diamond.addVertex(0, -75 / 2);
			diamond.addVertex(100/2,0);
			diamond.addVertex(0, 75 /2);
			return diamond; 
			
		}
	}
		