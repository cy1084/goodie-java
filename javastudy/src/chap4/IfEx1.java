package chap4;

import java.util.Scanner;

public class IfEx1 {

	// 정수 입력받아
	// 양수 음수 영 출력
	// 짝수 홀수 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else
			System.out.println("영");

	}

}
