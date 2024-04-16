package chap14;
/*
 * PrintStream: 보조 스트림=> 출력 기능 강화
 * 	1. write() 기능 강화
 * 		- 모든 자료형을 출력 가능하도록 기능 강화-> println, print, printf
 * 		- IOException 예외 처리 필수-> 예외 처리 생략할 수 있도록 기능 추가 
 * 	2. OutputStream 하위 클래스
 * 	3. 표준 출력(System.out), 표준 오류(System.err) 객체의 자료형
 * 	4. 객체 생성 시 OutputStream 객체를 매개변수로 입력 받아 객체 생성
 * 
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx1 {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);

		ps.println("홍길동");
		ps.println(1234);
		ps.println(true);
		ps.write(65);
		ps.write(1234);
		
		ps.flush();
		ps.close();

	}

}
