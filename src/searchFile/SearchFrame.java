package searchFile;//객체 어디에 폴더

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SearchFrame extends JFrame implements ActionListener {
	Container c;

	JLabel b1 = new JLabel("경로 : ");
	JTextField t1 = new JTextField(10);
	JLabel b2 = new JLabel("파일이름 : ");
	JTextField t2 = new JTextField(10);

	JTextArea jt = new JTextArea(50, 50);
	JScrollPane scrollPane;

	JButton btn2 = new JButton("새로고침");

	JFrame jf = new JFrame();
	
	String DATA_DIRECTORY = null;

	public SearchFrame() {
		setTitle("파일검색");
		setSize(600, 700);
		c = getContentPane();

		c.setLayout(new FlowLayout());

		JButton btn1 = new JButton("검색");

		btn1.addActionListener(this);
		btn2.addActionListener(this);

		scrollPane = new JScrollPane(jt);

		c.add(b1);
		c.add(t1);
		c.add(b2);
		c.add(t2);
		c.add(jt);
		c.add(btn1);
		c.add(btn2);

		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		 DATA_DIRECTORY = t1.getText();// 입력한 경로를 받아온다.

		File dir = new File(DATA_DIRECTORY);// 입력한 경로를 파일 객체에 담는다.

		File files[] = dir.listFiles();// 디렉토리의 파일목록(디렉토리 포함)을 File배열로 반환한다.
		if (!DATA_DIRECTORY.equals("") && files != null) {// 경로를 제대로 입력 했거나 경로를 아무거나 입력하지 않았을 경우 아래 조건이 실행
			for (File file : files) {
				
				if (t2.getText().equals("")) {// 아무것도 입력을 하지 않았을 경우 해당 경로에 있는 모든 디렉토리와 파일들을 보여준다.
					jt.append(file.getName() + "\n");// 파일 추가

//					jt.setCaretPosition(jt.getDocument().getLength());

				} else if (file.getName().contains(t2.getText())) {// 파일 이름을 검색 할 경우 해당 경로에 있는 파일을 보여준다. 만약 없는 파일명을 입력 할 경우 아무것도 보여지지 않는다.
					
					jt.append(file.getName() + "\n");

//					

				}

			
			}
		} else {
			jt.append("경로를 확인해 주세요" + "\n");
		}
		if (e.getSource() == btn2) {
			jt.setText(null);
		}
	}
	
	





}
