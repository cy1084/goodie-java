package chap10;

/*
 * finally 블럭: try 블럭에서 정상/예외 모두 실행되는 블럭
 * 정상: 12356
 * 2/0 예외: 1456
 * 정상 return: 1235
 */

public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2);
			System.out.print(3);
			return; // 메소드 종료
		} catch (Exception e) {
			System.out.print(4);
		} finally {
			System.out.print(5);
		}

		System.out.println(6);
	}

}
