package test0327;
/*
 * 원(Circle) 클래스 구현하기
 *  1. 멤버변수
 *       반지름(r),원의번호(no)
 *       원의번호 생성 변수 count
 *  2. 생성자 : 구동 클래스에 맞도록 설정하기     
 *  3. 멤버메서드
 *     (1) double area()  : 원의 넓이 리턴. Math.PI 상수 사용
 *     (2) double length(): 원의 둘레 리턴. Math.PI 상수 사용
 *     (4) void scale(double m): 반지름을 m배 확대/축소. r=r*m
 *     (5) String toString() :
 *         1번원 : 반지름:100, 넓이:314.xxx, 둘레:xxx.xxx
 *         ... */

class Circle {
	int r;
	int no;
	int count;

	Circle(int num) {
		r = num;
		no=count++;
	}

	double area() {
		return Math.PI * r * r;
	}

	double length() {
		return 2 * Math.PI * r;
	}

	void scale(double m) {
		System.out.println(r*m);
	}

	public String toString() {
		return no+ "번 원=> "+" 반지름:" +r+", 넓이: "+ area()+", 둘레: "+length();
	}
}

public class Test4 {
	public static void main(String[] args) {
		Circle[] Car4 = new Circle[3];
		Car4[0] = new Circle(100);
		Car4[1] = new Circle(10);
		Car4[2] = new Circle(1);
		
		for (Circle c : Car4) {
			System.out.println(c);
			System.out.println();

			c.scale(3);
			System.out.println();
			
			System.out.println(c);
		}
	}
}
