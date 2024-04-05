package chap7;

/* 부모 클래스의 멤버와 자식 클래스의 멤버가 동일한 경우
 * 	멤버변수: 참조변수의 자료형(데이터 타입)을 따름
 * 	멤버메소드: 객체의 자료형 따름-> 객체의 최종 오버라이딩된 메소드를 호출
 * 
 * 
 * */
class Parent2 {
	int x = 10;

	void method() {
		System.out.println("Parent2.method()");
	}
}

class Child2 extends Parent2 {
	int x = 20;

	void method() {
		super.method(); // Parent2.method()

		System.out.println("Child2.method()");
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);
		System.out.println("super.x= " + super.x);
		System.out.println();
	}
}

public class BindingEx1 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
		System.out.println("c.x= " + c.x);

		Parent2 p = c;
		// Parent2 p = new Child2();
		p.method();
		System.out.println("p.x= " + p.x);

	}

}
