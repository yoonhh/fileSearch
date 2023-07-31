package com.inzent.function;

import java.io.File;

import javax.swing.DefaultListModel;



public class FileSearch {
	//11. 
	
	public File[] search(String dir,String fileName, DefaultListModel<String> model) {
		
		//11. 폴더 경로를 가져온다.
		File directory = new File(dir);
		File[] fList = directory.listFiles();
		
		if(!dir.equals("") && fList != null) {
		for (File file : fList) {
			
			if (file.getAbsolutePath().contains(fileName)) {
				if (file.isFile()) {
					//12. 검색한 파일들을 모델에 담는다.
					model.addElement(file.getAbsolutePath());
				}

				else if (file.isDirectory()) {
					search(file.getAbsolutePath(), fileName, model); // 재귀함수 호출
					model.addElement(file.getAbsolutePath()); // 파일의 FullPath 출력
				}
			}
		}
		}else {
			model.addElement("경로를 입력해주세요");
		}
		//13. 파일 리스트를 리턴.
		return fList;
	}
	
	

}
