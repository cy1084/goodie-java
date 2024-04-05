package chap10;
/*
 * throws: 예외 처리
 * throw: 예외 발생
 */

public class ExceptionEx5 {
	public static void main(String[] args) throws Exception {
		first();
	}

	private static void first() throws Exception {
		second();
	}

	private static void second() throws Exception {
		Thread.sleep(10);
		// InterruptedException은 그 외 exception으로 예외 처리 생략 불가

		throw new Exception("예외 강제 발생");
	}

}
