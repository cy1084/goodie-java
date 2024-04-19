package chap8;

import java.awt.print.Printable;

/*
 * 인터페이스
 * 1. 멤버: 상수, 추상메소드, default 메소드, static 메소드
 * 2. 접근 제한자는 public
 * 3. 객체화 불가-> 구현 클래스(인터페이스를 구현)의 객체화로 객체화
 * 4. 클래스와 인터페이스는 구현으로 표현 -> implements 예약어 사용
 * 		-> 다중 구현 가능
 * 5. 인터페이스 간 상속 가능 -> 다중 상속 가능
 * 6. 참조 자료형임
 * 
 * 

 * 인터페이스 멤버
 * 상수: [public static final] int NUM=100;
 * 추상메소드: [public abstract] int method(int a);
 * 
 * jdk 8 이후 추가된 멤버-> 구현부 가능
 * default 메소드: default int method(...){} -> 인스턴스 멤버
 * static 메소드: static int method(...){} -> 클래스 멤버
 */

interface Printerable {
	int INK = 100; // 상수: public final static 예약어 생략됨

	void print(); // 추상메소드: public abstract 생략됨-> 구현 클래스에서 반드시 오버라이딩 해야 함
}

interface Scannerable {
	void scan();
}

interface Faxable {
	String FAX_NO = "02-1111-2222";

	void send(String no);

	void receive(String no);
}

//다중 구현 클래스
class Complexer implements Printerable, Scannerable, Faxable {
	int ink;

	Complexer() {
		ink = INK;
	}

	@Override
	public void print() {
		System.out.println("프린트 출력. 남은 잉크량: " + --ink);
	}

	@Override
	public void scan() {
		System.out.println("이미지 스캔.");
	}

	@Override
	public void send(String no) {
		System.out.println(FAX_NO + "에서 " + no + " 로 FAX 보냄.");
	}

	@Override
	public void receive(String no) {
		System.out.println(no + "에서 " + FAX_NO + "로 FAX 받음.");
	}

}

public class InterfaceEx1 {

	public static void main(String[] args) {
		Complexer comp = new Complexer();
		// Faxable.FAX_NO="02-2222-3333" //static final 생략되어있기 때문에 상수 변경 불가
		// Printerable.INK=200; //변경 불가

		System.out.println("Faxable.FAX_NO= " + Faxable.FAX_NO); // static 상수
		System.out.println("Printerable.INK= " + Printerable.INK); // static 상수
		System.out.println("Complexer.FAX_NO= " + Complexer.FAX_NO); // static 상수
		System.out.println("Complexer.INK= " + Complexer.INK); // static 상수

		comp.print();
		comp.scan();
		comp.send("02-2222-3333");
		comp.receive("02-2222-3333");

		if (comp instanceof Printerable) {
			System.out.println("comp 객체는 Printable 형으로 형변환 가능");
			Printerable p = (Printerable) comp; // 형변환 연산자 생략 가능
			p.print();
			// p.scan(); 에러
			// p.send("02-2222-3333"); 에러
			// p.receive("02-2222-3333"); 에러
		}

		if (comp instanceof Scannerable) {
			System.out.println("comp 객체는 Scannerable 형으로 형변환 가능");
			Scannerable s = (Scannerable) comp; // 형변환 연산자 생략 가능
			// s.print(); 에러
			s.scan();

		}

		if (comp instanceof Faxable) {
			System.out.println("comp 객체는 Faxable 형으로 형변환 가능");
			Faxable f = (Faxable) comp; // 형변환 연산자 생략 가능

			f.send("02-2222-3333");
			f.receive("02-2222-3333");

			System.out.println("남은 잉크량: " + comp.ink);
			// System.out.println("남은 잉크량: "+f.ink); 에러

		}

	}

}
