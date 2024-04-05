package test0319;

import java.util.Scanner;

//  반지름을 입력받아 원의 둘레와 면적을 소숫점이하 2자리로 출력하기
public class Test6 {
	public static void main(String[] args) {
		double pi = 3.141592;

		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 입력: ");
		int r = sc.nextInt();
		double a = 2.0 * pi * r; // 원의 둘레
		double b = pi * r * r; // 원의 면적

		// System.out.printf("원의 둘레: %.2f\n ",a);
		// System.out.printf("원의 면적: %.2f ",b);

		System.out.println((int) (a * 100) / 100.0);

		System.out.println((int) (b * 100) / 100.0);
		// b*100 int 형으로 바꿔주기
		// 나누기 100 하면 다시 소수점 출력
	}
}
