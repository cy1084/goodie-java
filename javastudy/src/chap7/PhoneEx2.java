package chap7;

/*
 * 자식 클래스의 객체 생성 시부모 클래스의 객체 생성을 먼저 함
 * -> 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출 해야 함
 * -> 부모 클래스에 매개변수가 없는 생성자가 없다면, 자식 클래스의 생성자에서 super(매개변수 값)를 직접 호출 해야 함
 * -> 부모 클래스에 매개변수가 없는 생성자가 있다면, 자식 클래스의 생성자에서 super()를 생략할 수 있음
 * */
class Phone2 {
	boolean power;
	int num;

	Phone2() {
	}

	Phone2(int num) {
		this.num = num;
	}
}

class SmartPhone2 extends Phone2 { // 기본 생성자
	SmartPhone2() {
		super(); // 부모 클래스의 생성자 호출, 매개변수 없는 생성자
		// super(1234);
	}

	void setApp(String name) {
		System.out.println(name + "앱 설치");
	}
}

public class PhoneEx2 {
	public static void main(String[] args) {
		SmartPhone2 sp = new SmartPhone2();
		System.out.println(sp.num);
	}

}
