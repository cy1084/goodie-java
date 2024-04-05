package chap7;

/*
 * 추상 클래스 간 상속
*/

abstract class Abs1 { // 추상 클래스
	int a = 10;

	abstract int getA(); // 추상 메소드
}

abstract class Abs2 extends Abs1 {
	int b = 20;

	abstract int getB();
}

class Normal extends Abs2 { // 상속을 하게 되면 상위 메소드들도 여기서 같이 구현해야 함

	@Override
	int getB() {
		return b;
	}

	@Override
	int getA() {
		return a;
	}

}

public class AbstractEx2 {
	public static void main(String[] args) {
		Normal n = new Normal();
		System.out.println(n.a);
		System.out.println(n.getA());
		System.out.println(n.b);
		System.out.println(n.getB());

		System.out.println("Abs2 타입으로 형변환");
		Abs2 a2 = (Abs2) n; // 부모 타입의 참조변수에서 자식 타입의 참조변수: 자동 (형변환 연산자 생략 가능)
		System.out.println(a2.a);
		System.out.println(a2.getA());
		System.out.println(a2.b);
		System.out.println(a2.getB());

		System.out.println("Abs1 타입으로 형변환");
		Abs1 a1 = a2;
		System.out.println(a1.a);
		System.out.println(a1.getA());
		// System.out.println(a1.b); 에러-> 부모는 자식의 멤버변수를 모르기 때문
		// System.out.println(a1.getB());

		System.out.println("Object 타입으로 형변환");
		Object o = a1;
		/*
		 * System.out.println(o.a); System.out.println(o.getA());
		 * System.out.println(o.b); System.out.println(o.getB());
		 */
		// 전부 에러

		System.out.println(((Abs1) o).a); // 형변환 하면 가능

	}

}
