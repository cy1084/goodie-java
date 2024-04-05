package chap3;

public class OpEx3 {
//산술연산자
	public static void main(String[] args) {
		int x = 10, y = 8;
		double d = x / y;
		System.out.println(d); // 1.0
		System.out.println(10.0 / 8); // 1.25
		System.out.println(10 / 8); // 1
		System.out.println(10 % 8); // 2 -> 나머지 값을 구할 땐 10의 값(나눌 수) 따라감
		System.out.println(-10 % 8); // -2
		System.out.println(10 % -8); // 2
		System.out.println(-10 % -8); // -2

	}

}
