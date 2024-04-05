package chap6;

class Rectangle3 {
	int width, height, sno;
	static int cnt;

	Rectangle3(int w, int h) {
		width = w;
		height = h;
		sno = ++cnt;
	}

	int area() {
		return width * height;
	}

	int length() {
		return (width + height) * 2;
	}

	boolean isSquare() {
		return width == height;
	}

	// 1번사각형=>(10,20),넓이:200,둘레:60,직사각형,생성된 사각형 갯수:1
	public String toString() {
		return sno + "번사각형=>(" + width + "," + height + "),넓이:" + area() + ",둘레:" + length() + ","
				+ (isSquare() ? "정사각형" : "직사각형") + ",생성된 사각형 갯수:" + cnt;
	}
}

public class Exam2 {
	public static void main(String[] args) {
		Rectangle3 r = new Rectangle3(10, 20);
		System.out.println(r);
		Rectangle3 r2 = new Rectangle3(20, 20);
		System.out.println(r2);
	}
}