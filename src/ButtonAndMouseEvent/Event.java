package ButtonAndMouseEvent;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event extends JFrame  implements ActionListener,MouseListener{
	
	JLabel la = new JLabel("Hello~world");
	Event(){
//		setSize(500,300);
//		setTitle("이벤트  실행");
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		JButton j = new JButton("사과");
//		j.addActionListener(this);
//		//j 라는 버튼이 눌리면 actionPerformed(ActionEvent e) 클래스가 동작하게되는데
//		//먼저 지금 이벤트를 발생한 버튼이 누구인지 getSource() 를 이용해서 받아온후 동작을한다.
//		//위의 코드는 버튼의 텍스트가 사과라면 그 이름을 배로 바꾸고 , 배라면 사과로 바꾸는 코드이다.
//		c.add(j);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setVisible(true);
		
		setSize(500,300);
		setTitle("이벤트  실행");
		Container c = getContentPane();
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		//먼저 좌표 30,30에 Hello~world 라는 문자가 화면에 보여지는데
		c.add(la);
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		c.addMouseListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText() == "사과")
		{
			b.setText("배");
		}else {
			b.setText("사과");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {// 마우스를 눌렀을 때
		int x = e.getX();//마우스클릭 x 좌표
		int y = e.getY();
		la.setLocation(x,y);
		//마우스가 클릭되었을때 그 마우스의 좌표를 얻어와서 문자를 화면에 다시 배치시키는 모습이다.
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
