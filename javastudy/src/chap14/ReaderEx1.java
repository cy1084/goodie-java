package chap14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * InputStreamReader: InputStream 객체를 Reader로 변경해주는 스트림
 * 
 * Reader: 문자형 입력 스트림/ 2 바이트 단위로 데이터 읽기
 */

public class ReaderEx1 {

	public static void main(String[] args) throws IOException {
		Reader in = new InputStreamReader(System.in);
		//InputStreamReader in = new InputStreamReader(System.in);
		int data=0;
		
		while((data=in.read()) !=-1) {
			System.out.print((char)data);
		}

	}

}
