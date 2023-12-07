import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JTextPane;
import javax.swing.UIManager;




public class Receipt extends JPanel {
	/**
	 * serialVersionUID
	 */
	
	private static final long serialVersionUID = 1L;
	int w, maxheight, h;
	JTextPane textPane;

	
	 //e is input event handler = event object that contains info regarding action
	// -> lambda expression used to implement simple event listener and I used for mouse click action
	Timer timer = new Timer(3, (e)->update()); //Timer timer = new Timer (period, action listener)
	
	public Receipt() {
		setLayout(null);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBackground(UIManager.getColor("Button.background"));
		textPane.setBounds(10, 11, 210, 334);
		add(textPane);
	
	}
	
	private void update() {
			
			// increase the h
			h++;
			setSize(w, h);
			repaint();
			if (h==maxheight) { // if h is at maximum, timer.stop();
				timer.stop();
			}
		}
	public void animates(String fcash ) {
		this.setVisible(true);
		// set dimensions
		w = getWidth();
		h = 0;
		maxheight = getHeight();
		update();
		// start Timer (clock starts ticking)
		timer.start();
		textPane.setText("------------------------------------------\n" + "RECEIPT\n\n\n\n" + "Withdraw cash RM " + fcash + "\n\n\n\n\n\n------------------------------------------\n");
	} 
	
	public void animated(String cash ) {
		this.setVisible(true);
		// set dimensions
		w = getWidth();
		h = 0;
		maxheight = getHeight();
		update();
		// start Timer (clock starts ticking)
		timer.start();
		textPane.setText("------------------------------------------\n" + "RECEIPT\n\n\n\n" + "Deposit cash RM " + cash + "\n\n\n\n\n\n------------------------------------------\n");
	} 
	
	public void transition(String failed ) {
		this.setVisible(true);
		// set dimensions
		w = getWidth();
		h = 0;
		maxheight = getHeight();
		update();
		// start Timer (clock starts ticking)
		timer.start();
		textPane.setText("------------------------------------------\n" + "RECEIPT\n\n\n\n" + "transaction failed " + failed + "\n\n\n\n\n\n------------------------------------------\n");
	} 
		
		}

	
	

