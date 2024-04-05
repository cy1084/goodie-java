package chap7;

/*
 * 다형성
 * - 자식 클래스의 객체를 부모 클래스 형의 참조변수로 참조 가능-> 반대는 안됨
 * - 부모 타입의 참조변수로 자식 클래스의 객체 참조 시 부모 타입의 멤버들만 접근 가능
 * - 오버라이딩된 메소드는 부모 타입의 참조변수로 호출 가능, 최종 오버라이딩된 메소드가 호출
 * - 모든 클래스의 객체는 Object 객체 포함
 * 		-> 모든 클래스의 객체는 Object 타입으로 참조 가능
 * - 모든 클래스의 참조변수 타입으로 Object 멤버를 호출 가능
 */

class Bike2 {
	int wheel;

	Bike2(int wheel) {
		this.wheel = wheel;
	}

	void drive() {
		System.out.println("페달 밟기");
	}

	void stop() {
		System.out.println("브레이크 잡기");
	}
}

class EvBike2 extends Bike2 {
	boolean power;

	EvBike2() {
		super(2);
	}

	void power() {
		power = !power;
	}

	@Override
	void drive() {
		System.out.println("출발 버튼 누르기");
	}
}

public class BikeEx2 {
	public static void main(String[] args) {
		EvBike2 ev = new EvBike2();
		Bike2 bike = null;
		ev.power();
		ev.drive();
		bike = (Bike2) ev; // 형변환
		bike.drive();
		// bike.power(); 에러

		Object o = bike;
		// Object는 Bike2가 가지고 있는 변수들을 알 수 없음
		// o.power(); 오류
		// o.drive(); 오류
		// o.stop(); 오류

		System.out.println(ev.toString());
		// toString() 메소드는 Object 멤버
		System.out.println(bike.toString());
		System.out.println(o.toString());
	}

}
