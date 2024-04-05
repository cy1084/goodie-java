package chap7;

import java.util.Date;

/*
 * package
 * - 주로 기능이 비슷한 클래스, 인터페이스들의 모임
 * - 클래스 명은 패키지를 포함함
 * - package의 설정은 파일 처음에 한번만 구현 가능
 * 	-> 같은 파일에 존재하는 클래스는 같은 패키지에 속한 클래스임
 * 	-> 패키지가 다른 클래스는 다른 파일에 구현해야 함
 * 
 *  
 *  import 예약어
 *  - 클래스명의 패키지명을 생략할 수 있도록 설정
 *  
 *  
 *  클래스의 패키지명을 생략할 수 있는 경우
 *  1. 같은 패키지에 속한 클래스 사용 시
 *  2. java.lang 패키지에 속한 클래스 사용 시 ex) Scanner
 *  3. import 구문에서 선언된 클래스 사용 시 
 *  	-> 패키지명.클래스명
 *  	-> 패키지명.* 
 *  
 *  
 */

public class PackageEx1 {
	public static void main(String[] args) {
		Date now = new Date();
		A a = new A(); // 같은 패키지에 속한 클래스는 패키지명 생략 가능

		Pack1 p = new Pack1();
		p.method();

		// p.methodp(); 접근 불가

	}

}

class A {
}

class Pack1 {
	void method() { // default
		System.out.println("chap1.Pack1.method 메소드");
	}

	private void methodp() { // private
		System.out.println("chap1.Pack1.methodp 메소드");
	}

	void method2() {
		methodp(); // 같은 클래스이므로 private에 접근 가능
	}
}
