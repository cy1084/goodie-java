package chap6;

/*
 * 선언 위치에 따른 변수의 종류
 *					선언 위치 		선언 방법			메모리 할당 시점			메모리 할당 위치
 *
 * - 클래스 변수		클래스 내부 		static       	클래스 정보 로드 시			클래스 영역
 * 									-> 인스턴스화 필요 없음
 * 									-> 모든 객체의 공통 변수로 사용됨
 * 									-> 클래스명.변수명
 * 									-> 기본 값으로 초기화
 * - 인스턴스 변수		클래스 내부		static 없음		인스턴스화(new)			힙 영역
 * 									-> 반드시 인스턴스화
 * 									-> 객체별 다른 메모리 할당
 * 									-> 참조변수명.변수명
 * 									-> 기본 값으로 초기화
 * - 지역 변수		메소드 내부						선언문 실행 시				스택 영역
 * 									-> 메소드 내, 블록 내에서만 사용 가능
 * 									-> 기본 값으로 초기화 x, 초기화 반드시
 * 									-> 매개변수 포함
 * 
 * */
class Car {
	String color; // 인스턴스 변수
	int number; // 인스턴스 변수
	static int width = 200; // 클래스 변수
	static int height = 120; // 클래스 변수

	public String toString() {
		return color + ":" + number + "(" + width + "," + height + ")";
	}

}

public class CarEx1 {
	public static void main(String[] args) { // args: 지역변수(매개변수 포함)
		Car c1 = new Car(); // 지역 변수
		c1.color = "white";
		c1.number = 1234;
		System.out.println("c1: " + c1.toString());

		Car c2 = new Car(); // 지역 변수
		c2.color = "red";
		c2.number = 4567;
		System.out.println("c2: " + c2.toString());

		// int num; -> 기본 값으로 초기화
		int num = 0;
		System.out.println(num);

		int i;
		boolean b = true;
		if (b) {
			i = 10; // 초기화 무조건!
			System.out.println(i);
		}

		int j, k;
		j = 1;
		switch (j) {
		case 1:
			k = 10;
		case 2:
			k = 20;
		default:
			k = 0;
		}
		// System.out.println(k); 에러
		// -> k 초기화
		// -> default
	}

}
