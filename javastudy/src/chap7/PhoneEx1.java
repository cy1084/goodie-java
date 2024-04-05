package chap7;
/*
 * 상속: extends/ is a 관계
 * 상위 클래스: 부모, 조상, super, parent, base 클래스 등
 * 하위 클래스: 자식, 자손, child, sub 클래스 등
 * 
 * 객체 생성 시 상위 클래스의 객체 먼저 생성- 내 안에 부모 있다
 * 단일 상속만 가능(자식 입장에서 한 부모)
 * 모든 클래스는 Object 클래스를 상속 받음 extends Object
 * -> 모든 클래스의 객체는 Object 객체 포함
 * -> 모든 클래스의 객체는 Object 객체의 멤버 호출 가능
 */

class Phone {
	boolean power;
	int num;

	void power() {
		power = !power;
	}

	void send() {
		if (power) {
			System.out.println("전화걸기");
		}
	}

	void receive() {
		if (power) {
			System.out.println("전화받기");
		}
	}

}

//부모 멤버 접근 가능
class SmartPhone extends Phone {
	void setApp(String name) {
		System.out.println(name + "앱 설치");
	}
}

public class PhoneEx1 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("카카오");
	}

}
