package com.inzent.JFrame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import com.inzent.function.FileSearch;

public class MyFrame extends JFrame implements ActionListener, KeyListener {
	public JTextField inputName;
	public JTextField inputName2;
	public DefaultListModel<String> model;
	public JList jList;

	FileSearch fs = new FileSearch();

	// 화면 구현

	public MyFrame() {
		
		//2. 화면 컴포넌트 추가
		setSize(800, 500);
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// BorderLayout 객체 전달하기
		setLayout(new BorderLayout());

		JLabel label = new JLabel("경로 이름입력 : ");
		inputName = new JTextField(10);
		JLabel label1 = new JLabel("파일 이름입력 : ");
		inputName2 = new JTextField(10);
		JButton addBtn = new JButton("검색");

		addBtn.setActionCommand("add");
		//7. 동작이벤트 추가
		addBtn.addActionListener(this);

		JPanel topPanel = new JPanel();
		//3. label 컴포넌트 추가
		topPanel.add(label);
		//4.입력창 컴포넌트 추가
		topPanel.add(inputName);
		topPanel.add(label1);
		
		topPanel.add(inputName2);
		//5. 검색 버튼 컴포넌트 추가
		topPanel.add(addBtn);

		// 페널째로 프레임의 상단에 추가하기
		add(topPanel, BorderLayout.NORTH);

		// 목록을 출력할 UI
		jList = new JList<>();
		// JList 에 출력할 데이터를 가지고 있는 모델 객체
		model = new DefaultListModel<>();

		// 모델을 JList 에 연결하기
		jList.setModel(model);

		// 스크롤 페널에 JList 넣어주기
		JScrollPane sc = new JScrollPane(jList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		// 6스크롤바와 파일리스트들이 보여질 컴포넌트 추가.
		add(sc, BorderLayout.CENTER);

		// JTextField 에 키 리스너 등록하기
		inputName.addKeyListener(this);
		inputName2.addKeyListener(this);

		// 1. 창이 띄워진다.
		setVisible(true);
	}
		
	//8. 버튼을 클릭했을 때 동작 실행
	@Override
	public void actionPerformed(ActionEvent e) {
		//9. 입력받은 경로와 파일 이름을 가져온다
		String dir = inputName.getText();// 입력받은 경로
		String fileName = inputName2.getText();
		//10. 입력받은 경로와 파일 이름을 파일탐색 기능에 파라미터로 넘겨줌
		fs.search(dir, fileName, model);//

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		// 엔터키의 코드값인지 확인한다.
		if (code == KeyEvent.VK_ENTER) {// 만일 엔터키를 눌렀다면
			// JTextField 에 입력한 문자열을 읽어와서 DefaultListModel 객체에 추가해야 한다.
			actionPerformed(null);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
