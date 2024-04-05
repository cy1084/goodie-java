package chap4;

import java.util.Scanner;

//정수를 입력받아 각 자릿수의 합 출력
public class LoopEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int inNum = sc.nextInt();
		int num = inNum;
		int sum = 0;

		while (num > 0) {
			sum = sum + num % 10;
			num /= 10;
		}
		System.out.println(sum);

	}

}
