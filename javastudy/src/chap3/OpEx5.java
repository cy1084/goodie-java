package chap3;

import java.util.Scanner;

public class OpEx5 {
	// 삼항 연산자-> 항 3개
	// 조건문?참:거짓
	// 점수를 입력받아 60미만이면 불합격, 60이상이면 합격 출력
	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in); System.out.print("점수 입력: "); int
		 * score=sc.nextInt();
		 * 
		 * System.out.println(score+"점=> "+((score>=60)?"합격":"불합격"));
		 * 
		 */
		// 70이상이면 통과, 60이상이면 재시험, 60미만이면 탈락 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력: ");
		int score = sc.nextInt();
		System.out.println(score + "점=> " + ((score >= 70) ? "통과" : (score >= 60) ? "재시험" : "불합격"));

	}

}
