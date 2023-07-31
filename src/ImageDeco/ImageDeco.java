package ImageDeco;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ImageDeco extends JFrame{
	
	//이미지를 사용할때는 ImageIcon을 이용해서 할 수있다.
	ImageDeco(){
//		setSize(900,800);
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		setTitle("이미지 넣기");
//	
//		ImageIcon icon = new ImageIcon("다운로드.jpg");
//		JLabel la = new JLabel("이미지넣기 짜잔.",icon,SwingConstants.CENTER);
//		c.add(la);
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		setSize(900,800);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		setTitle("이미지 넣기");
		//ImageIcon으로 불러온 이미지를 JButton() 에 넣는것으로 내가 원하는 이미지로 사용 할 수 있다.
		ImageIcon icon = new ImageIcon("다운로드.jpg");
		JLabel la = new JLabel("이미지넣기.",icon,SwingConstants.CENTER);
		JButton b1 = new JButton(icon);
		c.add(la);
		c.add(b1);
		//Button -그룹
		//버튼여러개중에 하나만 선택할수있게 해주고 싶을때
		//그냥 RadioButton으로 하면 중복체크가 되어버리는데
		//이것을 ButtonGroup를 사용하여 그룹지어 해결 할 수 있다.
		ButtonGroup group = new ButtonGroup();
		JRadioButton r1 = new JRadioButton("남성");
		JRadioButton r2 = new JRadioButton("여성");
		group.add(r1);group.add(r2);
		c.add(r1); c.add(r2);
		
		//텍스트 필드
		//사용자에게 입력받는 텍스트 공간
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(20);
		//두개의 텍스트 공간을 만들었는데 하나는 10의 크기 하나는 20 의 크기로 만들어보았다.
		c.add(t1);
		c.add(t2);
		//넓은 공간을 만들고 싶다면
		JTextArea jt = new JTextArea(5 , 30);
		//안의 5 와 30 은 각각 행과 열의 크기를 의미한다.
		c.add(jt);
//		//리스트 - JList
//		//JList는 목록을 주고 하나를 선택하게 할 수 있다.
//		String str[] = {"사과" ,"배","바나나","복숭아 ","포도"};
//		//이 문자열을 JList로 사용하는것으로
//		//선택 가능한 리스트가 만들어진다.
//		JList <String> st = new JList<String>(str);
//		c.add(st);
		
		//콤보박스 - JComboBox
		String str[] = {"사과" ,"배","바나나","복숭아 ","포도"};
		JComboBox <String> com = new JComboBox<String>();
				for(int i =0 ; i< str.length; i ++) {
					com.addItem(str[i]);
				}
		c.add(com);
		
		//JSlider
		//마우스 나 키보드등 으로 슬라이드 할수있는 기능
		JSlider sid = new JSlider(JSlider.HORIZONTAL, 0,200,100);
		c.add(sid);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
	}
	
}
