package chap14;
/*
 * FileReader
 * 
 * 주요 메소드
 * 	- int read(): 파일에서 1 char 단위로 읽어, 데이터 리턴
 * 	- int read(char[]): 파일에서 데이터를 읽어, buf에 저장/ 실제 읽은 char 수 리턴 
 * 	- int read(char[], int start, int len)
 * 			: 파일에서 len 크기만큼 데이터를 읽어, buf에 start 인덱스부터 저장/ 실제 읽은 char 수 리턴 
 */

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src/chap14/InputStreamEx1.java");
		int data = 0;

		System.out.println("===read() 메소드를 이용하여 읽기===");

		while ((data = fr.read()) != -1) { // 한글 안깨짐
			System.out.print((char) data);
		}
		fr.close();

		System.out.println();
		fr = new FileReader("src/chap14/InputStreamEx1.java");
		char[] buf = new char[8096];
		System.out.println("===read(char[]) 메소드를 이용하여 읽기===");

		while ((data = fr.read(buf)) != -1) { // 한글 안깨짐
			System.out.print(new String(buf, 0, data));
		}
		fr.close();

		System.out.println();
		fr = new FileReader("src/chap14/InputStreamEx1.java");
		buf = new char[8096];
		System.out.println("===read(char[], int, int) 메소드를 이용하여 읽기===");

		while ((data = fr.read(buf, 0, buf.length)) != -1) { // 한글 안깨짐
			System.out.print(new String(buf, 0, data));
		}
		fr.close();

	}

}
