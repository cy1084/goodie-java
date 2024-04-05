package chap4;

import java.util.Scanner;

//화면에서 999 숫자가 입력될 때 까지 숫자를 입력받아, 입력받은 수의 합 출력 
public class Exam10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;

		while (true) {
			System.out.println("숫자를 입력하세요.");
			int num = scan.nextInt();

			if (num == 999) {
				System.out.println("종료!");
				break;
			}
			sum = sum + num;
		}
		System.out.println("합은: " + sum);
	}

}
