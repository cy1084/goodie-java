package chap7;

/*
 * final 변수
 * - 변경 불가 변수, 상수
 * - 명명규칙: 언더바(snake 방식), 대문자
 * 
 */

class FinalValue {
	final int NUM;
	static final int MAX;

	// static -> 프로그램 시작하면 바로 준비 완료!
	static {
		MAX = (int) (Math.random() * 100); // static 초기화 블럭 사용해 실행할 때마다 다른 상수값
	}

	FinalValue(int num) {
		NUM = num; // 명시적 초기화(직접 초기화)가 안된 경우 생성자에서 한 번은 초기화 가능
		// 생성자는 객체와 관련있다 객체화할 때마다 생성자 호출하므로.
		// 객체마다 다른 상수값으로 초기화 하게 하기 위해 생성자에서 한 번은 초기화 가능할 수 있게
	}
}

public class FinalValueEx1 {
	public static void main(String[] args) {
		final int NUM = 100; // 대문자
		// NUM=200; //에러-> 변경불가

		final int MAX; // 초기화 하지 않으면 한번은 변경(초기화) 가능
		MAX = 200;
		// MAX=300; //에러

		FinalValue fv1 = new FinalValue(10);
		FinalValue fv2 = new FinalValue(20);

		System.out.println(fv1.NUM);
		System.out.println(fv2.NUM);

		// fv1.NUM = 100; 에러, 변경불가
		// fv2.NUM = 200;

		System.out.println();
		final int[] arr = { 10, 20, 30, 40, 50 };
		for (int a : arr) {
			System.out.print(a + ", "); // 10 20 30 40 50
		}
		System.out.println();

		arr[0] = 100;
		arr[1] = 200;
		for (int a : arr) {
			System.out.print(a + ", "); // 100 200 30 40 50
		}
		System.out.println();

		// arr=new int[] {100,200,300};
		// 에러-> arr 참조변수에 새로운 객체 참조 불가

	}

}
