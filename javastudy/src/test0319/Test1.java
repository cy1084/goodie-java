package test0319;

import java.util.Scanner;

/*
 * 화면에서 금액입력받아서 500,100,50,10,1원 동전으로 바꾸기.
 * 필요한 동전의 갯수 출력하기. 전체동전은 최소 갯수로 바꾼다.
 * [결과]
 * 금액을 입력하세요
 * 5641
 * 500원 : 11개
 * 100원 : 1개
 * 50원  : 0개
 * 10원 : 4개
 * 1원  : 1개
 */
public class Test1 {

	public static void main(String[] args) {
		System.out.println("금액을 입력하세요:");
		Scanner scan = new Scanner(System.in);
		int m1 = scan.nextInt();

		int m2 = m1 / 500; // 500원 짜리 동전 개수
		int m3 = (m1 % 500) / 100; // 100원 짜리 동전 개수
		int m4 = ((m1 % 500) % 100) / 50; // 50원 짜리 동전 개수, (m1%100)/50
		int m5 = (((m1 % 500) % 100) % 50) / 10; // 10원 짜리 동전 개수, (m1%50)/10
		int m6 = m1 % 10; // 1원 짜리 동전 개수

		System.out.println("500원: " + m2 + "개");
		System.out.println("100원: " + m3 + "개");
		System.out.println("50원: " + m4 + "개");
		System.out.println("10원: " + m5 + "개");
		System.out.println("1원: " + m6 + "개");
		System.out.println("동전의 총 개수는 " + (m2 + m3 + m4 + m5 + m6) + "개.");
	}

}
