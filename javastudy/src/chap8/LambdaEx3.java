package chap8;

/*
 * 매개변수와 리턴 값 모두 있는 경우
 */

interface LambdaInterface3 {
	int method(int x, int y);
}

public class LambdaEx3 {
	public static void main(String[] args) {
		LambdaInterface3 f = (x, y) -> {
			return x + y;
		};
		System.out.println("두 수의 합: " + f.method(2, 5));

		f = (x, y) -> x * y;
		System.out.println("두 수의 곱: " + f.method(2, 5));

		f = (x, y) -> x / y;
		System.out.println("두 수의 나누기: " + f.method(5, 2));

		f = (x, y) -> x % y;
		System.out.println("두 수의 나머지: " + f.method(5, 2));

		f = (x, y) -> x > y ? x : y;
		System.out.println("두 수 중 큰 수: " + f.method(2, 5));

		f = (x, y) -> x < y ? x : y;
		System.out.println("두 수 중 작은 수: " + f.method(2, 5));

	}

}
