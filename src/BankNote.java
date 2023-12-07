import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;




public class BankNote extends JPanel {
	/**
	 * serialVersionUID
	 */
	
	private static final long serialVersionUID = 1L;
	int w, maxheight, h;
	private JLabel Amount;

	
	 //e is input event handler = event object that contains info regarding action
	// -> lambda expression used to implement simple event listener and I used for mouse click action
	Timer timer = new Timer(60, (e)->update()); //Timer timer = new Timer (period, action listener)
	
	public BankNote() {
		setBackground(new Color(0, 139, 139));
		Amount = new JLabel("100");
		Amount.setForeground(new Color(255, 255, 255));
		Amount.setBounds(44, 483, 221, 90);
		Amount.setFont(new Font("Arial", Font.BOLD, 17));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(Amount, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(110, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(Amount, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(146, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
	
	private void update() {
			
			// increase the h
			h++;
			setSize(w, h);
			repaint();
			if (h==maxheight) { // if h is at maximum, timer.stop();
				timer.stop();
				System.exit(h);
			}
		}
	public void animate(String fcash) {
		this.setVisible(true);
		// set dimensions
		w = getWidth();
		h = 0;
		maxheight = getHeight();
		update();
		// start Timer (clock starts ticking)
		timer.start();
		Amount.setText("RM " + fcash);
}
	
	
	}

