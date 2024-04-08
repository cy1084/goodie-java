package chap11;

import java.util.Random;

/*
 * 1~10 임의의 수: (0~9)+1 -> (0~(10-1)) +1 -> (0~(큰-작))+작
 */
public class Exam6 {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(1, -3) + ",");
		}
		System.out.println();

		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(-1, 3) + ",");
		}

	}

	private static int getRand(int f, int t) {
		int min = Math.min(f, t);
		int max = Math.max(f, t);
		int cha = max - min;

		Random random = new Random();

		// 클래스 Random
		// return random.nextInt(cha + 1) + min; // (0~cha 값)+min

		// Math.random()
		return (int) (Math.random() * (cha + 1)) + min;

	}

}
