package firstPractice;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameEx extends JFrame{
	Container c;
	JPanel pal;

	JButton button_lise[] = new JButton[4];
	String str_list[]= {"확인","취소","뒤로가기" , "앞으로가기"};
	
	FrameEx(){
		setTitle("나의 두번째 프레임");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setButton();
		setVisible(true);
	}
	void setButton() {
		
		c=getContentPane();// 컨텐트 팬을 이용해서 요소를 추가할 위치를 찾는다
		pal= new JPanel();// 패널을 생성
		pal.setBackground(Color.cyan); // 패널읠 색을 지정해주고
		pal.setLayout(new FlowLayout());//패널의 배치시킬 곳을 알려준 후
//		c.setLayout(new FlowLayout());
		JLabel la = new JLabel("나의 프로그램");
//		c.add(la);
		for(int i =0; i< 4; i++) {
			button_lise[i]= new JButton(str_list[i]);
//			c.add(button_lise[i]);
			pal.add(button_lise[i]);
		}
		c.add(pal);// 패널을 넣음
	}

}
