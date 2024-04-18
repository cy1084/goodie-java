package chap2;

public class VarEx1 {

	/*
	 * 자바 실행 단계 
	 * 1. 소스 코딩: VarEx1.java 
	 * 2. 컴파일 단계: 파일 저장하면 자동 컴파일-> javac VarEx1.java -이클립스가 실행, 바이트 코드 생성 
	 * 3. 실행 단계: JVM 환경에서 실행 java VarEx1 이클립스에서 실행함 
	 * 3-1. JVM 환경 생성 
	 * 3-2. 바이트코드 메모리에 로드함 
	 * 3-3. main 메소드를 찾아서 실행 시작
	 * 
	 */

	public static void main(String[] args) {
		int num; // 변수의 선언: 메모리 4바이트 할당
		num = 100; // 변수 초기화
		System.out.println(num); // num 값 출력
		int num2 = 100;
		System.out.println(num2);

		// double 형 변수 d 선언 후, 10.5 출력
		double d = 10.5;
		System.out.println(d);

		char c = 'A';
		// 문자: ' '
		// 문자열: " "
		System.out.println(c);

		boolean b = true;
		System.out.println(b);

	}

}
