package chap7;
/*
 * 오버라이딩
 * - 상속 관계에서 나타남/ 메소드의 재정의
 * - 부모 클래스의 메소드를 자식 클래스에서 재정의
 * - 부모 클래스의 메소드와 선언부가 동일해야 함
 * 		[접근제어자] 리턴타입 메소드명(매개변수 목록) 예외처리
 * 	 단, 접근제어자의 경우 넓은 범위는 가능
		 예외처리의 경우 좁은 범위로 가능
 */

class Bike {
	int wheel;

	Bike(int wheel) {
		this.wheel = wheel;
	}

	String drive() {
		return "페달 밟기";
	}

	String stop() {
		return "브레이크 잡기";
	}
}

class EvBike extends Bike {
	boolean power;

	EvBike() {
		super(2);
	}

	void power() {
		power = !power;
	}

	@Override // 어노테이션
	String drive() { // 메소드 재정의
		return "출발 버튼 누르기";
	}
}

public class OverridingEx1 {
	public static void main(String[] args) {
		EvBike ev = new EvBike();
		System.out.println(ev.drive());
		System.out.println(ev.stop());

		System.out.println();
		Bike bike = new Bike(2);
		System.out.println(bike.drive());
		System.out.println(bike.stop());

	}

}
