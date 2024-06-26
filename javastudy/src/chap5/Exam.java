package chap5;

import java.util.Scanner;

//10진수 입력받아 8진수로 변환하기
public class Exam {

	public static void main(String[] args) {
		int[] octal = new int[32];
		System.out.println("8진수로 변환할 10진수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int divNum = num;
		int index = 0;

		while (divNum > 0) {
			octal[index++] = divNum % 8;
			divNum /= 8;
		}

		System.out.print(num + "의 8진수: ");

		for (int i = index - 1; i >= 0; i--) {
			System.out.print(octal[i]);
		}

		System.out.println();
		System.out.println("2진수 변환: " + Integer.toBinaryString(num));
		System.out.println("8진수 변환: " + Integer.toOctalString(num));
	}

}
