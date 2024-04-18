package chap6;

/*
 * 메소드 오버로딩: 메소드의 다형성
 * 1. 동일 클래스에 같은 이름(메소드 명)을 가진 메소드 여러 개 존재
 * 2. 단 매개변수의 목록이 달라야 함(매개변수의 데이터 타입, 개수, 순서 등)
 *
 */

class MathEx2 {
	int a = 100;

	int add(int b) {
		System.out.print("1: ");
		return a + b;
	}

	double add(double b) {
		System.out.print("2: ");
		return a + b;
	}

	String add(String b) {
		System.out.print("3: ");
		return a + b;
	}
}

public class OverloadingEx1 {
	public static void main(String[] args) {
		MathEx2 m = new MathEx2();
		System.out.println(m.add(10));
		System.out.println(m.add(10.5));
		System.out.println(m.add("번"));
		System.out.println(m.add(10L)); // 2번 호출 110.0 , long형이 자동형변환이 가능한 double형 메소드 호출

	}

}
