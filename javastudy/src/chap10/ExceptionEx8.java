package chap10;

class Parent{
	protected void method() throws RuntimeException{
		System.out.println("Parent 클래스의 method");
	}
}

class Child extends Parent{
	protected void method() throws RuntimeException{
		System.out.println("Child 클래스의 method");
	}
}

public class ExceptionEx8 {
	public static void main(String[] args) {
		new Child().method();

	}

}
