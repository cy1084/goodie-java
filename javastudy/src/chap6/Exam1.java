package chap6;

/*
 * Rectangle 클래스 구현
 * - 멤버필드: width, height
 * - 멤버메소드: void area()-> 넓이 출력/ void length()-> 둘레 출력
 * 
 * 구동 클래스 구현
 * - main 메소드를 가지고 있는 함수(main이 아닌 클래스엔 선언만 가능)
 * 
 * */

class Rectangle {
	int width = 0;
	int height = 0;

	void area() {
		System.out.println(width * height);
	}

	void length() {
		System.out.println((width + height) * 2);
	}
}


public class Exam1 {
	public static void main(String[] args) {
		Rectangle2 rect=new Rectangle2();
		rect.width=10;
		rect.height=5;
		rect.area();
		rect.length();
		
		// System.out.printf("넓이와 둘레: %d, %d",rect.area(),rect.length());

	}

}
