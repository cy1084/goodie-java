package chap8;

import java.util.Scanner;

/*
 * 추상메소드의 매개변수가 있고, 리턴 타입이 없는 경우
 * (매개변수)->{...}
 * 매개변수가 한개인 경우 () 생략 가능
 * 실행 구문의 문장이 한개인 경우 {} 생략 가능
 */
interface LambdaInterface2 {
	void method(int a);

}

public class LambdaEx2 {
	public static void main(String[] args) {
		LambdaInterface2 f = (i) -> {
			System.out.println(i * 5);
		};
		f.method(5); // 25
		// f.method("a"); 에러

		f = i -> System.out.println(i + i);
		f.method(10); // 20

		// calc 함수
		calc(f, 50);

		f = (num) -> {
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				sum += i;
			}

			System.out.println("합: " + sum);
		};

		// calc 함수를 이용하여 입력된 숫자까지의 합을 출력
		calc(f, 4); // 10
		calc(f, 10); // 55
		calc(f, 100); // 5050
	}

	private static void calc(LambdaInterface2 f, int num) {
		f.method(num);
	}

}
