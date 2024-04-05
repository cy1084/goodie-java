package chap5;

import java.util.Scanner;

//10진수를 16진수로 변환
//0 1 2 3 4 5 6 7 8 A B C D E F -> 정수형 배열 사용 불가
public class Exam2 {

	public static void main(String[] args) {
		char[] data = "012345678ABCDEF".toCharArray();
		char[] hex = new char[8];

		System.out.println("16진수로 변환할 10진수를 입력하세요");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int divNum = num;
		int index = 0;

		while (divNum > 0) {
			hex[index++] = data[divNum % 16];
			divNum /= 16;
		}

		System.out.print(num + "의 16진수:");

		for (int i = index - 1; i >= 0; i++)
			System.out.println(hex[i]);
		System.out.println();
		System.out.println("Integer 클래스를 이용한 16진수 변환");
		System.out.println(Integer.toHexString(num));

	}

}
