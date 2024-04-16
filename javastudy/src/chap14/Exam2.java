package chap14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//FileWriter를 사용해서 화면에서 입력 받은 내용을 data.txt 파일로 저장하기

public class Exam2 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("data2.txt에 저장할 내용을 입력하세요.");

		FileWriter fw = new FileWriter("data2.txt");
		String buf;

		while (true) {
			String text = sc.nextLine();

			if (text.equals("exit")) {
				System.out.println("종료.");
				break;
			}

			buf = (text + "\n");
			fw.write(buf);
		}

		fw.flush();
		fw.close();

	}

}
