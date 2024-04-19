package chap7;

/*
 * super 예약어
 * super() 생성자
 * -> 자식 클래스에서 부모 클래스의 생성자 호출 시 사용(상속)
 * -> 자식 클래스의 생성자 첫 줄에 구현해야 함(this와 마찬가지)
 * -> 부모 클래스의 생성자 중 매개변수가 없는 생성자가 있다면 생략 가능: super()
 * -> 부모 클래스의 생성자 중 매개변수가 없는 생성자가 없다면 생략 '불'가능: super(...)
 * 
 * super 참조 변수
 * -> 부모 클래스의 객체를 참조하는 참조변수
 * -> 인스턴스 메소드에서만 사용 가능
 * */

class Parent {
	int x = 10;

	Parent() {
	}

	Parent(int x) {
		this.x = x;
	}
}

class Child extends Parent {
	int x = 20;

	Child() {
		// super();
		// 부모 클래스에 매개변수 없는 생성자가 있으므로 super() 생략해도 됨
		super(100);
	}

	void method() {
		int x = 30;
		System.out.println("x= " + x); // 30
		System.out.println("this.x= " + this.x); // 20
		System.out.println("super.x= " + super.x); // 부모로 바로, 100
	}

}

public class SuperEx1 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x); // 100
		// super(100) 없으면 x는 자식이 가지고 있는 값 20이 출력됨
		c.method();
	}

}
