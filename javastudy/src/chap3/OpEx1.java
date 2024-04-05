package chap3;

import java.util.Scanner;

public class OpEx1 {

	// 단항 연산자: 연산자의 피연산자가 한 개인 경우
	// 논리부정연산자, 부호연산자, 형변환연산자
	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		y = ++x;
		System.out.println(x + ", " + y);

		y = x++;
		System.out.println(x + ", " + y);

		y = ++x;
		System.out.println(x + ", " + y);

		int x1 = 10;
		// ++연산자 사용하여 x1=10 나오도록 코딩
		System.out.println(x1++);

		// --연산자 사용하여 x1=10 나오도록 코딩
		System.out.println(--x1);

		// 화면에서 정수를 입력받아 x=입력받은 수로 나오게 코딩
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력:");
		x1 = sc.nextInt();
		System.out.println("x1=" + x1);
		System.out.println("x1=" + x1++);
		System.out.println("x1=" + --x1);
	}

}
