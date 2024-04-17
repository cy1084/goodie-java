package chap14;
/*
 * File 클래스: 파일이나 폴더의 정보를 관리하는 클래스
 * 	- 폴더 구분자
 * 		윈도우: \\, /
 * 		리눅스: /
 */

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) {
		String filePath = "c:/";
		File f1 = new File(filePath);
		// f1: c드라이브의 root 폴더 관리

		String[] files = f1.list();
		// files: f1 하위 폴더, 파일의 이름 목록

		for (String f : files) {
			File f2 = new File(filePath, f); 
			// f2: c드라이브의 하위 파일(폴더) 한 개 관리

			if (f2.isDirectory()) { // f2 파일이 디렉토리(폴더)니?
				System.out.printf("%s: 디렉토리\n", f);
			} else
				System.out.printf("%s: 파일(%,dbyte)\n", f, f2.length()); // %,d 세자리마다 ,를 찍어
				// f2.length(): 파일의 크기
		}

	}

}
