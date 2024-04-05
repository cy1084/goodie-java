package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 ");
		int num;

		while (true) {
			try {
				num = sc.nextInt();
				for (int i = 1; i <= num; i++) {
					System.out.print("*");
				}
				System.out.println();
				break;

			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요");

				// sc.next();
				// 모든 입력된 값 다 읽음
				// 이거 안써주면 숫자가 아닌 입력된 값 num이 처리가 안되기 때문에
				// 23번 라인이 무한반복됨
				// 숫자가 아닌 값 num을 버리고 다시 위로 올라가 새로운 값을 받기 위함

				System.out.println(sc.next() + "는 숫자가 아닙니다. 숫자만 입력하세요.");
			}
		}
	}

}
