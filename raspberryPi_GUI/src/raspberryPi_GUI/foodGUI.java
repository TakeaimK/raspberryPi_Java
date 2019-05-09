package raspberryPi_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import java.awt.SystemColor;
import javax.swing.JTable;

public class foodGUI {

	private JFrame frame;
	private JTable table;
	
	//need variable
	int but1_cost=2000;
	int but2_cost=3000;
	int but3_cost=5000;
	int but4_cost=7000;
	int but5_cost=10000;
	int but6_cost=12000;
	int total_cost=0;	//RFID load data input

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					foodGUI window = new foodGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public foodGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	 public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBounds(100, 100, 764, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel costLabel = new JLabel("13,000");
		costLabel.setForeground(new Color(0, 0, 0));
		costLabel.setHorizontalAlignment(SwingConstants.CENTER);
		costLabel.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.PLAIN, 40));
		costLabel.setBounds(306, 373, 152, 42);
		costLabel.setText(total_cost+"");
		frame.getContentPane().add(costLabel);
		
		
		JButton button1 = new JButton("Button1");
		button1.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.BOLD, 20));
		button1.setBackground(new Color(255, 255, 224));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				total_cost+=but1_cost;
				costLabel.setText(total_cost+"");
			}
		});
		
		button1.setBounds(40, 70, 129, 132);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("Button2");
		button2.setBackground(new Color(255, 255, 224));
		button2.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.BOLD, 20));
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				total_cost+=but2_cost;
				costLabel.setText(total_cost+"");
			}
		});
		button2.setBounds(181, 70, 129, 132);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("Button3");
		button3.setBackground(new Color(255, 255, 224));
		button3.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.BOLD, 20));
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				total_cost+=but3_cost;
				costLabel.setText(total_cost+"");
			}
		});
		button3.setBounds(322, 70, 129, 132);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("Button4");
		button4.setBackground(new Color(255, 255, 224));
		button4.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.BOLD, 20));
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				total_cost+=but4_cost;
				costLabel.setText(total_cost+"");
			}
		});
		button4.setBounds(40, 212, 129, 132);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("Button5");
		button5.setBackground(new Color(255, 255, 224));
		button5.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.BOLD, 20));
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				total_cost+=but5_cost;
				costLabel.setText(total_cost+"");
			}
		});
		button5.setBounds(181, 212, 129, 132);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("Button6");
		button6.setBackground(new Color(255, 255, 224));
		button6.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.BOLD, 20));
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				total_cost+=but6_cost;
				costLabel.setText(total_cost+"");
			}
		});
		button6.setBounds(322, 212, 129, 132);
		frame.getContentPane().add(button6);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the Susi Nara!");
		lblWelcomeToThe.setForeground(new Color(0, 0, 0));
		lblWelcomeToThe.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.PLAIN, 47));
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToThe.setBounds(12, 11, 508, 50);
		frame.getContentPane().add(lblWelcomeToThe);
		
		JLabel payment = new JLabel("Advertisement");
		payment.setBackground(new Color(0, 0, 0));
		payment.setForeground(new Color(255, 0, 0));
		payment.setFont(new Font("aÀüÀÚ½Ã°è", Font.PLAIN, 17));
		payment.setHorizontalAlignment(SwingConstants.CENTER);
		payment.setBounds(513, 337, 189, 103);
		frame.getContentPane().add(payment);
		
		JLabel lblUser = new JLabel("User 1 : ");
		lblUser.setForeground(new Color(0, 0, 0));
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.PLAIN, 40));
		lblUser.setBounds(222, 373, 120, 42);
		frame.getContentPane().add(lblUser);
		
		JLabel label_1 = new JLabel("\\");
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.PLAIN, 40));
		label_1.setBounds(445, 373, 37, 42);
		frame.getContentPane().add(label_1);
		
		JButton Payment = new JButton("ÁÖ¹®ÇÏ±â");
		Payment.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.BOLD, 20));
		Payment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Payment.setBounds(513, 285, 189, 42);
		frame.getContentPane().add(Payment);
		
		JButton button7 = new JButton("<-");
		button7.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.BOLD, 24));
		button7.setForeground(new Color(100, 149, 237));
		button7.setBackground(new Color(100, 149, 237));
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button7.setBounds(513, 29, 91, 30);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("->");
		button8.setForeground(new Color(255, 69, 0));
		button8.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.BOLD, 23));
		button8.setBackground(new Color(255, 69, 0));
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button8.setBounds(609, 29, 91, 30);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("ÁÖ¹®»óÅÂ");
		button9.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.BOLD, 12));
		button9.setBounds(11, 358, 71, 74);
		frame.getContentPane().add(button9);
		
		JButton button10 = new JButton("°áÁ¦");
		button10.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.BOLD, 12));
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button10.setBounds(83, 358, 74, 74);
		frame.getContentPane().add(button10);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(513, 70, 189, 208);
		frame.getContentPane().add(table);
	}
}
