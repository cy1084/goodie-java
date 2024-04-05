package chap10;
/*
 * throws: 발생된 예외를, 호출한 메소드로 전달
 */

public class ExceptionEx4 {
	public static void main(String[] args) {
		System.out.println("main 메소드 실행");
		try {
			first();
		} catch (NumberFormatException e) {
			System.out.println("main 메소드에서 예외처리 함");
			throw e; // 더이상 호출한 메소드가 없으므로 jvm으로 넘어감
		}

	}

	private static void first() {
		System.out.println("first 메소드 실행");
		second();

	}

	private static void second() {
		System.out.println("second 메소드 실행");
		// int num = Integer.parseInt("abc");
		// System.out.println(num);

		try {
			int num = Integer.parseInt("abc");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("second 메소드에서 예외처리 함");
			throw e; // 다시 예외 발생시킴
		}

	}

}
