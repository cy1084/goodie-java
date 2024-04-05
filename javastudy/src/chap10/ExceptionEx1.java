package chap10;
/*
 * 예외 처리
 *	- 발생한 예외를 정상화 하는 기능(있는 예외 제거)
 *
 *	- try{ } 								=> 예외 발생 가능성 있는 구문
 *	  catch(예외타입 참조변수){ }  -> 생략 가능	=> 예외 발생 시 호출되는 블럭
 *	  finally{ }			   -> 생략 가능	=> 정상이든 예외든 꼭 실행하는 블럭
 *
 *	- throws 선언: 호출한 메소드로 전송 
 *
 * 예외 발생
 *  - 정상 상태를 예외 상태로 변환(없는 예외 생성)
 *  - throw 구문: throws와 반대, 예외 강제 발생
 */

public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터 값을 입력하세요. ");
		}

	}

}
