package chap14;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * File 클래스를 이용하여 파일 읽기
 */

public class FileEx3 {
	public static void main(String[] args) throws IOException {
		File f = new File("data.txt");

		if (!f.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}

		FileInputStream fis = new FileInputStream(f);
		int len = 0;
		byte[] buf = new byte[8096];

		while ((len = fis.read(buf)) != -1) {
			System.out.print(new String(buf, 0, len));
		}
		
		fis.close();
		f.delete(); //해당 파일 제거-> 두 번 실행하면 파일 존재하지 않는다고 뜸
	}

}
