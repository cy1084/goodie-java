package chap11;

/*
 * Math 클래스(간단히)
 * - 수치계산관련 메소드 멤버로 가짐, 상수 PI(원주율) E(자연로그)
 * - final 클래스
 * - 생성자의 접근제한자가 private -> 객체 생성 불가
 * 		=> 모든 멤버 static
 */

public class MathEx1 {
	public static void main(String[] args) {
		// abs: 절댓값
		System.out.println(Math.abs(-5)); // 5

		// ceil,floor,rint(근사정수)

		// ceil 큰 근사정수
		System.out.println(Math.ceil(5.4)); // 6
		System.out.println(Math.ceil(-5.4)); // -5

		// floor 작은 근사정수
		System.out.println(Math.floor(5.4)); // 5
		System.out.println(Math.floor(-5.4)); // -6

		// rint 가장 가까운 정수
		System.out.println(Math.rint(5.4)); // 5
		System.out.println(Math.rint(-5.4)); // -5

		// max, min 최대최소
		System.out.println(Math.max(5, 4));
		System.out.println(Math.min(5, 4));

		// round() 반올림- 정수값 리턴
		System.out.println(Math.round(5.4)); // 5
		System.out.println(Math.round(5.5)); // 6

		// random() 난수 0<=x<1
		System.out.println(Math.random());
		
		//sin() cos() tan() 삼각함수- 라디안 단위
		System.out.println(Math.sin(Math.PI/2));
		System.out.println(Math.cos(Math.PI/2));
		System.out.println(Math.tan(Math.PI/4));
		
		//제곱근
		System.out.println(Math.sqrt(25));
		
		//제곱
		System.out.println(Math.pow(5, 3));

	}

}
