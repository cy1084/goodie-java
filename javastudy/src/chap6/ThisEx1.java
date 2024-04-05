package chap6;

/*
 * this 예약어
 * this() 생성자: 클래스 내부의 생성자에서 다른 생성자 호출 시 사용되는 예약어
 * 				반드시 생성자 첫 줄에 구현
 * 
 * this 참조변수: 자기참조변수
 * 				현재 객체의 참조 값 저장
 * 				인스턴스 메소드에서만 사용 가능-> 인스턴스 메소드 내부에 지역변수로 선언됨
 * 				지역변수와 멤버변수가 같은 이름을 가진 경우 구분할 때 사용 할 수 있음
 * */
class Car5 {
	String color;
	int number;
	int sno;
	static int width = 200;
	static int height = 120;
	static int cnt;

	Car5(String color, int number) {
		this.color = color;
		this.number = number;
		sno = ++cnt;
		System.out.println("(String c, int n) 생성자 호출");
		System.out.println();
	}

	Car5(String color) {
		// color = c;
		// number = 1000;
		// sno = ++cnt;
		this(color, 1000); // -> Car4(String c, int n) 생성자 호출
		System.out.println("(String c) 생성자 호출");
		System.out.println();
	}

	Car5(int n) {
		// color = "white";
		// number = n;
		// sno = ++cnt;
		this("white", n); // -> Car4(String c, int n) 생성자 호출
							// this 생성자 호출 전엔 어떠한 것도 쓸 수 없음
		System.out.println("(int n) 생성자 호출");
		System.out.println();

	}

	public String toString() {
		return this.sno + "번 자동차: " + this.color + ", " + this.number + "(" + Car5.width + "," + Car5.height + ")";
	}
}

public class ThisEx1 {
	public static void main(String[] args) {
		Car5 c1 = new Car5("white", 1234);
		Car5 c2 = new Car5("black");
		Car5 c3 = new Car5(2000);

	}

}
