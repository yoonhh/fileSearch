package calculator;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{
	Container c;
	JLabel b1 = new JLabel("값1 : ");
	JTextField t1 = new JTextField(10);
	JLabel b2 = new JLabel("값2 : ");
	JTextField t2 = new JTextField(10);
	JLabel retb = new JLabel("결과값 : 00");
	public Calculator(){
		setSize(400, 300);
		setTitle("계산기");
		c= getContentPane();
		c.setLayout(new FlowLayout());
		
		
		b1.setSize(100,50);
		b1.setLocation(100,200);
		JButton btn1 = new JButton("+");
		JButton btn2 = new JButton("-");
		JButton btn3 = new JButton("*");
		JButton btn4 = new JButton("/");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		c.add(b1);c.add(t1);      c.add(b2);c.add(t2);  c.add(retb);
		c.add(btn1);  c.add(btn2);   c.add(btn3);   c.add(btn4);
		
		
		setResizable(false);// 화면의 크기를 조정 할 수 없게 해준다
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		int tmp1= Integer.parseInt(t1.getText());
		int tmp2 = Integer.parseInt(t2.getText());
		int result=0 ;
		if(b.getText() == "+") {
			result = tmp1+tmp2;
		}
		else if(b.getText() == "-") {
			result = tmp1-tmp2;
		}else if(b.getText() == "*") {
			result = tmp1*tmp2;
		}else if(b.getText() == "/") {
			result = tmp1/tmp2;
		}
		else {
			retb.setText("연산값이 이상합니다");
			
		}
		
		retb.setText("결과값 : "+result);
		
	}
	
	

}
