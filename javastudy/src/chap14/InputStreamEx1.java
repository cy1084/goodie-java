package chap14;

import java.io.IOException;
import java.io.InputStream;

/*
 * 입출력 스트림: 데이터 이동 통로, 단방향(입,출력 구분)
 * 
 * 입력 스트림 
 * 	바이트형: 1 바이트 단위로 읽기/ 동영상, 이미지 등의 데이터 처리, 텍스트도 가능-> InputStream
 * 		=> 하위 클래스: FileInputStream, ObjectInputStream
 * 	문자형: 2 바이트(1 char) 단위로 읽기/ 텍스트(메모장) 데이터 처리		   -> Reader
 * 		=> 하위 클래스: FileReader, StringReader
 * 
 * 출력 스트림
 * 	바이트형: 1 바이트 단위로 쓰기/ 동영상, 이미지 등의 데이터 처리, 텍스트도 가능-> OutputStream
 * 		=> 하위 클래스: FileOutputStream, ObjectOutputStream, PrintStream(System.out.println의 자료형)
 *  문자형: 2 바이트(1 char) 단위로 쓰기/ 텍스트 데이터 처리				   -> Writer 
 * 		=> 하위 클래스: FilerWriter, StringWriter, PrintWriter
 * 
 * InputStreamReader: 바이트형, 문자형 
 * 	- Reader의 하위 클래스
 * OutputStreamWriter: 바이트형, 문자형
 * 	- Writer의 하위 클래스
 * 
 * 
 * 자바에서 제공하는 표준 스트림
 * - 표준 입력 객체: System.in-> 자료형: InputStream
 * - 표준 출력 객체: System.out-> 자료형: PrintStream
 * - 표주 오류 객체: System.err-> 자료형: PrintStream
 * 
 * 
 * 
 * InputStream: 바이트형 입력 스트림의 최상위 클래스
 * 	바이트형: 1바이트 단위로 데이터를 처리 -> 한글은 2바이트(1 char)이므로 1바이트 씩 읽으면 깨짐
 */

public class InputStreamEx1 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in; //표준입력스트림-> 외부 데이터를 내 프로그램으로 읽어옴 (키보드->프로그램)
		//System.out: 표준출력스트림-> 내 데이터를 외부로 보냄(프로그램->화면) 
		
		int data;
		while ((data = in.read()) != -1) { //ctrl+z: EOF(End Of File)
			//in.read(): 데이터타입이 InputStream이므로 1 바이트씩 읽음/ 한글 깨짐
			System.out.print((char) data);
		}

	}

}
