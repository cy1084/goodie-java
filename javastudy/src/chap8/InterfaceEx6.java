package chap8;

/*
 * jdk 8.0 이후에 인터페이스에 추가된 멤버(상수, 추상메소드 외에도) -> 구현부 존재 메소드
 * 
 * - default 메소드: 인스턴스 메소드/ 오버라이딩 해도 안해도 상관없지만 동일한 메소드가 있을 경우 반드시 오버라이딩 해야 함
 * - static 메소드: 클래스 메소드/ 다중 구현에서 동일한 메소드가 2개 이상이어도 상관 없음/ 호출: 인터페이스명.static메소드명 
 */

interface MyInterface1 {
	void method();

	default void method1() {
		System.out.println("MyInterface1의 default 메소드: method1");
	}

	static void staticMethod() {
		System.out.println("MyInterface1의 static 메소드: staticMethod");
	}
}

interface MyInterface2 {
	void method();

	default void method1() {
		System.out.println("MyInterface2의 default 메소드: method1");
	}

	static void staticMethod() {
		System.out.println("MyInterface2의s static 메소드: staticMethod");
	}
}

class Parent {
	public void method2() {
		System.out.println("Parent 클래스의 멤버 메소드: method2");
	}
}

class Child extends Parent implements MyInterface1, MyInterface2 {

	@Override
	public void method() { // 두개 상속받았다고 두번할 필요 없이 한번만 오버라이딩 해주면 됨
		System.out.println("Child 클래스에서 오버라이딩된 메소드: method");
	}

	public void method1() {
		System.out.println("Child 클래스에서 오버라이딩된 메소드: method1");

		MyInterface1.super.method1();
		MyInterface2.super.method1();
	}
}

public class InterfaceEx6 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.method1();
		// c.staticMethod();
		// Child.staticMethod();

		MyInterface1.staticMethod();
		MyInterface2.staticMethod();

	}

}
