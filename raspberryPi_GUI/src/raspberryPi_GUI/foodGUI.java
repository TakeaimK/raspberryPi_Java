package raspberryPi_GUI;
 
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class foodGUI {
    int count = 0;
    String show = "";
    String a = "";
 
    void socket(String a) {
    	Socket socket = null;
		
		try{

			socket = new Socket();

			System.out.println("[[Connecting]]");

			socket.connect(new InetSocketAddress("192.168.10.18", 8888));

			System.out.println("[[Connected]]");

			byte[] bytes = null;
	
			String message = null;

//Tag Throwing

			OutputStream os = socket.getOutputStream();

			/*
			Scanner scan = new Scanner(System.in);

			message = scan.nextLine();//Tag Num...
*/
			message = "RFIDTag\n";
			bytes = message.getBytes("UTF-8");

			os.write(bytes);

			os.flush();
	
			System.out.println("[[TagNum Throwing Success]]");


//Menu Throwing

			message = a;

			bytes = message.getBytes("UTF-8");

			os.write(bytes);

			os.flush();
	
			System.out.println("[[Menu Throwing Success]]");

			InputStream is = socket.getInputStream();


			
//bytes = new byte[100];

			//int readByteCount = is.read(bytes);

			//message = new String(bytes, 0, readByteCount, "UTF-8");
						//System.out.println("[[Data receving Success]]" + message);

			os.close();

			is.close();
	
	}catch(Exception e) {}


	if(!socket.isClosed()){

			try{

				socket.close();

			}catch(IOException e1) {}

		}

		
	
	}
    
    
    //Food
    public foodGUI() {
 
        // 디자인단
        // 프레임 설정단
        JFrame frame = new JFrame("초밥 자동 판매기");
        frame.setBounds(0, 0, 764, 450);
        frame.setBackground(Color.white);
 
        // 폰트
        Font font = new Font("나눔고딕", Font.PLAIN, 15);
 
        // 북쪽
        Panel pNorth = new Panel();
        pNorth.setBackground(new Color(0, 0, 0));
        pNorth.setLayout(null);
        pNorth.setSize(0, 500);
        pNorth.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 15));
 
        // 배열 설정 부분
        String menu[] = { "salmon", "flat", "tuna", "eel", "beef", "cuttle"};
        int price[] = { 3000, 2500, 3500, 3000, 2800, 2500};
        JButton bt[] = new JButton[menu.length];
        TextField suja[] = new TextField[menu.length];
        Button minus[] = new Button[menu.length];
        Button plus[] = new Button[menu.length];
        JButton ok[] = new JButton[menu.length];
        Label l[] = new Label[menu.length];
        ImageIcon icon[] = new ImageIcon[menu.length];
 
        // 버튼 설정 부분
        for (int i = 0; i < menu.length; i++) {
 
            // 초밥 버튼
            bt[i] = new JButton(menu[i]);
            if (i < 3) {
                bt[i].setBounds(25 + i * 150, 50, 100, 80);
            } else {
                bt[i].setBounds(25 + (i -3) * 150, 230, 100, 80);
            }
            bt[i].setVerticalAlignment(SwingConstants.BOTTOM);
            icon[i] = new ImageIcon("images/icon/" + menu[i] + ".jpg");
            bt[i].setIcon(icon[i]);
 
            // 숫자 txt 버튼
            suja[i] = new TextField("0");
            suja[i].setBackground(Color.white);
            suja[i].setEditable(false);
            suja[i].setBounds(bt[i].getX() + 30, bt[i].getY() + 100, 40, 20);
 
            // "-" 버튼
            minus[i] = new Button("-");
            minus[i].setBounds(bt[i].getX(), suja[i].getY(), 20, 20);
            minus[i].setForeground(new Color(255,255,255));
            minus[i].setEnabled(false);
 
            // "+" 버튼
            plus[i] = new Button("+");
            plus[i].setBounds(bt[i].getX() + (100 - 20), suja[i].getY(), 20, 20);
            plus[i].setForeground(new Color(255,255,255));
            plus[i].setEnabled(false);
 
            // 가격
            l[i] = new Label(menu[i] +" "+ price[i] +"");
            l[i].setFont(font);
            l[i].setForeground(new Color(255, 255, 255));
            l[i].setBounds(bt[i].getX() -1, suja[i].getY() - 18, 100, 20);
 
            // 확인 버튼
            ok[i] = new JButton("확인");
            ok[i].setBounds(bt[i].getX(), suja[i].getY() + 20, 100, 20);
            ok[i].setForeground(new Color(255,255,255));
            ok[i].setEnabled(false);
 
            pNorth.add(bt[i]);
            pNorth.add(suja[i]);
            pNorth.add(minus[i]);
            pNorth.add(plus[i]);
            pNorth.add(l[i]);
            pNorth.add(ok[i]);
        }
 
        // 남쪽
        Panel pSouth = new Panel();
        pSouth.setForeground(new Color(255, 255, 255));
        pSouth.setFont(font);
        pSouth.setBackground(new Color(255, 255, 255));
 
 
        // 컴포넌트
        frame.getContentPane().add(pNorth, BorderLayout.NORTH);
        
               // 중앙
               TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
               ta.setBounds(502, 28, 225, 250);
               pNorth.add(ta);
               ta.setText("상품명    합계   수량\r\n\r\n");
               ta.setBackground(Color.white);
               ta.setEditable(false);
               ta.setFont(new Font("Monospaced", Font.BOLD, 15));
               
                      Button bt1 = new Button("Order");
                      bt1.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 12));
                      bt1.setForeground(new Color(255,255,255));
                      bt1.setBounds(502, 351, 51, 30);
                      pNorth.add(bt1);
                      Button bt2 = new Button("Reset");
                      bt2.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 12));
                      bt2.setForeground(new Color(255,255,255));
                      bt2.setBounds(575, 351, 69, 30);
                      pNorth.add(bt2);
                      Button bt3 = new Button("Exit");
                      bt3.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 12));
                      bt3.setForeground(new Color(255,255,255));
                      bt3.setBounds(675, 351, 51, 30);
                      pNorth.add(bt3);
                      
                      JLabel lblWelcomeToSusi = new JLabel("Welcome to Sushi Nara!");
                      lblWelcomeToSusi.setForeground(new Color(255, 255, 255));
                      lblWelcomeToSusi.setHorizontalAlignment(SwingConstants.CENTER);
                      lblWelcomeToSusi.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 24));
                      lblWelcomeToSusi.setBounds(66, 10, 345, 30);
                      pNorth.add(lblWelcomeToSusi);
                      
                      
                             //bt3 닫기버튼
                             
                             bt3.addActionListener(new ActionListener() {
                                 
                                 @Override
                                 public void actionPerformed(ActionEvent e) {
                                     System.exit(0);
                                 }
                             });
                      
                             // 초기화 버튼
                             bt2.addActionListener(new ActionListener() {
                      
                                 @Override
                                 public void actionPerformed(ActionEvent e) {
                                     for (int i = 0; i < menu.length; i++) {
                                         bt[i].setEnabled(true);
                                         minus[i].setEnabled(false);
                                         plus[i].setEnabled(false);
                                         suja[i].setText("0");
                                         ta.setText("상품명    합계   수량\n\n");
                      
                                     }
                                 }
                             });
                      
                             // 주문버튼
                             bt1.addActionListener(new ActionListener() {
                      
                                 @Override
                                 public void actionPerformed(ActionEvent e) {
                                     JOptionPane.showMessageDialog(null, ta.getText() + " 주문되었습니다. \n이용해주셔서 감사합니다.");
                                     for (int i = 0; i < menu.length; i++) {
                                         bt[i].setEnabled(true);
                                         minus[i].setEnabled(false);
                                         plus[i].setEnabled(false);
                                         suja[i].setText("0");
                                         ta.setText("상품명    합계    수량\n\n");
                      
                                     }
                                 }
                             });
        frame.getContentPane().add(pSouth, BorderLayout.SOUTH);
        frame.setVisible(true);
 
        // 이벤트단
        for (int i = 0; i < menu.length; i++) {
            int j = i;
 
            // 초밥 버튼 이벤트
            bt[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    minus[j].setEnabled(true);
                    plus[j].setEnabled(true);
                    bt[j].setEnabled(false);
                    ok[j].setEnabled(true);
 
                    count = 0;
                }
            });
 
            // "-" 버튼 이벤트
            minus[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count > 0) {
                        count = count - 1;
                        suja[j].setText(count + "");
                        ok[j].setEnabled(true);
                    } else {
                        minus[j].setEnabled(false);
                    }
                }
            });
            
            // "+" 버튼 이벤트
            plus[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                    count = count + 1;
                    suja[j].setText(count + "");
                    ok[j].setEnabled(true);
                    if (count > 0) {
                        minus[j].setEnabled(true);
                    }
                }
            });
            
            //확인 버튼 이벤트
            ok[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                	show = bt[j].getActionCommand();
                    ta.append(" " + show + "  " + price[j] + "  " + count + "\n");
                    a = " " + show + "  " + price[j] + "  " + count + "\n"; 
                    System.out.println(a);
                    socket(a);
                    ok[j].setEnabled(false);
                }
            });
 
        }
 
        // 끄기
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
 
    // 메인
    public static void main(String[] args) {
        new foodGUI();
    }
}


