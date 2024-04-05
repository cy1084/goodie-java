package chap3;

import java.util.Scanner;

//화면에서 3자리 자연수를 입력받아 100자리 미만 버리고 출력
public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 자리 자연수 입력: ");
		int a = sc.nextInt();
		System.out.println(a - (a % 100));
		System.out.println((a / 100) * 100);

	}

}
