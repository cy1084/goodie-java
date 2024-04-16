package chap14;

import java.io.IOException;
import java.io.OutputStream;

/*
 * OutputStream: 바이트형 출력 스트림/ 1 바이트 단위로 쓰기
 */

public class OutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		OutputStream out = System.out;
		out.write('1');
		out.write('2');
		out.write('3');
		out.write('a');
		out.write('b');
		out.write('c');
		out.write('가'); // 한글은 2바이트이므로 깨짐
		out.write('나');
		out.write('다');

		// out.flush();
		// flush: 버퍼의 내용을 강제로 목적지로 전송
		// flush가 없다면 버퍼에 내용이 다 찰 때까지 내용을 전송하지 않음
		// 버퍼: 입력 또는 출력 되기 전 사이의 공간

		out.close();
		// 입출력 스트림과 연결 해제-> 해제하면서 버퍼의 내용을 강제로 목적지로 전송
		// 더이상 System.out이랑 연결 안할래

	}

}
