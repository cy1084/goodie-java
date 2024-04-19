package chap7;

/*
 * final 메소드
 * - 변경 불가-> 재정의 불가, 오버라이딩 불가
 * 
 * cf. abstract 메소드-> 오버라이딩 강제(final과 반대)
 */

class FinalMethod {
	final void method() {
		System.out.println("FinalMethod의 method");
	}
}

class FinalMethodSub extends FinalMethod {
	/*
	 * void method() { //FinalMethod.method() -> final이므로 오버라이딩 불가
	 * System.out.println("FinalMethodSub의 method"); }
	 */
}

public class FinalMethodEx1 {
	public static void main(String[] args) {
		FinalMethodSub f = new FinalMethodSub();
		f.method();

	}

}
