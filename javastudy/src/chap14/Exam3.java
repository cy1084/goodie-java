package chap14;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Exam3 {
	public static void main(String[] args) throws IOException {
		// 화면 입력을 위한 스트림
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("파일명을 입력하세요");
		String fname = stdin.readLine();

		System.out.println("시작 라인");
		String sline = stdin.readLine();
		int start = Integer.parseInt(sline); // 정수형으로 바꿔줌

		System.out.println("라인 수");
		String slen = stdin.readLine();
		int len = Integer.parseInt(slen);

		// 파일을 읽기 위한 입력 스트림
		BufferedReader br = new BufferedReader(new FileReader(fname));

		// 파일을 쓰기 위한 입력 스트림
		PrintStream ps = new PrintStream(new FileOutputStream("subfile.txt"));

		String data = null;
		int line = 0;
		int cnt = 0;

		while ((data = br.readLine()) != null) {
			++line;
			if (line < start)
				continue;
			if (cnt >= len)
				break;
			
			++cnt;

			System.out.println(line + ": " + data);
			ps.println(line + ": " + data);
		}

		stdin.close();
		br.close();
		ps.close();

	}

}
