package firstPractice;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstFrame extends JFrame{ // JFrame 상속
	
	//컴포넌트란 ? -> GUI의 각각의 요소를 컴포넌트라고 한다. 즉 버튼, 텍스트 등 GUI요소를 말함
	//컨테이너란 컴포넌트 들이 들어가기 위한 화면(창)이 있어야하는데 이 창을 컨테이너라고 한다. 이러한 창 조차도 하나의 컨포넌트라고 칭 할 수 있음
	//이러한 컨테이너를 만드는 방법이 JFrame
	
	
	FirstFrame(){// 질문 1. 구조를 잘 모르겠다.
		setTitle("첫번째 프레임");//프로그램의 이름을 지정
		setSize(300,400);// 프로그램의 x,y축의 크기를 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 이 기능을 추가해주는 이유는 추가를 하지 않고 창을 닫을 경우 창은 닫히지만
		// 프로그램이 종료된게 아니라 살아있는 상태가 된다. 그래서 종료하는 기본적인 기능을 추가해줘야 함.
		setVisible(true);//프로그램이 눈에 보여야하기 때문에 true를 주는것으로 눈에 보이게하겠다
		//컨텐트팬 이란? -> 컴포넌트를 부착하는데 어디에다가 부착할지 지정하는 것
		
		
		Container c = getContentPane(); // 컨텐트팬을 이용해서 그 위치에 컴포넌트를 추가하겠다.
		//어디다가 만들것이냐
		c.setLayout(new FlowLayout());//이 위치에 배치하겠다.
		
//		FlowLayout : 순서대로 배치 시킨다.
//
//		BorderLayout : 동서남북으로 배치시킨다.
//
//		GridLayout : x,y 로 배치시킨다.
//
//		CardLayout : 겹쳐 보이게 배치시킨다.
		
		JLabel l1 = new JLabel("이름");
		c.add(l1);
		JButton j = new JButton("확인");
		JButton j2 = new JButton("취소");
		
		c.add(j);
		c.add(j2);
		setVisible(true);
		
	}
	
	
	
}
