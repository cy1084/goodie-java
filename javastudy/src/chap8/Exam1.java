package chap8;

/*
 * LambdaInterface1 이용하여 1~100까지의 짝수의 합과 홀수의 합 출력
 */

public class Exam1 {
	public static void main(String[] args) {
		LambdaInterface1 f = new LambdaInterface1() {

			@Override
			public void method() {
				int sum = 0;
				for (int i = 0; i <= 100; i += 2)
					sum += i;
				System.out.println("1~100까지의 짝수합:" + sum);
			}
		};
		f.method();
		f = new LambdaInterface1() {
			@Override
			public void method() {
				int sum = 0;
				for (int i = 1; i <= 100; i += 2)
					sum += i;
				System.out.println("1~100까지의 홀수합:" + sum);
			}
		};
		f.method();
		// 람다방식
		f = () -> {
			int sum = 0;
			for (int i = 2; i <= 100; i += 2)
				sum += i;
			System.out.println("1~100까지의 짝수합:" + sum);
		};
		f.method();
		f = () -> {
			int sum = 0;
			for (int i = 1; i <= 100; i += 2)
				sum += i;
			System.out.println("1~100까지의 홀수합:" + sum);
		};
		f.method();
		f = () -> {
			int esum = 0, osum = 0;
			for (int i = 1; i <= 100; i++) {
				if (i % 2 == 0)
					esum += i;
				else
					osum += i;
			}
			System.out.println("1~100까지의 짝수합:" + esum);
			System.out.println("1~100까지의 홀수합:" + osum);
		};
		f.method();

	}

}
