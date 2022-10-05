package 생성자;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식주문프로그램 {
	
	private static JTextField t1;
	static int count; //전역변수 자동 초기화(0)
	// '상수'지정(값 변경x) => final
	final static int PRICE = 5000;
	static JLabel result;
	
	static int 짬뽕count;
	static int 우동count;
	static int 짜장count;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("중국집");
		f.getContentPane().setBackground(new Color(0, 255, 0));
		f.setSize(800, 600);
		f.getContentPane().setLayout(null);
		
		JLabel center = new JLabel("");
		center.setFont(new Font("굴림", Font.PLAIN, 15));
		center.setHorizontalAlignment(SwingConstants.CENTER);
		center.setIcon(new ImageIcon("C:\\Users\\정유진\\Desktop\\멀티캠퍼스\\java-workspace\\java06\\짬뽕.png"));
		center.setBounds(96, 134, 601, 298);
		f.getContentPane().add(center);
		
		JButton b1 = new JButton("짬뽕");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//주문량 현재 카운트 +1
				count++; //증감연산자
				짬뽕count++;
				//현재 주문량 표시
				t1.setText(count + "개");
				//이미지 바꿔주기
				ImageIcon img = new ImageIcon("짬뽕.png");
				center.setIcon(img);
				//결제금액 변경
				result.setText("결제금액: " + count * PRICE + "원");
				f.setTitle("짬뽕개수: " + 짬뽕count + " 우동개수: " + 우동count + " 짜장개수: " + 짜장count);
			}
		});
		b1.setBackground(new Color(255, 0, 255));
		b1.setFont(new Font("굴림", Font.BOLD, 30));
		b1.setBounds(12, 10, 172, 93);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("우동");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				우동count++;
				count++;
				t1.setText(count + "개");
				center.setIcon(new ImageIcon("C:\\Users\\정유진\\Desktop\\멀티캠퍼스\\java-workspace\\java06\\우동.png"));
				result.setText("결제금액: " + count * PRICE + "원");
				f.setTitle("짬뽕개수: " + 짬뽕count + " 우동개수: " + 우동count + " 짜장개수: " + 짜장count);
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 30));
		b2.setBackground(new Color(255, 128, 0));
		b2.setBounds(196, 10, 172, 93);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("짜장");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				짜장count++;
				count++;
				t1.setText(count + "개");
				center.setIcon(new ImageIcon("C:\\Users\\정유진\\Desktop\\멀티캠퍼스\\java-workspace\\java06\\짜장.png"));
				result.setText("결제금액: " + count * PRICE + "원");				
				f.setTitle("짬뽕개수: " + 짬뽕count + " 우동개수: " + 우동count + " 짜장개수: " + 짜장count);
			}
		});
		b3.setFont(new Font("굴림", Font.BOLD, 30));
		b3.setBackground(new Color(0, 255, 255));
		b3.setBounds(380, 10, 172, 93);
		f.getContentPane().add(b3);
		
		JLabel lblNewLabel_1 = new JLabel("개수 :");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1.setBounds(564, 37, 73, 32);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setForeground(new Color(0, 0, 255));
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBackground(new Color(255, 255, 0));
		t1.setBounds(649, 26, 125, 53);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		result = new JLabel("결제금액");
		result.setForeground(new Color(255, 0, 0));
		result.setFont(new Font("굴림", Font.BOLD, 35));
		result.setBounds(96, 466, 374, 53);
		f.getContentPane().add(result);
		f.setVisible(true);
	}
}
