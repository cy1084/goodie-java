package chap6;

/*
 * 멤버변수: width(가로), height(세로), sNo(사각형 생성번호), cnt(생성번호를 위한 static 변수)
 * 멤버메소드: area()- 넓이 값 리턴/ length()- 둘레 값 리턴/ isSquare()- 정사각형 여부를 boolean 타입으로 리턴/ toString()- 사각형 정보 출력
 * */
public class Rectangle2 {
	int width, height, sNo;
	static int cnt;

	int area() {
		return width * height;
	}

	int length() {
		return (width + height) * 2;
	}

	boolean isSquare() {
		return width == height;
	}

	public String toString() {
		return sNo + "번 사각형=> (" + width + "," + height + "), 넓이:" + area() + ", 둘레:" + length() + ", "
				+ (isSquare() ? "정사각형" : "직사각형") + ", 생성된 사각형 개수:" + cnt;
	}

}
