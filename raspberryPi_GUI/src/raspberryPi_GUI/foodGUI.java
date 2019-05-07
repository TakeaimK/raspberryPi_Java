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

public class foodGUI {

	private JFrame frame;

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
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(188, 143, 143));
		frame.setBounds(100, 100, 1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("Button1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button1.setBounds(45, 70, 197, 115);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("Button2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button2.setBounds(292, 70, 197, 115);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("Button3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button3.setBounds(544, 70, 197, 115);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("Button4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button4.setBounds(45, 222, 197, 115);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("Button5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button5.setBounds(292, 222, 197, 115);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("Button6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button6.setBounds(544, 222, 197, 115);
		frame.getContentPane().add(button6);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the Susi Nara!");
		lblWelcomeToThe.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.PLAIN, 47));
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToThe.setBounds(129, 10, 544, 50);
		frame.getContentPane().add(lblWelcomeToThe);
		
		JLabel payment = new JLabel("Advertisement");
		payment.setBackground(new Color(0, 0, 0));
		payment.setForeground(new Color(255, 0, 0));
		payment.setFont(new Font("aÀüÀÚ½Ã°è", Font.PLAIN, 17));
		payment.setHorizontalAlignment(SwingConstants.CENTER);
		payment.setBounds(764, 40, 183, 356);
		frame.getContentPane().add(payment);
		
		JLabel lblUser = new JLabel("User 1 : ");
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.PLAIN, 47));
		lblUser.setBounds(92, 382, 174, 50);
		frame.getContentPane().add(lblUser);
		
		JLabel label = new JLabel("13,000");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.PLAIN, 47));
		label.setBounds(225, 382, 129, 50);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\\");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("³ª´®¼Õ±Û¾¾ Ææ", Font.PLAIN, 47));
		label_1.setBounds(340, 382, 55, 50);
		frame.getContentPane().add(label_1);
		
		JButton Payment = new JButton("ÁÖ¹®ÇÏ±â");
		Payment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Payment.setBounds(750, 360, 197, 72);
		frame.getContentPane().add(Payment);
	}
}
