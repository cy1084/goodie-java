package chap7;

/*
 * 추상 클래스
 * - 추상 메소드를 멤버로 가질 수 있는 클래스 -> abstract 예약어
 * - 직접 객체화 불가!-> '상속'으로 자식 클래스의 객체화를 통한 객체화는 가능
 * - 그 외에는 일반 클래스와 동일(생성자, 멤버변수, 멤버메소드, 초기화블록, 상속 등) 
 * 
 * 
 * 추상 메소드
 * - 메소드의 선언부만 존재, 구현{} x
 * - 자식 클래스에서 반드시 오버라이딩 필요! 
 */

abstract class Shape { // 추상 클래스
	String type;

	Shape(String type) {
		this.type = type;
	}

	abstract double area(); // 추상 메소드: 하위 클래스에서 반드시 오버라이딩!!

	abstract double length(); // 추상 메소드

	public String toString() {
		return type;
	}
}

class Circle extends Shape {
	int r;

	Circle(int r) {
		super("원");
		this.r = r;
	}

	@Override
	double area() {
		return r * r * Math.PI;
	}

	@Override
	double length() {
		return 2 * r * Math.PI;
	}

	public String toString() {
		return super.toString() + ": 반지름= " + r + ", 넓이=" + area() + ", 둘레=" + length();
	}
}

class Rectangle extends Shape {
	int width;
	int height;

	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height;
	}

	@Override
	double length() {
		return 2 * (width + height);
	}

	public String toString() {
		return super.toString() + ": 가로= " + width + ", 세로= " + height + ", 넓이=" + area() + ", 둘레=" + length();
	}
}

public class AbstractEx1 {
	public static void main(String[] args) {

		// Shape s=new Shape("도형");
		// 추상 클래스 객체화 불가

		Shape[] sarr = new Shape[2];
		sarr[0] = new Circle(10);
		sarr[1] = new Rectangle(10, 10);
		// Shape c=new Circle(10);
		// Shape r=new Rectangle(10);

		// 전체 도형의 면적의 합, 둘레의 합 출력
		int totArea = 0;
		int totLength = 0;

		for (Shape s : sarr) {
			totArea += s.area();
			totLength += s.length();
		}

		System.out.println("전체 도형의 면적의 합: " + totArea);
		System.out.println("전체 도형의 둘레의 합: " + totLength);

		System.out.println();
		// 각 도형의 멤버변수 출력
		// 형 변환

		// #1
		for (Shape s : sarr) {
			System.out.println(s);
		}

		System.out.println("==============================================================");
		// #2
		for (Shape s : sarr) {
			System.out.print(s.type + ":");

			if (s instanceof Circle) {
				Circle c = (Circle) s;
				System.out.print("반지름= " + c.r);
			}
			if (s instanceof Rectangle) {
				Rectangle r = (Rectangle) s;
				System.out.print("가로= " + r.width + ", 세로= " + r.height);
			}
			System.out.println(", 넓이= " + s.area() + ", 둘레= " + s.length());
		}

	}

}
