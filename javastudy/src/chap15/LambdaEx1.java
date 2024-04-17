package chap15;

/*
 * 함수 객체와 내부 클래스 
 * 
 */

interface LambdaInterface {
	void method();
}

class Outer {
	public int iv = 10;

	void method() {
		int iv = 20;

		// 람다 방식으로 객체 생성
		LambdaInterface f = () -> {
			System.out.println("Outer.this.iv= " + Outer.this.iv); // 외부 클래스 멤버에 접근. 10
			System.out.println("Outer.iv= " + this.iv); // 현재 객체 iv 값에 접근. 10
			System.out.println("iv= " + iv); // 20
		};
		f.method();

		// 인터페이스의 객체 생성
		LambdaInterface f2 = new LambdaInterface() {
			// int iv = 20;

			@Override
			public void method() {
				System.out.println("Outer.this.iv= " + Outer.this.iv); // 외부 클래스 멤버에 접근. 10
				// System.out.println("Outer.iv= " + this.iv); // 현재 내부 클래스 멤버에 접근. 20
				System.out.println("iv= " + iv); // 20
			}
		};
		f2.method();
	}
}

public class LambdaEx1 {
	public static void main(String[] args) {
		new Outer().method();

	}

}
