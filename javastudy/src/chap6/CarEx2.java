package chap6;

class Car4 {
	String color;
	int number;
	int sno;
	static int width = 200;
	static int height = 120;
	static int cnt;

	Car4(String c, int n) {
		color = c;
		number = n;
		sno = ++cnt;
	}

	Car4(String c) {
		color = c;
		number = 1000;
		sno = ++cnt;
	}

	Car4(int n) {
		color = "white";
		number = n;
		sno = ++cnt;
	}

	public String toString() {
		return sno + "번 자동차: " + color + ", " + number + "(" + width + "," + height + ")";
	}
}

public class CarEx2 {
	public static void main(String[] args) {
		Car4 c1 = new Car4("white", 1234);
		System.out.println(c1);

		Car4 c2 = new Car4("black");
		System.out.println(c2);

		Car4 c3 = new Car4(2000);
		System.out.println(c3);

	}

}
