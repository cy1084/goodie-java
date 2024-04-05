package chap10;

/*
 * 다중 catch
 * - 한 개의 try 블럭에 여러 개의 catch 블럭 존재
 * 	 => try 블럭에서 발생되는 예외 종류에 따라 다른 예외 처리 가능
 * - 상위 예외 클래스(Exception)는 catch 블럭 하단에 배치해야 함(순서 중요)
 * 
 * 예외 클래스 계층
 * Throwable > Error
 * 			   Exception > RuntimeException > ArithmeticException
 * 											  ArrayIndexOutOfBoundsException
 * 											  NumberFormatException
 * 											  ... 등
 * 						   그 외 Exception
 *  
 *  - Exception 중 RuntimeException(하위 클래스 포함) 예외 처리 생략 가능
 *    나머지는 예외 처리 필수
 * 			   
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
		System.out.print(1); // try 블럭 외부의 예외 발생은 catch 구문이 처리 못함

		try {
			System.out.print(2);
			// System.out.print(3/0); //ArithmeticException 예외 발생
			System.out.print(3);
			System.out.println(args[0]); // ArrayIndexOutOfBoundsException 예외 발생

			System.out.println(Integer.parseInt("123")); // NumberFormatException 예외 발생

			String str = null;
			System.out.println(str.trim()); // NullPointerException 예외 발생
			System.out.print(4);

		} catch (ArithmeticException e) {
			System.out.println("=> 0으로 나누지 마");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("=> 커맨드 라인에 파라미터를 입력하세요");
		} catch (NumberFormatException e) {
			System.out.println("=> 숫자만 입력");
		} catch (Exception e) {
			e.printStackTrace(); // 예외 발생 히스토리를 화면에 출력
			System.out.println("=> 전산부로 전화");
		}

		System.out.println(5);

	}

}
