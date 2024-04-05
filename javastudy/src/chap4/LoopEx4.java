package chap4;

import java.util.Scanner;

public class LoopEx4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int comNum = (int) (Math.random() * 100) + 1;
		int userNum = 0;

		do {

			System.out.println("1~100 사이의 숫자를 입력하세요.");
			userNum = scan.nextInt();

			if (comNum > userNum) {
				System.out.println("업");
			} else if (comNum < userNum) {
				System.out.println("다운");
			}

		} while (userNum != comNum);
		System.out.println("정답!");
		System.out.println("프로그램 종료.");

	}
}
