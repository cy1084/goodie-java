package chap6;

/*
 * 생성자 예제
 * - 객체 생성 시 호출되는 메소드
 * - 생성자 없는 객체 생성은 불가함
 * - 생성자의 주요 기능은 멤버 변수의 초기화를 담당
 * - 오버로딩 가능
 * - 메모리 할당 안함
 * 
 * 
 * 기본 생성자
 * - 클래스 내부에 생성자를 구현하지 않으면 컴파일러가 자동으로 추가
 *   public 클래스명(){}
 * 
 * 
 * 생성자 구현 방법
 * 1. 생성자의 이름은 클래스명과 같다
 * 2. 리턴 타입이 없다. void도 기술하지 않음
 */

class Number1 {
	int num;
	public Number1() { //기본 생성자
		
	}	
}

class Number2 {
	int num;
	public Number2(int n) {
		num=n;
	}	
}

public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1();
		System.out.println(n1.num);
		
		//Number2 n2 = new Number2(); 에러
		Number2 n2=new Number2(3);
		System.out.println(n2.num);
		
		/*
		 * new 예약어 기능
		 * 1. 메모리 할당, 메모리 물리적 생성
		 * 2. 멤버변수를 기본값으로 초기화
		 * 3. 생성자 호출-> 클래스에 구현된 생성자에 맞도록 호출 필요
		 * */

	}

}
