package chap8;

/*
 * 람다식(함수 객체)
 * - jdk8 이후부터 사용 가능
 * - 람다식으로 사용되는 인터페이스는 FunctionalInterface이어야 함
 * 
 * 추상메소드의 매개변수, 리턴 값이 없는 경우
 * ()->{....}
 */

@FunctionalInterface // 추상메소드가 한개인 인터페이스
interface LambdaInterface1 {
	void method();
}

public class LambdaEx1 {
	public static void main(String[] args) {
		// 인터페이스는 객체화 불가-> 익명 객체 방식(람다 이전 방식)으로 가능

		LambdaInterface1 f1 = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("익명 객체 방식으로 코딩");
			}
		};

		f1.method();
		// 람다 방식 코딩
		LambdaInterface1 f2 = () -> {
			System.out.println("1. 람다방식으로 코딩");
		};

		f2.method();
		// 람다 방식 코딩 시 내용이 한줄인 경우 {} 생략 가능

		f2 = () -> {
			System.out.println("2. 람다방식으로 코딩");
		};
		f2.method();
		execute(() -> System.out.println("execute 메소드로 실행"));

		// 1~100까지의 합을 execute 메소드로 출력
		execute(() -> {
			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				sum += i;
			}
			System.out.println(sum);
		});
	}

	static void execute(LambdaInterface1 f) {
		f.method();
	}
}
