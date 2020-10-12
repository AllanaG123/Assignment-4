
import acm.program.*;



public class MouseTracker extends GraphicsProgram {
	
	
	public void run() {
		
	Label = new GLabel("");
	Label.setFont("Times New Roman-35");
	add(Label, 50, 50);
	
	// Must call this method to be able to get mouse events
	addMouseListeners();
	
	}
	
	//This method is called every time user moves mouse
	public void mouseMoved(MouseEvent e) {
		Label.setLabel("Mouse:( " + e.getX() + ","+ e.getY() +")
	}

	
	/* private instance variable*/
	private GLabel label;

}

