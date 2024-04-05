package chap4;

import java.util.Random;
import java.util.Scanner;

//while
//컴퓨터는 1~100 사이의 임의의 정수를 저장
//사용자는 컴퓨터의 숫자 맞추기
public class Exam9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int comNum = (int) (Math.random() * 100) + 1;
		int count = 0;

		while (true) {
			System.out.println("1~100 사이의 숫자를 입력하세요.");
			int userNum = scan.nextInt();
			count++;

			if (comNum > userNum) {
				System.out.println("업");
			} else if (comNum < userNum) {
				System.out.println("다운");
			} else {
				System.out.println("정답!");
				System.out.println("프로그램 종료.");
				break;
			}
		}

		if (count <= 5) {
			System.out.println("빠르시네요.");
		} else if (count <= 10) {
			System.out.println("보통입니다.");
		} else
			System.out.println("노력하세요.");
	}

}
