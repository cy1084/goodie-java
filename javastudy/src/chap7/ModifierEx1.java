package chap7;

/*
 * 접근 제한자(접근 제어자)
 * private < (default) < protected < public
 * private: 같은 클래스 내
 * default: 같은 패키지 내
 * protected: 같은 패키지 내, 상속 관계
 * public: 모두 허용
 * 
 * 제한자(제어자)
 * - static
 * - abstract
 * - final
 * 
 * [접근제어자][제어자] 리턴타입 메소드명(매개변수 목록)
 */

class Modifier {
	private int v1 = 100;
	int v2 = 200;
	protected int v3 = 300;
	public int v4 = 400;

	public void method() {
		System.out.println("chap7.Modifier 클래스의 메소드");
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
	}

}

public class ModifierEx1 {
	public static void main(String[] args) {
		Modifier m = new Modifier();
		// m.v1 = 10; private 접근 불가, 값 바뀌지 않음
		m.v2 = 20;
		m.v3 = 30;
		m.v4 = 40;
		m.method();

	}

}
