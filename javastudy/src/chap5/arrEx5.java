package chap5;

/* 자바 프로그램 실행 순서
 * 1. 소스코딩: arrEx5.java
 * 2. 컴파일 
 *    javac arrEx6.java -> arrEx5.class 바이트코드 생성
 * 3. 실행(java 인터페이스)
 * 	  java arrEx5 홍길동 김삿갓
 * 
 * java 인터페이스
 * 1. JVM 환경 생성-> 클래스 영역, 스택 영역, 힙 영역
 * 2. 바이트 코드를 메모리에 로드(클래스 정보를 메모리에 로드), 검증
 * 3. main 메소드 실행-> command 라인의 파라미터 값을 문자열 배열로 생성, main에 전달
 * args 배열: command 라인에 파라미터 값 저장
 * 
 * */

public class arrEx5 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("command 라인에 파라미터를 입력하세요");
			return;
		}

		for (String s : args) {
			System.out.println(s);
		}

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	}

}
