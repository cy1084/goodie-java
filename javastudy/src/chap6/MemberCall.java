package chap6;

/*
 * 클래스
 * 변수(필드) - 클래스 변수(static)
 * 			- 인스턴스 변수
 * 메소드		- 클래스 메소드(static)
 * 			- 인스턴스 메소드
 * 
 * 클래스 멤버: 클래스 변수, 클래스 메소드/ 클래스명.멤버명
 * 인스턴스 멤버: 인스턴스 변수, 인스턴스 메소드/ 참조변수명.멤버명
 * 
 * 클래스 멤버-> 클래스 멤버 호출: 정상
 * 인스턴스 멤버-> 인스턴스 멤버 호출: 정상
 * 클래스 멤버-> 인스턴스 멤버 호출: 객체화(인스턴스화) 필요
 * 인스턴스 멤버-> 클래스 멤버 호출: 정상
 * 
 * 같은 멤버들 간에는 클래스명, 참조변수명 생략 가능
 * 단 클래스 멤버에서 인스턴스 멤버 호출 시 객체화 필요하므로, 참조변수명 사용!
 * 
 * */
public class MemberCall {

	static int cv1 = 10; // 클래스 멤버
	static int cv2 = 20; // 클래스 멤버
	int iv1 = 100; // 인스턴스 멤버
	int iv2 = iv1; // 인스턴스 멤버
	int iv3 = cv1; // 인스턴스 멤버
	// 인스턴스 멤버에 클래스 멤버의 값이 들어감(인스턴스화 될 때)

	// static int cv3=iv1;
	// iv1은 인스턴스화가 되지 않았기 때문에 에러 -> 클래스 멤버에서 인스턴스 멤버 직접 호출 불가
	// 아래와 같이 인스턴스화 필요
	static int cv3 = new MemberCall().iv1;
	// 한 번 쓰고 버림-> 참조변수가 아니기 때문(참조한 값이 없으므로)

	void method1() { // 인스턴스 멤버
		System.out.println("cv1+cv2=" + (cv1 + cv2));
		System.out.println("iv1+iv2=" + (iv1 + iv2));
	}

	static void method2() { // static 붙어있기 때문에 클래스 멤버
		System.out.println("cv1+cv2=" + (cv1 + cv2));

		// System.out.println("iv1+iv2="+(iv1+iv2));
		MemberCall m = new MemberCall(); // 객체화
		System.out.println("iv1+iv2=" + (m.iv1 + m.iv2));
		System.out.println("iv1+iv2=" + (new MemberCall().iv1 + new MemberCall().iv2));
	}

	void method3() { // 인스턴스 멤버
		method1(); // 인스턴스 멤버
		method2(); // 클래스 멤버
	}

	static void method4() {
		new MemberCall().method1(); // 인스턴스 멤버
		method2(); // 클래스 멤버
	}

	public static void main(String[] args) { // main도 static
		// method1 ~ method4 호출하기

		method2(); // -> 같은 멤버여서 앞에 클래스 명 생략/ 클래스명.멤버명
		// MemberCall.method2

		System.out.println();

		method4();
		System.out.println();

		new MemberCall().method1();
		System.out.println();

		new MemberCall().method3();
		System.out.println();

		MemberCall mc = new MemberCall();
		mc.method1();
		System.out.println();

		mc.method3();
		System.out.println();

	}

}
