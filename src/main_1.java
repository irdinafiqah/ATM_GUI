	/**
	 * Irdina Afiqah Binti Nasaruddin @ Nasrodin - 1151102041
	 * Amirul Haikal Bin Azman -1191100318
	 * Rasika Chockalingam - 1201302078
	 * ATM_SIMULATOR_GUI.
	 * BJA 1034
	 */
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.Timer;


public class main_1 {

	private JFrame frame;
	private JPanel slotcard, fastbtn, deposet;
	private JTextField Disp, textamount, textrefno, textBillerId,textconfirmnum ;
	private JButton btnBal, btnWithdraw, btnDepo, btnFast, btnBill, btnTopup, btnTrans, btnbck, btnconfirmtopup;
	private JButton btnClear, btnEnter, btnproceed, btnnext, btnnext2, btnbillconfirm, btnfinishtopup, btnfund, btnfund2;;
	private String money = "10000", fcash1 = "50";
	private JTextPane result, WRONG, txtpnReturn, fixBillerID, fixtextrefno, textbillmsg, txttopup1, txttopup2;
	private Card card;
	private BankNote money_1;
	private JTextField texttopup;
	private String phno = "0172344368";
	private JTextField fundtrans2;
	private JTextField fundtrans;

	Timer timer = new Timer(5000, (e)->reset());
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_1 window = new main_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	private Object reset() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Create the application.
	 */
	public main_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 645);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // change into dispose from exit
		frame.getContentPane().setLayout(null);
		
		JPanel bckground = new JPanel();
		bckground.setBackground(new Color(211, 211, 211));
		bckground.setBounds(10, 11, 764, 584);
		frame.getContentPane().add(bckground);
		bckground.setLayout(null);
		
		money_1 = new BankNote();
		money_1.setBounds(44, 483, 221, 90);
		money_1.setVisible(false);
		bckground.add(money_1);
		
		//receipt transition
			Receipt receipt = new Receipt();
			receipt.setBounds(330, 66, 202, 224);
			receipt.setVisible(false);
			bckground.add(receipt);
			
				
				JPanel slotreceipt = new JPanel();
				slotreceipt.setBackground(new Color(192, 192, 192));
				slotreceipt.setBorder(new LineBorder(new Color(245, 245, 245), 10));
				slotreceipt.setBounds(320, 54, 221, 26);
				bckground.add(slotreceipt);
				slotreceipt.setLayout(null);
		
		
		//icon
		JLabel logo = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/logoicon.png")).getImage();
		logo.setIcon(new ImageIcon(img));
		logo.setBounds(38, 11, 137, 90);
		bckground.add(logo);
		
		JLabel receiptIcon = new JLabel("");
		Image rimg = new ImageIcon(this.getClass().getResource("/receipt_1.png")).getImage();
		receiptIcon.setIcon(new ImageIcon(rimg));
		receiptIcon.setBounds(402, 11, 48, 35);
		bckground.add(receiptIcon);
		
		JLabel cardIcon = new JLabel("");
		Image cimg = new ImageIcon(this.getClass().getResource("/card.png")).getImage();
		cardIcon.setIcon(new ImageIcon(cimg));
		cardIcon.setBounds(630, 3, 48, 48);
		bckground.add(cardIcon);
		
		JLabel moneyicon = new JLabel("");
		Image mimg = new ImageIcon(this.getClass().getResource("/money.png")).getImage();
		moneyicon.setIcon(new ImageIcon(mimg));
		moneyicon.setBounds(130, 436, 48, 35);
		bckground.add(moneyicon);
		
		
		//screen
		JPanel screen = new JPanel();
		screen.setBackground(new Color(173, 216, 230));
		screen.setBounds(38, 106, 462, 319);
		bckground.add(screen);
		screen.setLayout(null);
		
		JTextPane txtpnWelcome = new JTextPane();
		txtpnWelcome.setFont(new Font("Tahoma", Font.BOLD, 36));
		txtpnWelcome.setText("   WELCOME");
		txtpnWelcome.setForeground(new Color(255, 255, 255));
		txtpnWelcome.setEditable(false);
		txtpnWelcome.setBackground(new Color(173, 216, 230));
		txtpnWelcome.setBounds(95, 87, 260, 48);
		screen.add(txtpnWelcome);
		
				//fund transfer
		fundtrans = new JTextField();
		fundtrans.setVisible(false);
		fundtrans.setEditable(false);
		screen.add(fundtrans);
		fundtrans.setColumns(10);
		fundtrans.setBounds(241, 130, 173, 25);
		
		JTextPane txtftrans = new JTextPane();
		txtftrans.setVisible(false);
		txtftrans.setEditable(false);
		screen.add(txtftrans);
		txtftrans.setBounds(241, 130, 173, 25);
		
		fundtrans2 = new JTextField();
		fundtrans2.setVisible(false);
		fundtrans2.setEditable(false);
		screen.add(fundtrans2);
		fundtrans2.setColumns(10);
		fundtrans2.setBounds(241, 160, 173, 25);
		
		JTextPane txtftrans2 = new JTextPane();
		txtftrans2.setVisible(false);
		txtftrans2.setEditable(false);
		screen.add(txtftrans2);
		txtftrans2.setBounds(241, 160, 173, 25);
		
		JTextPane ftAccNum = new JTextPane();
		ftAccNum.setVisible(false);
		screen.add(ftAccNum);
		ftAccNum.setEditable(false);
		ftAccNum.setBounds(115, 130, 173, 25);
		ftAccNum.setText("Account No.: ");
		ftAccNum.setFont(new Font("Tahoma", Font.BOLD, 12));
		ftAccNum.setForeground(new Color(255, 255, 255));
		ftAccNum.setEditable(false);
		ftAccNum.setBackground(new Color(173, 216, 230));
		
		JTextPane ftAmount = new JTextPane();
		ftAmount.setVisible(false);
		screen.add(ftAmount);
		ftAmount.setBounds(115, 160, 173, 25);
		ftAmount.setText("Amount: ");
		ftAmount.setFont(new Font("Tahoma", Font.BOLD, 12));
		ftAmount.setForeground(new Color(255, 255, 255));
		ftAmount.setEditable(false);
		ftAmount.setBackground(new Color(173, 216, 230));
		
		JTextPane textfund = new JTextPane();
		textfund.setVisible(false);
		textfund.setEditable(false);
		textfund.setFont(new Font("Tahoma", Font.BOLD, 13));
		textfund.setForeground(new Color(255, 0, 0));
		textfund.setBackground(new Color(173, 216, 230));
		textfund.setBounds(141, 74, 311, 30);
		screen.add(textfund);
	
				//topup
		JTextPane txtpnphno = new JTextPane();
		txtpnphno.setVisible(false);
		txtpnphno.setEditable(false);
		txtpnphno.setForeground(new Color(255, 255, 255));
		txtpnphno.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtpnphno.setText("Phone Number: ");
		txtpnphno.setBackground(new Color(173, 216, 230));
		txtpnphno.setBounds(81, 120, 158, 30);
		screen.add(txtpnphno);
		
		JTextPane txtpnconfirmnum = new JTextPane();
		txtpnconfirmnum.setVisible(false);
		txtpnconfirmnum.setText("Confirm Number:");
		txtpnconfirmnum.setForeground(Color.WHITE);
		txtpnconfirmnum.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtpnconfirmnum.setEditable(false);
		txtpnconfirmnum.setBackground(new Color(173, 216, 230));
		txtpnconfirmnum.setBounds(70, 155, 170, 30);
		screen.add(txtpnconfirmnum);
		
		JTextField textphno = new JTextField();
		textphno.setEditable(false);
		textphno.setVisible(false);
		textphno.setBounds(244, 122, 170, 28);
		screen.add(textphno);
		textphno.setColumns(10);
		
		JTextPane txtpntopupamount = new JTextPane();
		txtpntopupamount.setForeground(new Color(255, 255, 255));
		txtpntopupamount.setText("Top-Up Amount:");
		txtpntopupamount.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtpntopupamount.setBackground(new Color(173, 216, 230));
		txtpntopupamount.setVisible(false);
		txtpntopupamount.setBounds(81, 195, 158, 30);
		screen.add(txtpntopupamount);
		
		texttopup = new JTextField();
		texttopup.setEditable(false);
		texttopup.setVisible(false);
		texttopup.setBounds(244, 195, 173, 30);
		screen.add(texttopup);
		texttopup.setColumns(10);
		
		txttopup1 = new JTextPane();
		txttopup1.setVisible(false);
		txttopup1.setBounds(244, 122, 170, 28);
		txttopup1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txttopup1.setBackground(Color.WHITE);
		screen.add(txttopup1);
		
		JTextPane textdisplaytopup = new JTextPane();
		textdisplaytopup.setVisible(false);
		textdisplaytopup.setFont(new Font("Tahoma", Font.BOLD, 15));
		textdisplaytopup.setBackground(new Color(173, 216, 230));
		textdisplaytopup.setBounds(95, 64, 311, 48);
		screen.add(textdisplaytopup);
		
		
		textconfirmnum = new JTextField();
		textconfirmnum.setEditable(false);
		textconfirmnum.setVisible(false);
		textconfirmnum.setBounds(244, 158, 170, 30);
		screen.add(textconfirmnum);
		textconfirmnum.setColumns(10);
		
		txttopup2 = new JTextPane();
		txttopup2.setVisible(false);
		txttopup2.setBounds(244, 158, 170, 30);
		txttopup2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txttopup2.setBackground(Color.WHITE);
		screen.add(txttopup2);
		
	
				//Bill Payment
		JTextPane txtpnBillerId = new JTextPane();
		txtpnBillerId.setEditable(false);
		txtpnBillerId.setVisible(false);
		txtpnBillerId.setForeground(new Color(255, 255, 255));
		txtpnBillerId.setText("Biller ID: ");
		txtpnBillerId.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnBillerId.setBackground(new Color(173, 216, 230));
		txtpnBillerId.setBounds(141, 108, 129, 38);
		screen.add(txtpnBillerId);
		
		JTextPane txtpnReferenceNo = new JTextPane();
		txtpnReferenceNo.setEditable(false);
		txtpnReferenceNo.setVisible(false);
		txtpnReferenceNo.setText("Reference No.: ");
		txtpnReferenceNo.setForeground(Color.WHITE);
		txtpnReferenceNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnReferenceNo.setBackground(new Color(173, 216, 230));
		txtpnReferenceNo.setBounds(81, 160, 189, 38);
		screen.add(txtpnReferenceNo);
		
		JTextPane txtpnAmount = new JTextPane();
		txtpnAmount.setEditable(false);
		txtpnAmount.setVisible(false);
		
		textamount = new JTextField();
		textamount.setVisible(false);
		textamount.setColumns(10);
		textamount.setBounds(244, 213, 173, 25);
		screen.add(textamount);
		
		textbillmsg = new JTextPane();
		textbillmsg.setEditable(false);
		textbillmsg.setFont(new Font("Tahoma", Font.BOLD, 13));
		textbillmsg.setVisible(false);
		textbillmsg.setForeground(new Color(255, 0, 0));
		textbillmsg.setBackground(new Color(173, 216, 230));
		textbillmsg.setBounds(141, 74, 311, 30);
		screen.add(textbillmsg);
		
		txtpnAmount.setText("Amount:");
		txtpnAmount.setForeground(Color.WHITE);
		txtpnAmount.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnAmount.setBackground(new Color(173, 216, 230));
		txtpnAmount.setBounds(141, 211, 129, 38);
		screen.add(txtpnAmount);
		
		textrefno = new JTextField();
		textrefno.setEditable(false);
		textrefno.setVisible(false);
		textrefno.setColumns(10);
		textrefno.setBounds(241, 160, 173, 25);
		screen.add(textrefno);
		
		fixtextrefno = new JTextPane();
		fixtextrefno.setEditable(false);
		fixtextrefno.setVisible(false);
		fixtextrefno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fixtextrefno.setForeground(new Color(255, 255, 255));
		fixtextrefno.setBackground(new Color(173, 216, 230));
		fixtextrefno.setEditable(false);
		fixtextrefno.setBounds(241, 160, 173, 25);
		screen.add(fixtextrefno);
		
		textBillerId = new JTextField();
		textBillerId.setEditable(false);
		textBillerId.setVisible(false);
		textBillerId.setBounds(244, 108, 173, 25);
		screen.add(textBillerId);
		textBillerId.setColumns(10);
		
		fixBillerID = new JTextPane();
		fixBillerID.setEditable(false);
		fixBillerID.setVisible(false);
		fixBillerID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fixBillerID.setForeground(new Color(255, 255, 255));
		fixBillerID.setBackground(new Color(173, 216, 230));
		fixBillerID.setEditable(false);
		fixBillerID.setBounds(244, 108, 173, 25);
		screen.add(fixBillerID);
		
				//text
		JTextPane txtpnenter = new JTextPane();
		txtpnenter.setFont(new Font("VCR OSD Mono", Font.PLAIN, 15));
		txtpnenter.setText("please enter card to begin.");
		txtpnenter.setForeground(new Color(255, 255, 255));
		txtpnenter.setBackground(new Color(173, 216, 230));
		txtpnenter.setEditable(false);
		txtpnenter.setBounds(60, 136, 354, 25);
		screen.add(txtpnenter);
		
		JTextPane txtpnmenu = new JTextPane();
		txtpnmenu.setVisible(false);
		txtpnmenu.setText("         MAIN MENU");
		txtpnmenu.setForeground(Color.WHITE);
		txtpnmenu.setFont(new Font("Tahoma", Font.BOLD, 36));
		txtpnmenu.setEditable(false);
		txtpnmenu.setBackground(new Color(173, 216, 230));
		txtpnmenu.setBounds(21, 14, 416, 50);
		screen.add(txtpnmenu);
		
				//pin
		JTextPane textpnPin = new JTextPane();
		textpnPin.setVisible(false);
		textpnPin.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textpnPin.setText("PIN: ");
		textpnPin.setForeground(new Color(255, 255, 255));
		textpnPin.setEditable(false);
		textpnPin.setBackground(new Color(173, 216, 230));
		textpnPin.setBounds(95, 160, 70, 38);
		screen.add(textpnPin);
		
		
		Disp = new JTextField();
		Disp.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Disp.setVisible(false);
		Disp.setForeground(new Color(255, 255, 255));
		Disp.setEditable(false);
		Disp.setBackground(new Color(173, 216, 230));
		Disp.setBounds(162, 160, 170, 30);
		screen.add(Disp);
		Disp.setColumns(10);
		
		result = new JTextPane();
		result.setVisible(false);
		result.setBackground(new Color(173, 216, 230));
		result.setEditable(false);
		result.setForeground(Color.WHITE);
		result.setFont(new Font("Tahoma", Font.BOLD, 38));
		result.setBounds(115, 164, 281, 74);
		screen.add(result);
		
		//menu
		
		btnBal = new JButton("Balance Inquiry");
		btnBal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnmenu.setText("BALANCE INQUIRY");
				txtpnenter.setVisible(true);
				txtpnenter.setText("Your Balance:");
				btnbck.setVisible(true);
				txtpnReturn.setVisible(true);
				result.setVisible(true);
				
				result.setText("RM" + money +".00");
				
				
				//close button
				btnBal.setVisible(false);
				btnWithdraw.setVisible(false);
				btnBill.setVisible(false);
				btnFast.setVisible(false);
				btnTopup.setVisible(false);
				btnDepo.setVisible(false);
				btnTrans.setVisible(false);
			}
		});
		btnBal.setVisible(false);
		btnBal.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnBal.setBounds(50, 87, 129, 38);
		screen.add(btnBal);
		
		btnWithdraw = new JButton("Cash Withdrawal");
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//page
				txtpnmenu.setText("CASH WITHDRAWAL");
				txtpnenter.setVisible(true);
				txtpnenter.setText("Please enter amount: ");
				btnbck.setVisible(true);
				txtpnReturn.setVisible(true);
				Disp.setVisible(true);
				btnproceed.setVisible(true);
				btnClear.setEnabled(true);
				
				//close button
				btnBal.setVisible(false);
				btnWithdraw.setVisible(false);
				btnBill.setVisible(false);
				btnFast.setVisible(false);
				btnTopup.setVisible(false);
				btnDepo.setVisible(false);
				btnTrans.setVisible(false);
			}
		});
		btnWithdraw.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnWithdraw.setVisible(false);
		btnWithdraw.setBounds(50, 136, 129, 38);
		screen.add(btnWithdraw);
		
		btnproceed = new JButton("Proceed");
		btnproceed.setBackground(new Color(173, 216, 230));
		btnproceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnClear.setEnabled(true);
				
				int amount = 20;
				int amount2 = 50;
				int amount3 = 100;
				int amount4 = 150;
				int amount5 = 200;
				Integer balance = Integer.parseInt(money);
				int total = balance - amount;
				int total2 = balance - amount2;
				int total3 = balance - amount3;
				int total4 = balance - amount4;
				int total5 = balance - amount5;
		
				String a = String.format("%d", amount);
				String b = String.format("%d", amount2);
				String c = String.format("%d", amount3);
				String d = String.format("%d", amount4);
				String f = String.format("%d", amount5);
			
				String tot = String.format("%d", total);
				String tot2 = String.format("%d", total2);
				String tot3 = String.format("%d", total3);
				String tot4 = String.format("%d", total4);
				String tot5 = String.format("%d", total5);
				
				
				if(balance > amount) {
					if(a.equals(Disp.getText())) {
						txtpnenter.setVisible(true);
						txtpnenter.setText(" Transaction is complete. Balance: ");
						Disp.setVisible(false);
						result.setVisible(true);
						result.setText("RM " + tot + ".00");
						receipt.animates(a);
						money_1.animate(a);
						timer.start();
					}
					
					else if(b.equals(Disp.getText())) {
						btnbck.setVisible(false);
						txtpnReturn.setVisible(false);
						Disp.setVisible(false);
						txtpnenter.setVisible(true);
						txtpnenter.setText(" Transaction is complete. Balance: ");
						result.setVisible(true);
						result.setText("RM " + tot2 + ".00");
						receipt.animates(b);
						money_1.animate(b);
						timer.start();
						
					}
					
					else if(c.equals(Disp.getText())) {
						btnbck.setVisible(false);
						txtpnReturn.setVisible(false);
						Disp.setVisible(false);
						txtpnenter.setVisible(true);
						txtpnenter.setText(" Transaction is complete. Balance: ");
						result.setVisible(true);
						result.setText("RM " + tot3 + ".00");
						receipt.animates(c);
						timer.start();
					}
					
					else if(d.equals(Disp.getText())) {
						btnbck.setVisible(false);
						txtpnReturn.setVisible(false);
						Disp.setVisible(false);
						txtpnenter.setVisible(true);
						txtpnenter.setText(" Transaction is complete. Balance: ");
						result.setVisible(true);
						result.setText("RM " + tot4 + ".00");
						receipt.animates(d);
						timer.start();
					}
					else if(f.equals(Disp.getText())) {
						Disp.setVisible(false);
						txtpnenter.setVisible(true);
						txtpnenter.setText(" Transaction is complete. Balance");
						result.setVisible(true);
						result.setText("RM " + tot5 + ".00");
						receipt.animates(f);
						money_1.animate(f);
						timer.start();
					}
					
					else {
						btnbck.setVisible(false);
						txtpnReturn.setVisible(false);
						txtpnenter.setVisible(true);
						txtpnenter.setText(" Insufficient Funds. Try again");
					}
				}else {
					txtpnenter.setVisible(true);
					txtpnenter.setText("please put amount");
				}
			
				
				}
			
		}
	);btnproceed.setFont(new Font("Tahoma", Font.PLAIN, 10));
	btnproceed.setVisible(false);
	btnproceed.setBounds(50, 270, 129, 38);
	screen.add(btnproceed);
	
	
	
		btnBill = new JButton("Bill Payment");
		btnBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//page
				txtpnmenu.setText("BILL PAYMENT");
				txtpnenter.setVisible(false);
				btnbck.setVisible(true);
				txtpnReturn.setVisible(true);
				btnClear.setEnabled(true);
				
				
				//action
				txtpnBillerId.setVisible(true);
				textBillerId.setVisible(true);
				textBillerId.setText(null);
				btnnext.setVisible(true);
				textbillmsg.setVisible(true);
				
				//close button
				btnBal.setVisible(false);
				btnWithdraw.setVisible(false);
				btnBill.setVisible(false);
				btnFast.setVisible(false);
				btnTopup.setVisible(false);
				btnDepo.setVisible(false);
				btnTrans.setVisible(false);
			}
		});
		btnBill.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnBill.setVisible(false);
		btnBill.setBounds(50, 185, 129, 38);
		screen.add(btnBill);
		
		
		btnnext = new JButton("Next");
		btnnext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String billerID1 = "001" ;
				String billerID2 = "002" ;
				String billerID3 = "003" ;
				if ( billerID1.equals(textBillerId.getText()))
				{
					textbillmsg.setText("Phone Bill");
					textBillerId.setVisible(false);
					fixBillerID.setVisible(true);
					fixBillerID.setText(billerID1);
					txtpnReferenceNo.setVisible(true);
					textrefno.setVisible(true);
					textrefno.setText(null);
					btnnext.setVisible(false);
					btnnext2.setVisible(true);
					btnbck.setVisible(false);
					txtpnReturn.setVisible(false);
				}
				else if ( billerID2.equals(textBillerId.getText()))
				{
					textbillmsg.setText("Water Bill");
					textBillerId.setVisible(false);
					fixBillerID.setVisible(true);
					fixBillerID.setText(billerID1);
					txtpnReferenceNo.setVisible(true);
					textrefno.setVisible(true);
					textrefno.setText(null);
					btnnext2.setVisible(true);
					btnbck.setVisible(false);
					btnnext.setVisible(false);
					txtpnReturn.setVisible(false);
				}
				else if (billerID3.equals(textBillerId.getText()))
				{
					textbillmsg.setText("Electricity Bill");
					textBillerId.setVisible(false);
					fixBillerID.setVisible(true);
					fixBillerID.setText(billerID1);
					txtpnReferenceNo.setVisible(true);
					textrefno.setVisible(true);
					textrefno.setText(null);
					btnnext2.setVisible(true);
					btnbck.setVisible(false);
					btnnext.setVisible(false);
					txtpnReturn.setVisible(false);
					
				}
				else {textbillmsg.setText("This Biller ID is not registered with us.");}
				
			}
		});
		btnnext.setForeground(new Color(255, 105, 180));
		btnnext.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnnext.setVisible(false);
		btnnext.setBounds(178, 259, 106, 30);
		screen.add(btnnext);
		
		
		btnnext2 = new JButton("Next");
		btnnext2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String refno = "34567";
				if ( refno.equals(textrefno.getText())) 
				{
					textrefno.setVisible(false);
					fixtextrefno.setVisible(true);
					fixtextrefno.setText(refno);
					btnbillconfirm.setVisible(true);
					txtpnAmount.setVisible(true);
					textamount.setVisible(true);
					textamount.setText(null);
					btnnext2.setVisible(false);
				}
				else 
				{
					textbillmsg.setText("Incorrect Ref. No.");
				}
			}
		});
		btnnext2.setVisible(false);
		btnnext2.setForeground(new Color(255, 105, 180));
		btnnext2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnnext2.setBounds(178, 259, 106, 30);
		screen.add(btnnext2);
		
		btnbillconfirm = new JButton("Confirm");
		btnbillconfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String failed = "0";
				int number = Integer.parseInt(textamount.getText().toString());
				
				if(number < 10000)
				{
					textbillmsg.setText("Payment complete.");
				}
				else 
				{
					
					receipt.transition(failed);
					timer.start();
					textbillmsg.setText("Insufficient Funds");
					}
				
			}
		});
		btnbillconfirm.setForeground(new Color(255, 105, 180));
		btnbillconfirm.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnbillconfirm.setVisible(false);
		btnbillconfirm.setBounds(178, 259, 106, 30);
		screen.add(btnbillconfirm);
		
		btnFast = new JButton("Fast Cash");
		btnFast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnmenu.setText("FAST CASH");
				txtpnenter.setVisible(false);
				btnbck.setVisible(true);
				fastbtn.setVisible(true);
				txtpnReturn.setVisible(true);
				
				
				//close button
				btnBal.setVisible(false);
				btnWithdraw.setVisible(false);
				btnBill.setVisible(false);
				btnFast.setVisible(false);
				btnTopup.setVisible(false);
				btnDepo.setVisible(false);
				btnTrans.setVisible(false);
			}
		});
		btnFast.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnFast.setVisible(false);
		btnFast.setBounds(280, 185, 129, 38);
		screen.add(btnFast);
		
		
		JButton btnoktopup = new JButton("OK");
		btnoktopup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ( phno.equals(textphno.getText()))
				{
					textdisplaytopup.setText("Please Confirm your number");
					txtpnconfirmnum.setVisible(true);
					txtpnenter.setVisible(false);
					textconfirmnum.setVisible(true);
					textconfirmnum.setText(null);
					btnoktopup.setVisible(false);
					btnconfirmtopup.setVisible(true);
					textphno.setVisible(false);
					txttopup1.setVisible(true);
					txttopup1.setText(phno);
					btnbck.setVisible(false);
					txtpnReturn.setVisible(false);
				}
				else 
				{
					textdisplaytopup.setText("Please enter a valid phone number");
				}
			}
		});
		btnoktopup.setVisible(false);
		btnoktopup.setForeground(new Color(255, 105, 180));
		btnoktopup.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnoktopup.setBounds(179, 259, 105, 30);
		screen.add(btnoktopup);
		
		btnconfirmtopup = new JButton("Confirm");
		btnconfirmtopup.setVisible(false);
		btnconfirmtopup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (phno.equals(textconfirmnum.getText()))
				{
					textdisplaytopup.setText("Phone number is confirmed");
					textconfirmnum.setVisible(false);
					txttopup2.setVisible(true);
					txttopup2.setText(phno);
					txtpntopupamount.setVisible(true);
					texttopup.setVisible(true);
					texttopup.setText(null);
					btnfinishtopup.setVisible(true);
					btnconfirmtopup.setVisible(false);
				}
				else 
				{
					textdisplaytopup.setText("Phone numbers do not match.");
				}
			}
		});
		
		
		btnconfirmtopup.setForeground(new Color(255, 105, 180));
		btnconfirmtopup.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnconfirmtopup.setBounds(179, 259, 105, 30);
		screen.add(btnconfirmtopup);
		
		
		btnTopup = new JButton("Topup");
		btnTopup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//page
				txtpnmenu.setText("TOP-UP");
				txtpnenter.setVisible(false);
				btnbck.setVisible(true);
				txtpnReturn.setVisible(true);
				txtpnphno.setVisible(true);
				textphno.setVisible(true);
				btnoktopup.setVisible(true);
				textdisplaytopup.setVisible(true);
				textphno.setText(null);
				btnClear.setEnabled(true);
				
				//close button
				btnBal.setVisible(false);
				btnWithdraw.setVisible(false);
				btnBill.setVisible(false);
				btnFast.setVisible(false);
				btnTopup.setVisible(false);
				btnDepo.setVisible(false);
				btnTrans.setVisible(false);
			}
		});
		btnTopup.setVisible(false);
		btnTopup.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTopup.setBounds(280, 136, 129, 38);
		screen.add(btnTopup);
		textamount.setColumns(10);
		textamount.setBounds(244, 213, 173, 25);
		screen.add(textamount);
		
		btnfinishtopup = new JButton("Top-Up");
		btnfinishtopup.setVisible(false);
		btnfinishtopup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String failed = "0";
				if(money.compareTo(texttopup.getText()) < 10000)
				{
					receipt.transition(failed);
					textdisplaytopup.setText("Insufficient Funds");
				}
				else 
				{
					texttopup.setText(texttopup.getText());
					textdisplaytopup.setText("Payment complete.");
				}
			}
		});
		btnfinishtopup.setForeground(new Color(255, 105, 180));
		btnfinishtopup.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnfinishtopup.setBounds(179, 259, 105, 30);
		screen.add(btnfinishtopup);
		
		
		
		deposet = new JPanel();
		deposet.setVisible(false);
		deposet.setBounds(70, 74, 254, 195);
		screen.add(deposet);
		deposet.setLayout(new GridLayout(2, 2, 0, 0));
		
		JButton btndepo1 = new JButton("RM20");
		btndepo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cash = 20;
				Integer bal = Integer.parseInt(money);
				int Totalbal = bal + cash;
				String tbal = Integer.toString(Totalbal);
				deposet.setVisible(false);
				txtpnenter.setVisible(true);
				txtpnenter.setText("Current Balance: ");
				result.setVisible(true);
				result.setText("RM" + tbal +".00");
				btnbck.setVisible(false);
				txtpnReturn.setVisible(false);
				receipt.animated("20");
			}
		});
		deposet.add(btndepo1);
		
		JButton btndepo2 = new JButton("RM50");
		btndepo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cash = 50;
				Integer bal = Integer.parseInt(money);
				int Totalbal = bal + cash;
				String tbal = Integer.toString(Totalbal);
				deposet.setVisible(false);
				txtpnenter.setVisible(true);
				txtpnenter.setText("Current Balance: ");
				result.setVisible(true);
				result.setText("RM" + tbal +".00");
				btnbck.setVisible(false);
				txtpnReturn.setVisible(false);
				receipt.animated("50");
			}
		});
		deposet.add(btndepo2);
		
		JButton btndepo3 = new JButton("RM100");
		btndepo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cash = 100;
				Integer bal = Integer.parseInt(money);
				int Totalbal = bal + cash;
				String tbal = Integer.toString(Totalbal);
				deposet.setVisible(false);
				txtpnenter.setVisible(true);
				txtpnenter.setText("Current Balance: ");
				result.setVisible(true);
				result.setText("RM" + tbal +".00");
				btnbck.setVisible(false);
				txtpnReturn.setVisible(false);
				receipt.animated("100");
			}
		});
		deposet.add(btndepo3);
		
		JButton btndepo4 = new JButton("RM1000");
		btndepo4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cash = 1000;
				Integer bal = Integer.parseInt(money);
				int Totalbal = bal + cash;
				String tbal = Integer.toString(Totalbal);
				deposet.setVisible(false);
				txtpnenter.setVisible(true);
				txtpnenter.setText("Current Balance: ");
				result.setVisible(true);
				result.setText("RM" + tbal +".00");
				btnbck.setVisible(false);
				txtpnReturn.setVisible(false);
				receipt.animated("1000");
			}
		});
		deposet.add(btndepo4);
		
		btnDepo = new JButton("Deposit Cash");
		btnDepo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnmenu.setText("DEPOSIT CASH");
				txtpnenter.setVisible(false);
				btnbck.setVisible(true);
				txtpnReturn.setVisible(true);
				
				//action
				deposet.setVisible(true);
				btnClear.setEnabled(true);
				
				
				//close button
				btnBal.setVisible(false);
				btnWithdraw.setVisible(false);
				btnBill.setVisible(false);
				btnFast.setVisible(false);
				btnTopup.setVisible(false);
				btnDepo.setVisible(false);
				btnTrans.setVisible(false);
			}
		});
		btnDepo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnDepo.setVisible(false);
		btnDepo.setBounds(280, 87, 129, 38);
		screen.add(btnDepo);
		
		//fund transfer
		
		btnTrans = new JButton("Fund Transfer");
		btnTrans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//page
				txtpnmenu.setText("FUND TRANSFER");
				txtpnenter.setVisible(false);
				btnbck.setVisible(true);
				txtpnReturn.setVisible(true);
				fundtrans2.setVisible(false);
				fundtrans.setVisible(true);
				fundtrans.setText(null);
				ftAccNum.setVisible(true);
				ftAmount.setVisible(false);
				btnfund.setVisible(true);
				textfund.setVisible(true);
				btnClear.setEnabled(true);
				
				
				//close button
				btnBal.setVisible(false);
				btnWithdraw.setVisible(false);
				btnBill.setVisible(false);
				btnFast.setVisible(false);
				btnTopup.setVisible(false);
				btnDepo.setVisible(false);
				btnTrans.setVisible(false);
			}
		});
		btnTrans.setVisible(false);
		btnTrans.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTrans.setBounds(50, 234, 129, 38);
		screen.add(btnTrans);
		
		btnfund = new JButton("Next");
		btnfund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String AccID = "123456" ;
				
				if ( AccID.equals(fundtrans.getText()))
				{
					btnbck.setVisible(false);
					txtpnReturn.setVisible(false);
					ftAccNum.setVisible(true);
					txtftrans.setVisible(true);
					txtftrans.setText(AccID);
					fundtrans.setVisible(false);
					ftAmount.setVisible(true);
					fundtrans2.setVisible(true);
					fundtrans2.setEditable(false);
					fundtrans2.setText(null);
					btnfund2.setVisible(true);
					btnfund.setVisible(false);
					textfund.setVisible(false);
					
					
				}
				else 
				{
					textfund.setText("Incorrect Account num");
					fundtrans.setText(null);
				}
				
			}
		});
		btnfund.setBackground(new Color(173, 216, 230));
		btnfund.setBounds(189, 285, 89, 23);
		screen.add(btnfund);
		btnfund.setVisible(false);
		
		btnfund2 = new JButton("Transfer");
		btnfund2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String failed = "0";
				int number = Integer.parseInt(fundtrans2.getText().toString());
				
				if(number < 10000)
				{
					textfund.setVisible(true);
					textfund.setText("Transfer is complete.");
				}
				else 
				{
					
					btnfund2.setVisible(false);
					textfund.setVisible(true);
					receipt.transition(failed);
					textfund.setText("Insufficient Funds");
					}
			
				
			}
		});
		btnfund2.setBackground(new Color(173, 216, 230));
		btnfund2.setBounds(189, 285, 89, 23);
		screen.add(btnfund2);
		btnfund2.setVisible(false);
			
		
		JPanel slotmoney = new JPanel();
		slotmoney.setBorder(new LineBorder(new Color(245, 245, 245), 10));
		slotmoney.setBackground(Color.LIGHT_GRAY);
		slotmoney.setBounds(27, 472, 255, 26);
		bckground.add(slotmoney);
		
		
		//return button
		btnbck = new JButton("");
		btnbck.setAlignmentY(Component.TOP_ALIGNMENT);
		btnbck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnenter.setVisible(false);
				result.setVisible(false);
				fastbtn.setVisible(false);
				txtpnReturn.setVisible(false);
				btnbck.setVisible(false);
				btnproceed.setVisible(false);
				Disp.setVisible(false);
				textBillerId.setVisible(false);
				txtpnBillerId.setVisible(false);
				btnnext.setVisible(false);
				btnnext2.setVisible(false);
				textbillmsg.setVisible(false);
				deposet.setVisible(false);
				btnoktopup.setVisible(false);
				txtpnphno.setVisible(false);
				textphno.setVisible(false);
				btnoktopup.setVisible(false);
				textdisplaytopup.setVisible(false);
				ftAccNum.setVisible(false);
				fundtrans.setVisible(false);
				ftAmount.setVisible(false);
				btnfund2.setVisible(false);
				btnfund.setVisible(false);
				textfund.setVisible(false);
				
				//recall menu
				txtpnmenu.setText("         MAIN MENU");
				btnBal.setVisible(true);
				btnWithdraw.setVisible(true);
				btnBill.setVisible(true);
				btnFast.setVisible(true);
				btnTopup.setVisible(true);
				btnDepo.setVisible(true);
				btnTrans.setVisible(true);
				
				
			}
		});
		btnbck.setVisible(false);
		btnbck.setBorderPainted(false);
		btnbck.setBackground(Color.WHITE);
		btnbck.setForeground(Color.WHITE);
		btnbck.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnbck.setBounds(356, 293, 18, 15);
		screen.add(btnbck);
		
		WRONG = new JTextPane();
		WRONG.setVisible(false);
		WRONG.setText("WRONG! Try again.");
		WRONG.setFont(new Font("Tahoma", Font.PLAIN, 12));
		WRONG.setBackground(new Color(173, 216, 230));
		WRONG.setForeground(Color.RED);
		WRONG.setBounds(162, 200, 247, 38);
		screen.add(WRONG);
		
		fastbtn = new JPanel();
		fastbtn.setVisible(false);
		fastbtn.setBounds(50, 66, 361, 206);
		screen.add(fastbtn);
		fastbtn.setLayout(new GridLayout(3, 2, 0, 0));
		
		//fast cash
		JButton btn50 = new JButton("RM 50");
		btn50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcash = new String(fcash1);
				btnbck.setVisible(false);
				fastbtn.setVisible(false);
				txtpnReturn.setVisible(false);
				
				//action
				txtpnmenu.setText("CASH WITHDRAWAL");
				txtpnenter.setVisible(true);
				txtpnenter.setText("Please take your money and receipt");
				money_1.animate(fcash);
				receipt.setVisible(true);
				receipt.animates(fcash);
				timer.start();
			}
		});
		fastbtn.add(btn50);
		
		JButton btn100 = new JButton("RM 100");
		btn100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcash = "100"; 
				btnbck.setVisible(false);
				fastbtn.setVisible(false);
				txtpnReturn.setVisible(false);
				
				//action
				txtpnmenu.setText("CASH WITHDRAWAL");
				txtpnenter.setVisible(true);
				txtpnenter.setText("Please take your money and receipt");
				money_1.animate(fcash);
				receipt.setVisible(true);
				receipt.animates(fcash);
				timer.start();
			}
		});
		fastbtn.add(btn100);
		
		JButton btn150 = new JButton("RM 150");
		btn150.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcash = "150";
				btnbck.setVisible(false);
				fastbtn.setVisible(false);
				txtpnReturn.setVisible(false);
				
				//action
				txtpnmenu.setText("CASH WITHDRAWAL");
				txtpnenter.setVisible(true);
				txtpnenter.setText("Please take your money and receipt");
				money_1.animate(fcash);
				receipt.setVisible(true);
				receipt.animates(fcash);
				timer.start();
			}
		});
		fastbtn.add(btn150);
		
		JButton btn250 = new JButton("RM 250");
		btn250.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcash = "250";
				btnbck.setVisible(false);
				fastbtn.setVisible(false);
				txtpnReturn.setVisible(false);
				
				//action
				txtpnmenu.setText("CASH WITHDRAWAL");
				txtpnenter.setVisible(true);
				txtpnenter.setText("Please take your money and receipt");
				money_1.animate(fcash);
				receipt.setVisible(true);
				receipt.animates(fcash);
				timer.start();
			}
		});
		fastbtn.add(btn250);
		
		JButton btn500 = new JButton("RM 500");
		btn500.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcash = "500";
				btnbck.setVisible(false);
				fastbtn.setVisible(false);
				txtpnReturn.setVisible(false);
				
				//action
				txtpnmenu.setText("CASH WITHDRAWAL");
				txtpnenter.setVisible(true);
				txtpnenter.setText("Please take your money and receipt");
				money_1.animate(fcash);
				receipt.setVisible(true);
				receipt.animates(fcash);
				timer.start();
			}
		});
		fastbtn.add(btn500);
		
		JButton btn1000 = new JButton("RM 1000");
		btn1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcash = "1000";
				btnbck.setVisible(false);
				fastbtn.setVisible(false);
				txtpnReturn.setVisible(false);
				
				//action
				txtpnmenu.setText("CASH WITHDRAWAL");
				txtpnenter.setVisible(true);
				txtpnenter.setText("Please take your money and receipt");
				money_1.animate(fcash);
				receipt.setVisible(true);
				receipt.animates(fcash);
				timer.start();
			}
		});
		fastbtn.add(btn1000);
		
		
		txtpnReturn = new JTextPane();
		txtpnReturn.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtpnReturn.setAlignmentY(0.1f);
		txtpnReturn.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnReturn.setVisible(false);
		txtpnReturn.setEditable(false);
		txtpnReturn.setText("Return");
		txtpnReturn.setForeground(new Color(255, 255, 255));
		txtpnReturn.setBackground(new Color(173, 216, 230));
		txtpnReturn.setBounds(382, 287, 70, 21);
		screen.add(txtpnReturn);
			

		
		
		
		//keypad
		JPanel keypad = new JPanel();
		keypad.setVisible(false);
		keypad.setBounds(516, 181, 218, 200);
		bckground.add(keypad);
		keypad.setLayout(new GridLayout(4, 3, 0, 0));
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disp.setText(Disp.getText() + "1");
				textBillerId.setText(textBillerId.getText()+ "1");
				textrefno.setText(textrefno.getText() + "1");
				textamount.setText(textamount.getText() + "1");
				textphno.setText(textphno.getText() + "1");
				texttopup.setText(texttopup.getText() + "1");
				textconfirmnum.setText(textconfirmnum.getText() + "1");
				fundtrans2.setText(fundtrans2.getText() + "1");
				fundtrans.setText(fundtrans.getText() + "1");
				
			}
		});
		keypad.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disp.setText(Disp.getText() + "2");
				textBillerId.setText(textBillerId.getText()+ "2");
				textrefno.setText(textrefno.getText() + "2");
				textamount.setText(textamount.getText() + "2");
				textphno.setText(textphno.getText() + "2");
				texttopup.setText(texttopup.getText() + "2");
				textconfirmnum.setText(textconfirmnum.getText() + "2");
				fundtrans2.setText(fundtrans2.getText() + "2");
				fundtrans.setText(fundtrans.getText() + "2");
			}
		});
		keypad.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disp.setText(Disp.getText() + "3");
				textBillerId.setText(textBillerId.getText()+ "3");
				textrefno.setText(textrefno.getText() + "3");
				textamount.setText(textamount.getText() + "3");
				textphno.setText(textphno.getText() + "3");
				texttopup.setText(texttopup.getText() + "3");
				textconfirmnum.setText(textconfirmnum.getText() + "3");
				fundtrans2.setText(fundtrans2.getText() + "3");
				fundtrans.setText(fundtrans.getText() + "3");
				
			}
		});
		keypad.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disp.setText(Disp.getText() + "4");
				textBillerId.setText(textBillerId.getText()+ "4");
				textrefno.setText(textrefno.getText() + "4");
				textamount.setText(textamount.getText() + "4");
				textphno.setText(textphno.getText() + "4");
				texttopup.setText(texttopup.getText() + "4");
				textconfirmnum.setText(textconfirmnum.getText() + "4");
				fundtrans2.setText(fundtrans2.getText() + "4");
				fundtrans.setText(fundtrans.getText() + "4");
			}
		});
		keypad.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disp.setText(Disp.getText() + "5");
				textBillerId.setText(textBillerId.getText()+ "5");
				textrefno.setText(textrefno.getText() + "5");
				textamount.setText(textamount.getText() + "5");
				textphno.setText(textphno.getText() + "5");
				texttopup.setText(texttopup.getText() + "5");
				textconfirmnum.setText(textconfirmnum.getText() + "5");
				fundtrans2.setText(fundtrans2.getText() + "5");
				fundtrans.setText(fundtrans.getText() + "5");
				
			}
		});
		keypad.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disp.setText(Disp.getText() + "6");
				textBillerId.setText(textBillerId.getText()+ "6");
				textrefno.setText(textrefno.getText() + "6");
				textamount.setText(textamount.getText() + "6");
				textphno.setText(textphno.getText() + "6");
				texttopup.setText(texttopup.getText() + "6");
				textconfirmnum.setText(textconfirmnum.getText() + "6");
				fundtrans2.setText(fundtrans2.getText() + "6");
				fundtrans.setText(fundtrans.getText() + "6");
			}
		});
		keypad.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disp.setText(Disp.getText() + "7");
				textBillerId.setText(textBillerId.getText()+ "7");
				textrefno.setText(textrefno.getText() + "7");
				textamount.setText(textamount.getText() + "7");
				textphno.setText(textphno.getText() + "7");
				texttopup.setText(texttopup.getText() + "7");
				textconfirmnum.setText(textconfirmnum.getText() + "7");
				fundtrans2.setText(fundtrans2.getText() + "7");
				fundtrans.setText(fundtrans.getText() + "7");
			}
		});
		keypad.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disp.setText(Disp.getText() + "8");
				textBillerId.setText(textBillerId.getText()+ "8");
				textrefno.setText(textrefno.getText() + "8");
				textamount.setText(textamount.getText() + "8");
				textphno.setText(textphno.getText() + "8");
				texttopup.setText(texttopup.getText() + "8");
				textconfirmnum.setText(textconfirmnum.getText() + "8");
				fundtrans2.setText(fundtrans2.getText() + "8");
				fundtrans.setText(fundtrans.getText() + "8");
			}
		});
		keypad.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disp.setText(Disp.getText() + "9");
				textBillerId.setText(textBillerId.getText()+ "9");
				textrefno.setText(textrefno.getText() + "9");
				textamount.setText(textamount.getText() + "9");
				textphno.setText(textphno.getText() + "9");
				texttopup.setText(texttopup.getText() + "9");
				textconfirmnum.setText(textconfirmnum.getText() + "9");
				fundtrans2.setText(fundtrans2.getText() + "9");
				fundtrans.setText(fundtrans.getText() + "9");
			}
		});
		keypad.add(btn9);
		
		JButton btnempty = new JButton("");
		keypad.add(btnempty);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disp.setText(Disp.getText() + "0");
				textBillerId.setText(textBillerId.getText()+ "0");
				textrefno.setText(textrefno.getText() + "0");
				textamount.setText(textamount.getText() + "0");
				textphno.setText(textphno.getText() + "0");
				texttopup.setText(texttopup.getText() + "0");
				textconfirmnum.setText(textconfirmnum.getText() + "0");
				fundtrans2.setText(fundtrans2.getText() + "0");
				fundtrans.setText(fundtrans.getText() + "0");
			
			}
		});
		keypad.add(btn0);
		
		JButton btnempty_2 = new JButton("");
		keypad.add(btnempty_2);
		
		
		
		
		
		//enter, cancel, clear button
		JPanel special = new JPanel();
		special.setVisible(false);
		special.setBounds(510, 392, 232, 59);
		bckground.add(special);
		special.setLayout(new GridLayout(0, 3, 0, 0));
		
		btnEnter = new JButton("ENTER");
		btnEnter.setEnabled(false);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = Disp.getText();
				String pinEntry = "0401";     //pin = 0401
				while(true) {
				if (pinEntry.equals(text)) {
					Disp.setVisible(false);
					textpnPin.setVisible(false);
					txtpnenter.setVisible(false); 
					btnEnter.setEnabled(false);
					btnClear.setEnabled(false);
					txtpnWelcome.setVisible(false);
					
					//menu visible
					txtpnmenu.setVisible(true);
					btnBal.setVisible(true);
					btnWithdraw.setVisible(true);
					btnBill.setVisible(true);
					btnFast.setVisible(true);
					btnTopup.setVisible(true);
					btnDepo.setVisible(true);
					btnTrans.setVisible(true);
					btnbck.setVisible(false);
					WRONG.setVisible(false);
					Disp.setText(null);
					
					break;				
				}else {
					WRONG.setVisible(true);
					Disp.setText(null);
					return;
					}
				
				}
			
				

				
			}
		});
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnEnter.setBackground(new Color(34, 139, 34));
		btnEnter.setForeground(new Color(0, 0, 0));
		special.add(btnEnter);
		
		btnClear = new JButton("CLEAR");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disp.setText(null);
				textBillerId.setText(null);
				textrefno.setText(null);
				textamount.setText(null);
				textphno.setText(null);
				textconfirmnum.setText(null);
				fundtrans.setText(null);
				fundtrans2.setText(null);
			}
		});
		btnClear.setBackground(new Color(255, 255, 0));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 9));
		special.add(btnClear);
		
	
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("CANCEL");
				if(JOptionPane.showConfirmDialog(frame, "Thank you")== JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			

			}

			
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnCancel.setBackground(new Color(255, 0, 0));
		special.add(btnCancel);
		
	
		
		
				//card transition
	
		card = new Card();
		card.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				card.transition(slotcard.getX()+10, slotcard.getY()+10);
				txtpnWelcome.setVisible(false);
				txtpnenter.setText("click cancel to exit");
				
				//pin
				textpnPin.setVisible(true);
				Disp.setVisible(true);
				keypad.setVisible(true);
				btnEnter.setEnabled(true);
				btnClear.setEnabled(true);
				special.setVisible(true);
			}
		});
		card.setBackground(new Color(216, 191, 216));
		card.setBounds(592, 64, 122, 150);
		bckground.add(card);
				
				slotcard = new JPanel();
				slotcard.setBackground(new Color(192, 192, 192));
				slotcard.setBorder(new LineBorder(new Color(245, 245, 245), 10));
				slotcard.setBounds(564, 54, 170, 26);
				bckground.add(slotcard);
				
				
		
			
	
				
						
		
	}
}
