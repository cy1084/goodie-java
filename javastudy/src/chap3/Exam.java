package chap3;

import java.util.Scanner;

//키보드에서 초를 입력받아 몇 시간 몇 분인지 출력
//초 입력
//3662
//1시간 1분 2초
public class Exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하세요: ");
		int second = sc.nextInt();

		int h = second / 3600;
		int m = (second % 3600) / 60;
		// int s=((second%3600)%60);
		int s = second % 60;

		System.out.println(h + "시간 " + m + "분 " + s + "초.");

	}

}
