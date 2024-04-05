package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 1. 화면에서 1~10 사이의 숫자를 입력받아 숫자만큼 * 출력
 * 2. 입력된 숫자가 1~10이 아니면 Exception 예외 강제 발생
 * 3. 숫자가 입력이 안된 경우 숫자가 입력될 때까지 계속 입력 
 * 
 */
public class Exam3 {
	public static void main(String[] args) throws Exception {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 ");

		while (true) {
			try {
				num = sc.nextInt();
				if (num > 10 || num < 1) {
					throw new Exception("1~10 사이의 숫자만 입력하세요");
				}
				for (int i = 1; i <= num; i++) {
					System.out.print("*");
				}
				System.out.println();
				break;

			} catch (InputMismatchException e) {
				System.out.println(sc.next() + "는 숫자가 아닙니다. 숫자만 입력하세요.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
