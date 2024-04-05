package chap5;

import java.util.Arrays;

//로또 번호 생성
public class arrEx3 {

	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		for (int b : balls)
			System.out.print(b + ", ");
		System.out.println();

		// balls 섞기, swap
		for (int i = 0; i <= 1000; i++) {
			int f = (int) (Math.random() * balls.length);
			int t = (int) (Math.random() * balls.length);

			int tmp = balls[f];
			balls[f] = balls[t];
			balls[t] = tmp;
		}
		for (int b : balls)
			System.out.print(b + ", ");
		System.out.println();

		// 로또 번호 저장하기 balls의 값 앞에서 6개
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = balls[i];
		}

		for (int b : lotto)
			System.out.print(b + ", ");
		System.out.println();

		// 로또 버블정렬하기
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - 1 - i; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int tmp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = tmp;
				}
			}

			System.out.println(i + ":");
			for (int b : lotto)
				System.out.print(b + ", ");
			System.out.println();

		}

		System.out.println();
		// Arrays 클래스를 이용한 정렬
		// 정렬 이전으로 로또 배열 변경
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = balls[i];
			Arrays.sort(lotto);
			for (int b : lotto)
				System.out.print(b + ", ");
			System.out.println();

		}

	}

}
