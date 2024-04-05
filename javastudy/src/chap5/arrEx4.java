package chap5;

import java.util.Scanner;

//10진수를 입력받아 2진수로 변환하기
public class arrEx4 {
	public static void main(String[] args) {
		int[] binary = new int[32];
		System.out.println("2진수로 변환할 10진수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int divNum = num;
		int index = 0;

		while (divNum > 0) {
			binary[index++] = divNum % 2;
			divNum /= 2;
		}

		System.out.print(num + "의 2진수: ");

		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();

	}
}
