package chap14;
/*
 * FileOutputStream: 파일에 데이터를 저장하는 스트림
 * 					 FileNotFoundException 예외 발생-> 파일을 만들 '권한'이 없으면 이 예외를 발생시킴
 * 						+) FileInputStream에서는 데이터를 입력할 파일 자체가 없기 때문에 이 예외 발생
 * 	out.txt 파일이 없으면 자동 생성, 있으면 해당 파일에 내용 저장
 * 
 * 주요 메소드
 * - void write(int data): 1 바이트 내용 출력
 * - void write(byte[] buf): buf의 내용 출력
 * - void write(byte[] buf, int start, int len): buf의 내용을 start부터 len 길이만큼 출력
 * 
 * 
 * new FileOutputStream("out.txt"): out.txt 파일에 데이터 쓸 준비/ 출력 스트림이 연결됨, 기존 내용은 사라짐(최신 데이터만 저장)
 * new FileOutputStream("out.txt", true): 기존 내용에 새로운 내용 추가!
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out.txt 파일에 내용 저장하기");
		FileOutputStream fos = new FileOutputStream("out.txt");

		fos.write('1');
		fos.write('2');
		fos.write('3');
		fos.write('a');
		fos.write('b');
		fos.write('c');
		fos.write('가');
		fos.write('나');
		fos.write('다');

		fos.flush();
		fos.close();

		byte[] buf = "\nFileOutputStream 예제입니다.\n".getBytes();
		// getBytes(): 문자열을 btye[]로 변경

		fos = new FileOutputStream("out.txt", true); // 위에서 fos.close() 했기 때문에 다시 한번 열어줘야 함
		fos.write(buf);

		fos.flush();
		fos.close();

		fos = new FileOutputStream("out.txt", true);
		fos.write(buf, 5, 6); // 5번째 글자부터 6개 출력해

		fos.flush();
		fos.close();

	}

}
