package chap4;

import java.util.Scanner;

//숫자형 문자열 입력받아 각 자릿수의 합 출력

public class Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String in1 = sc.next();

		// 첫번째 숫자 in1.charAt(0)

		int sum = 0;
		for (int i = 0; i < in1.length(); i++) {
			System.out.print(in1.charAt(i) + (i == in1.length() - 1 ? "=" : "+"));
			sum = sum + in1.charAt(i) - '0';
			// 문자형을 정수형으로 형변환 하게 되면 아스키 코드 값으로 변하는데
			// 그래서 아스키 코드 값이 48인 '0'을 빼는 것
			// 따라서 (charAt(int i) - '0')을 하게 되면 원하는 정수형 숫자를 얻게 됨

		}
		System.out.println(sum);

	}

}
