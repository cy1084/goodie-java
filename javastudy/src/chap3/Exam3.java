package chap3;

import java.util.Scanner;

public class Exam3 {

	// 숫자를 입력받아 양수인 경우 양수, 음수인 경우 음수, 0인 경우 0 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		int num = sc.nextInt();
		System.out.println(num + "=> " + ((num < 0) ? "음수" : (num > 0) ? "양수" : " 영"));

	}

}
