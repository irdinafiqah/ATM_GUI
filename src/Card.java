import javax.swing.JPanel;
import javax.swing.Timer;

public class Card extends JPanel {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	int x, y, w, h, toX, toY;
	
	
	 //e is input event handler = event object that contains info regarding action
	// -> lambda expression used to implement simple event listener and I used for mouse click action
	Timer timer = new Timer(2, (e)->click()); //Timer timer = new Timer (period, action listener)
	
	public Card() {
		setLayout(null); //no layout manager is assigned and x, y is a specific component
	}
	public void transition(int tx, int ty) {
		// set target position
				toX = tx;
				toY = ty;
				// set starting position
				x = getX();
				y = getY();
				// set dimensions
				w = getWidth();
				h = getHeight();
				// start Timer (clock starts ticking)
				timer.start();
	}
	private void click() {
		if (x<toX) {
			x = x + 20;
		}
		if (y>toY) {
			y = y - 2;
		}
		// new position
		setLocation(x, y);
		repaint();
		// if target-position reached: stop timer (stop animation)
		if ((x>=toX) && (y<=toY)) {
			// lower the h
			h--;
			setSize(w, h);
			// if h is 0, timer.stop();
			if (h<=0) { 
				timer.stop();
				
			}
		}
		
	}
}
