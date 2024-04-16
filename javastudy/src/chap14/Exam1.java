package chap14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//FileOutputStream을 사용해서 화면에서 입력 받은 내용을 data.txt 파일로 저장하기
//exit가 입력되면 종료

public class Exam1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("data.txt");
		byte[] buf;

		System.out.println("data.txt에 저장할 내용을 입력하세요.");

		while (true) {
			String text = sc.next();
			// nextLine(): 한 줄 전체 입력 받음

			if (text.equals("exit")) {
				System.out.println("종료.");
				break;
			}

			buf = (text + " ").getBytes(); // '공백 포함 문자열'을 바이트형으로
			fos.write(buf);

		}
		fos.flush();
		fos.close();
	}

}
