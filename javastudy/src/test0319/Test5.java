package test0319;

import java.util.Scanner;

/*
 * 밑변과 높이를 입력받아 삼각형의 넓이를 출력하기. 소숫점을 표시
 * [결과]
 * 밑변의 길이
 * 10
 * 높이의 길이
 * 20
 * 
 * 넓이=10*20 / 2
 */
public class Test5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("밑변의 길이");		
		int b=sc.nextInt();
		System.out.println("높이의 길이");		
		int h=sc.nextInt();
		
		System.out.println("넓이= "+ "("+b+"*"+h+")"+"/2"); 
		//정수 정수가 아닌 경우 소수점이 없어질 수 있기 때문에 조심
		//System.out.println("넓이= "+ "("+b+"*"+h+")"+"/2.0");

	}
}
